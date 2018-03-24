package entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(DbhazardType.class)
public abstract class DbhazardType_ {

	public static volatile SingularAttribute<DbhazardType, String> hazardTypeName;
	public static volatile SingularAttribute<DbhazardType, Integer> hazardTypeId;
	public static volatile ListAttribute<DbhazardType, DbHazard> dbHazardList;

}

