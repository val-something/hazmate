package entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(DbHazard.class)
public abstract class DbHazard_ {

	public static volatile SingularAttribute<DbHazard, String> hazardWorkshop;
	public static volatile SingularAttribute<DbHazard, String> hazardReview;
	public static volatile ListAttribute<DbHazard, DbControlHazard> dbControlHazardList;
	public static volatile SingularAttribute<DbHazard, DbhazardActivity> hazardActivity;
	public static volatile SingularAttribute<DbHazard, String> hazardComment;
	public static volatile SingularAttribute<DbHazard, DbriskClass> riskClassId;
	public static volatile ListAttribute<DbHazard, DbHazardCause> dbHazardCauseList;
	public static volatile SingularAttribute<DbHazard, DbhazardStatus> hazardStatusId;
	public static volatile SingularAttribute<DbHazard, DbOwners> ownerId;
	public static volatile SingularAttribute<DbHazard, DbhazardType> hazardTypeId;
	public static volatile ListAttribute<DbHazard, DbHazardSbs> dbHazardSbsList;
	public static volatile SingularAttribute<DbHazard, DbLocation> hazardLocation;
	public static volatile SingularAttribute<DbHazard, DbriskFrequency> riskFrequencyId;
	public static volatile SingularAttribute<DbHazard, String> hazardDescription;
	public static volatile ListAttribute<DbHazard, DbHazardConsequence> dbHazardConsequenceList;
	public static volatile SingularAttribute<DbHazard, String> legacyId;
	public static volatile SingularAttribute<DbHazard, Date> hazardDate;
	public static volatile SingularAttribute<DbHazard, Integer> riskScore;
	public static volatile SingularAttribute<DbHazard, DbriskSeverity> riskSeverityId;
	public static volatile SingularAttribute<DbHazard, String> hazardId;
	public static volatile SingularAttribute<DbHazard, DbhazardContext> hazardContextId;

}

