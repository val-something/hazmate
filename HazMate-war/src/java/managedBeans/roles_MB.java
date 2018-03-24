/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedBeans;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import entities.*;
import javax.ejb.EJB;
import ejb.DbRoleFacadeLocal;
import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author alan8
 */
@Named(value = "roles_MB")
@SessionScoped
public class roles_MB implements Serializable {

    @EJB
    private DbRoleFacadeLocal dbRoleFacade;
    private List<DbRole> listDbRole;
    private DbRole roleObject = new DbRole();
    private String strStatus;
    private List listDbUser;

    public roles_MB() {

    }

    public List<DbRole> getListDbRole() {
        return listDbRole;
    }

    public void setListDbRole(List<DbRole> listDbRole) {
        this.listDbRole = listDbRole;
    }

    public DbRole getRoleObject() {
        return roleObject;
    }

    public void setRoleObject(DbRole roleObject) {
        this.roleObject = roleObject;
    }

    public String getStrStatus() {
        return strStatus;
    }

    public void setStrStatus(String strStatus) {
        this.strStatus = strStatus;
    }

    @PostConstruct
    public void init() {
        listDbRole = dbRoleFacade.findAll();
    }

    public String add() {
        if (duplicateValidations()) {
            error1();
            return null;
        }
        Short roleStatus = Short.parseShort(strStatus);
        roleObject.setRoleStatus(roleStatus);
        dbRoleFacade.create(roleObject);
        roleObject = new DbRole();      //re-initialise roleObject for future calls of this method
        init();     //Update listDbRole so that the newly created role appears in the roles table
        return "viewRole";
    }

    public void delete(DbRole roleObject) {
        listDbUser = dbRoleFacade.checkUser(roleObject.getRoleId());
        if (listDbUser.isEmpty()) {
            dbRoleFacade.remove(roleObject);
        } else {
            error();
            return;
        }
        init();
    }

    public String edit(DbRole roleObject) {
        this.roleObject = roleObject;
        strStatus = Short.toString(this.roleObject.getRoleStatus()); //pre-populate role status field 
        return "editRole";
    }

    public String edit() {
        if (duplicateValidations()) {
            error1();
            return null;
        }
        Short roleStatus = 0;
        roleStatus = Short.parseShort(strStatus);
        roleObject.setRoleStatus(roleStatus);
        dbRoleFacade.edit(roleObject);
        roleObject = new DbRole();
        init();
        return "viewRole";
    }

    public String cancel() {
        roleObject = new DbRole();
        return "viewRole";
    }

    public String printStatus(Short roleStatus) {
        switch (roleStatus) {
            case 0:
                strStatus = "Inactive";
                break;
            case 1:
                strStatus = "Active";
                break;
            default:
                strStatus = "NULL";
        }
        return strStatus;
    }

    public boolean duplicateValidations() {
        List<DbRole> validateDuplicates = dbRoleFacade.findByName("roleName", roleObject.getRoleName());
        if (!validateDuplicates.isEmpty() && validateDuplicates.get(0).equals(roleObject)) {
                return false;
        }
        return !validateDuplicates.isEmpty();
    }

    public void error() {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error:", "The role is currently assigned to one or more users"));
    }

    public void error1() {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error:", "The role name already exists."));
    }

}
