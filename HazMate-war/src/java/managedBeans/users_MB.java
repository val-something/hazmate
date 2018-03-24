/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedBeans;

import entities.DbUser;
import entities.DbRole;
import java.io.Serializable;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.*;
import javax.annotation.PostConstruct;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.inject.Named;
import javax.ejb.EJB;
import ejb.DbRoleFacadeLocal;
import ejb.DbUserFacadeLocal;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author Charling
 */
@Named(value = "users_MB")
@SessionScoped
public class users_MB implements Serializable {

    @EJB
    private DbUserFacadeLocal dbUserFacade;
    private DbUser user = new DbUser();
    private List<DbUser> listUsers;

    @EJB
    private DbRoleFacadeLocal dbRoleFacade;
    private DbRole role = new DbRole();
    private List<DbRole> listRoles;

    private String currentPassword;
    private String rawPassword;
    private String checkEmail;
    private String submitRole;
    private String userStatus;
    private List<DbUser> filteredUsers;

    public String getCurrentPassword() {
        return currentPassword;
    }

    public void setCurrentPassword(String currentPassword) {
        this.currentPassword = currentPassword;
    }

    public String getRawPassword() {
        return rawPassword;
    }

    public void setRawPassword(String rawPassword) {
        this.rawPassword = rawPassword;
    }

    public String getCheckEmail() {
        return checkEmail;
    }

    public void setCheckEmail(String checkEmail) {
        this.checkEmail = checkEmail;
    }

    public String getSubmitRole() {
        return submitRole;
    }

    public void setSubmitRole(String submitRole) {
        this.submitRole = submitRole;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    public List<DbUser> getListUsers() {
        return listUsers;
    }

    public void setListUsers(List<DbUser> listUsers) {
        this.listUsers = listUsers;
    }

    public List<DbRole> getListRoles() {
        return listRoles;
    }

    public void setListRoles(List<DbRole> listRoles) {
        this.listRoles = listRoles;
    }

    public users_MB() {
    }

    @PostConstruct
    public void init() {
        this.setListUsers(dbUserFacade.findAll());
        this.setListRoles(dbRoleFacade.listActiveRoles());
    }

    public DbUser getUser() {
        return user;
    }

    public void setUser(DbUser user) {
        this.user = user;
    }

    public DbRole getRole() {
        return role;
    }

    public void setRole(DbRole role) {
        this.role = role;
    }

    public void deleteUser(DbUser user) {
        try {
            dbUserFacade.remove(user);
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "", "Error deleting user: " + e.getMessage()));
        } finally {
            init();
        }
    }

    public String add() {
        if (checkEmail(checkEmail)) {
            String hashedPassword = hashPassword(rawPassword);
            user.setPassword(hashedPassword);
            user.setUserEmail(checkEmail);
            user.setRoleId(getSubmittedRole(submitRole));
            user.setUserStatus(getStatusShort(userStatus));
            dbUserFacade.create(user);
            user = new DbUser();
            init();
            return "viewUsers";
        } else {
            return "";
        }
    }

    public String addUser() {
        user = new DbUser();
        setCheckEmail("");
        setSubmitRole(null);
        setUserStatus(null);
        return "addUser";
    }

    public String editUser(DbUser user) {
        submitRole = user.getRoleId().getRoleName();
        checkEmail = user.getUserEmail();
        userStatus = getStatusString(user.getUserStatus());
        this.user = user;
        return "editUser";
    }

    public String edit() {
        user.setRoleId(getSubmittedRole(submitRole));
        user.setUserStatus(getStatusShort(userStatus));
        dbUserFacade.edit(user);
        user = new DbUser();
        init();
        return "viewUsers";
    }

    public String changeUser(DbUser user) {
        checkEmail = user.getUserEmail();
        this.user = user;
        return "changeUser";
    }

    public String change() {
        if (checkEmail(checkEmail)) {
            String hashedPassword = hashPassword(rawPassword);
            user.setPassword(hashedPassword);
            dbUserFacade.edit(user);
            user = new DbUser();
            init();
            return "viewUsers";
        } else {
            return "";
        }
    }

    private static final int ITERATIONS = 4096;
    private static final int KEY_LENGTH = 256;
    private static final byte[] SALT = "jcf_5#ecJm%HLyl6".getBytes();

    public static String hashPassword(String password) {
        char[] passArray = password.toCharArray();
        PBEKeySpec spec = new PBEKeySpec(passArray, SALT, ITERATIONS, KEY_LENGTH);
        Arrays.fill(passArray, Character.MIN_VALUE);
        try {
            SecretKeyFactory skf = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
            byte[] key = skf.generateSecret(spec).getEncoded();
            return Base64.getEncoder().encodeToString(key);
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            throw new AssertionError("Error on hashing password: " + e.getMessage(), e);
        } finally {
            spec.clearPassword();
        }
    }

    public List<DbUser> getFilteredUsers() {
        return filteredUsers;
    }

    public void setFilteredUsers(List<DbUser> filteredUsers) {
        this.filteredUsers = filteredUsers;
    }

    public int getNumberOfUsers() {
        return listUsers.size();
    }

    public String getEmail(DbUser user) {
        return user.getUserEmail();
    }

    public boolean checkEmail(String email) {
        if (!email.equals(user.getUserEmail())) {
            for (int i = 0; i < getNumberOfUsers(); i++) {
                if (listUsers.get(i).getUserEmail().toLowerCase().equals(email.toLowerCase())) {
                    FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, null, "This email has already been registered!"));
                    return false;
                }
            }
        }
        return true;
    }

    public DbRole getSubmittedRole(String submitRole) {
        for (int i = 0; i < listRoles.size(); i++) {
            if (listRoles.get(i).toString().equals(submitRole)) {
                return listRoles.get(i);
            }
        }
        return listRoles.get(0);
    }

    public String getStatusString(short statusId) {
        switch (statusId) {
            case 0:
                return "Inactive";
            case 1:
                return "Active";
            default:
                return "Inactive";
        }
    }

    public short getStatusShort(String statusName) {
        switch (statusName) {
            case "Inactive":
                return (short) 0;
            case "Active":
                return (short) 1;
            default:
                return (short) 0;
        }
    }
}
