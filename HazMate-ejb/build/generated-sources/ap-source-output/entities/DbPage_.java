package entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(DbPage.class)
public abstract class DbPage_ {

	public static volatile SingularAttribute<DbPage, String> pageLocation;
	public static volatile ListAttribute<DbPage, DbRolePage> dbRolePageList;
	public static volatile SingularAttribute<DbPage, DbMenu> menuId;
	public static volatile SingularAttribute<DbPage, Integer> pageId;
	public static volatile SingularAttribute<DbPage, String> pageName;
	public static volatile SingularAttribute<DbPage, Integer> indexPage;
	public static volatile SingularAttribute<DbPage, String> pageIcon;

}

