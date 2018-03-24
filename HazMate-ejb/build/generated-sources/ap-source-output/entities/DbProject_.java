package entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(DbProject.class)
public abstract class DbProject_ {

	public static volatile ListAttribute<DbProject, DbLocation> dbLocationList;
	public static volatile SingularAttribute<DbProject, String> projectName;
	public static volatile SingularAttribute<DbProject, Integer> projectId;
	public static volatile SingularAttribute<DbProject, String> projectAbbrev;

}

