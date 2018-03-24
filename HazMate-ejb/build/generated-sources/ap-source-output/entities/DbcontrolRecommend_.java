package entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(DbcontrolRecommend.class)
public abstract class DbcontrolRecommend_ {

	public static volatile ListAttribute<DbcontrolRecommend, DbControlHazard> dbControlHazardList;
	public static volatile SingularAttribute<DbcontrolRecommend, Integer> controlRecommendId;
	public static volatile SingularAttribute<DbcontrolRecommend, String> controlRecommendName;
	public static volatile SingularAttribute<DbcontrolRecommend, String> controlJustifyRequired;

}

