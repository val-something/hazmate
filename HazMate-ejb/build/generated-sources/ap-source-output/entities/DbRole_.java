package entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(DbRole.class)
public abstract class DbRole_ {

	public static volatile ListAttribute<DbRole, DbUser> dbUserList;
	public static volatile SingularAttribute<DbRole, Integer> roleId;
	public static volatile SingularAttribute<DbRole, String> roleName;
	public static volatile ListAttribute<DbRole, DbRolePage> dbRolePageList;
	public static volatile SingularAttribute<DbRole, Short> roleStatus;

}

