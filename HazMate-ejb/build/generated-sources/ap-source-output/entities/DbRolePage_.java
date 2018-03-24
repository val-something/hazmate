package entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(DbRolePage.class)
public abstract class DbRolePage_ {

	public static volatile SingularAttribute<DbRolePage, DbPage> dbPage;
	public static volatile SingularAttribute<DbRolePage, DbRole> dbRole;
	public static volatile SingularAttribute<DbRolePage, String> deletePermission;
	public static volatile SingularAttribute<DbRolePage, String> addPermission;
	public static volatile SingularAttribute<DbRolePage, String> updatePermission;
	public static volatile SingularAttribute<DbRolePage, DbRolePagePK> dbRolePagePK;

}

