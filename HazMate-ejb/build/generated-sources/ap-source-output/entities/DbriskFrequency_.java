package entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(DbriskFrequency.class)
public abstract class DbriskFrequency_ {

	public static volatile SingularAttribute<DbriskFrequency, Integer> riskFrequencyId;
	public static volatile SingularAttribute<DbriskFrequency, String> frequencyScore;
	public static volatile ListAttribute<DbriskFrequency, DbHazard> dbHazardList;

}

