package entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(DbLocation.class)
public abstract class DbLocation_ {

	public static volatile SingularAttribute<DbLocation, DbgradeSeparation> locationGradeSeparation;
	public static volatile SingularAttribute<DbLocation, String> locationName;
	public static volatile SingularAttribute<DbLocation, String> locationAbbrev;
	public static volatile SingularAttribute<DbLocation, Integer> locationId;
	public static volatile SingularAttribute<DbLocation, String> locationDescription;
	public static volatile SingularAttribute<DbLocation, DbchangeType> locationChangeType;
	public static volatile SingularAttribute<DbLocation, DbconstructionType> locationConstructionType;
	public static volatile SingularAttribute<DbLocation, DbProject> projectId;
	public static volatile ListAttribute<DbLocation, DbHazard> dbHazardList;

}

