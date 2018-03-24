package entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(DbUser.class)
public abstract class DbUser_ {

	public static volatile SingularAttribute<DbUser, String> firstName;
	public static volatile SingularAttribute<DbUser, String> lastName;
	public static volatile SingularAttribute<DbUser, String> password;
	public static volatile SingularAttribute<DbUser, Short> userStatus;
	public static volatile ListAttribute<DbUser, DbuserPreferences> dbuserPreferencesList;
	public static volatile SingularAttribute<DbUser, String> mobileNumber;
	public static volatile SingularAttribute<DbUser, DbRole> roleId;
	public static volatile SingularAttribute<DbUser, String> userEmail;
	public static volatile SingularAttribute<DbUser, String> company;
	public static volatile SingularAttribute<DbUser, Integer> userId;

}

