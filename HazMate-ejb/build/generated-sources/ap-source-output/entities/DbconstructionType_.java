package entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(DbconstructionType.class)
public abstract class DbconstructionType_ {

	public static volatile SingularAttribute<DbconstructionType, Integer> constructionTypeId;
	public static volatile SingularAttribute<DbconstructionType, String> constructionTypeName;
	public static volatile ListAttribute<DbconstructionType, DbLocation> dbLocationList;

}

