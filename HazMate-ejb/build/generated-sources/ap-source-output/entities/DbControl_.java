package entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(DbControl.class)
public abstract class DbControl_ {

	public static volatile SingularAttribute<DbControl, String> controlDescription;
	public static volatile SingularAttribute<DbControl, DbcontrolHierarchy> controlHierarchyId;
	public static volatile ListAttribute<DbControl, DbControlHazard> dbControlHazardList;
	public static volatile SingularAttribute<DbControl, Integer> controlId;
	public static volatile SingularAttribute<DbControl, DbOwners> ownerId;

}

