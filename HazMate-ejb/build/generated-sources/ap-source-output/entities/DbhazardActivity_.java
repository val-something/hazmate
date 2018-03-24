package entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(DbhazardActivity.class)
public abstract class DbhazardActivity_ {

	public static volatile SingularAttribute<DbhazardActivity, Integer> activityId;
	public static volatile SingularAttribute<DbhazardActivity, String> activityName;
	public static volatile ListAttribute<DbhazardActivity, DbHazard> dbHazardList;

}

