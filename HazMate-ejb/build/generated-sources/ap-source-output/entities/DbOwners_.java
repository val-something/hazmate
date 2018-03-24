package entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(DbOwners.class)
public abstract class DbOwners_ {

	public static volatile SingularAttribute<DbOwners, String> ownerName;
	public static volatile ListAttribute<DbOwners, DbControl> dbControlList;
	public static volatile SingularAttribute<DbOwners, Integer> ownerId;
	public static volatile ListAttribute<DbOwners, DbHazard> dbHazardList;

}

