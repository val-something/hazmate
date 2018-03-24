package entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(DbhazardContext.class)
public abstract class DbhazardContext_ {

	public static volatile SingularAttribute<DbhazardContext, String> hazardContextName;
	public static volatile ListAttribute<DbhazardContext, DbHazard> dbHazardList;
	public static volatile SingularAttribute<DbhazardContext, Integer> hazardContextId;

}

