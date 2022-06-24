package tiendajpa.Entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import tiendajpa.Entidades.Fabricante;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-06-23T19:47:38")
@StaticMetamodel(Producto.class)
public class Producto_ { 

    public static volatile SingularAttribute<Producto, Integer> codigo;
    public static volatile SingularAttribute<Producto, Double> precio;
    public static volatile SingularAttribute<Producto, Fabricante> fabricante;
    public static volatile SingularAttribute<Producto, String> nombre;

}