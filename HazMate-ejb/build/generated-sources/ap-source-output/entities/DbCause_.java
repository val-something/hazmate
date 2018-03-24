package entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(DbCause.class)
public abstract class DbCause_ {

	public static volatile SingularAttribute<DbCause, Integer> causeId;
	public static volatile SingularAttribute<DbCause, String> causeDescription;
	public static volatile ListAttribute<DbCause, DbHazardCause> dbHazardCauseList;
	public static volatile SingularAttribute<DbCause, String> hazardId;

}

