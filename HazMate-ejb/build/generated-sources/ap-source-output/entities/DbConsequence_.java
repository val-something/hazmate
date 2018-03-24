package entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(DbConsequence.class)
public abstract class DbConsequence_ {

	public static volatile SingularAttribute<DbConsequence, Integer> consequenceId;
	public static volatile SingularAttribute<DbConsequence, String> consequenceDescription;
	public static volatile ListAttribute<DbConsequence, DbHazardConsequence> dbHazardConsequenceList;
	public static volatile SingularAttribute<DbConsequence, String> hazardId;

}

