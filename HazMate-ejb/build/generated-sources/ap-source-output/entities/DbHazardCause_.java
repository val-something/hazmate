package entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(DbHazardCause.class)
public abstract class DbHazardCause_ {

	public static volatile SingularAttribute<DbHazardCause, DbHazardCausePK> dbHazardCausePK;
	public static volatile SingularAttribute<DbHazardCause, DbCause> dbCause;
	public static volatile SingularAttribute<DbHazardCause, DbHazard> dbHazard;
	public static volatile SingularAttribute<DbHazardCause, Short> dbHazardCauseDummyvar;

}

