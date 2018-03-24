package entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(DbtreeLevel3.class)
public abstract class DbtreeLevel3_ {

	public static volatile SingularAttribute<DbtreeLevel3, DbtreeLevel3PK> dbtreeLevel3PK;
	public static volatile ListAttribute<DbtreeLevel3, DbtreeLevel4> dbtreeLevel4List;
	public static volatile SingularAttribute<DbtreeLevel3, Integer> treeLevel3Index;
	public static volatile SingularAttribute<DbtreeLevel3, String> treeLevel3Name;
	public static volatile SingularAttribute<DbtreeLevel3, DbtreeLevel2> dbtreeLevel2;

}

