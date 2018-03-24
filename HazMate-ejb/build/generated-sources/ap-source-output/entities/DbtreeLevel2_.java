package entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(DbtreeLevel2.class)
public abstract class DbtreeLevel2_ {

	public static volatile SingularAttribute<DbtreeLevel2, String> treeLevel2Name;
	public static volatile SingularAttribute<DbtreeLevel2, DbtreeLevel2PK> dbtreeLevel2PK;
	public static volatile SingularAttribute<DbtreeLevel2, Integer> treeLevel2Index;
	public static volatile ListAttribute<DbtreeLevel2, DbtreeLevel3> dbtreeLevel3List;
	public static volatile SingularAttribute<DbtreeLevel2, DbtreeLevel1> dbtreeLevel1;

}

