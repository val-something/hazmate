package entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(DbriskSeverity.class)
public abstract class DbriskSeverity_ {

	public static volatile SingularAttribute<DbriskSeverity, Integer> riskSeverityId;
	public static volatile SingularAttribute<DbriskSeverity, String> severityScore;
	public static volatile ListAttribute<DbriskSeverity, DbHazard> dbHazardList;

}

