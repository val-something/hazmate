package entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(DbtreeLevel4.class)
public abstract class DbtreeLevel4_ {

	public static volatile SingularAttribute<DbtreeLevel4, DbtreeLevel4PK> dbtreeLevel4PK;
	public static volatile ListAttribute<DbtreeLevel4, DbtreeLevel5> dbtreeLevel5List;
	public static volatile SingularAttribute<DbtreeLevel4, Integer> treeLevel4Index;
	public static volatile SingularAttribute<DbtreeLevel4, String> treeLevel4Name;
	public static volatile SingularAttribute<DbtreeLevel4, DbtreeLevel3> dbtreeLevel3;

}

