package entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(DbriskClass.class)
public abstract class DbriskClass_ {

	public static volatile SingularAttribute<DbriskClass, Integer> riskClassId;
	public static volatile SingularAttribute<DbriskClass, String> riskClassName;
	public static volatile ListAttribute<DbriskClass, DbHazard> dbHazardList;

}

