package entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(DbhazardStatus.class)
public abstract class DbhazardStatus_ {

	public static volatile SingularAttribute<DbhazardStatus, String> hazardStatusName;
	public static volatile SingularAttribute<DbhazardStatus, Integer> hazardStatusId;
	public static volatile ListAttribute<DbhazardStatus, DbHazard> dbHazardList;

}

