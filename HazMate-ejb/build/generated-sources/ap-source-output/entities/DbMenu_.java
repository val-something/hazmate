package entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(DbMenu.class)
public abstract class DbMenu_ {

	public static volatile SingularAttribute<DbMenu, String> menuIcon;
	public static volatile ListAttribute<DbMenu, DbPage> dbPageList;
	public static volatile SingularAttribute<DbMenu, Integer> menuId;
	public static volatile SingularAttribute<DbMenu, String> menuName;
	public static volatile SingularAttribute<DbMenu, String> menuType;
	public static volatile SingularAttribute<DbMenu, Integer> indexMenu;
	public static volatile SingularAttribute<DbMenu, Integer> parentMenu;

}

