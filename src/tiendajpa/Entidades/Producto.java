/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendajpa.Entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Alejandro Birolo
 */
@Entity
public class Producto implements Serializable{
    @Id
    private int codigo;
    private String nombre;
    private double precio;
    @ManyToOne
    private Fabricante fabricante ;

    public Producto() {
    }

    public Producto(int codigo, String nombre, double precio, Fabricante fab) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.fabricante = fab;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


    public Fabricante getFab() {
        return fabricante;
    }

    public void setFab(Fabricante fab) {
        this.fabricante = fab;
    }
    
    

    /*
    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", fab=" + fab.getCodigo() + '}';
    }
*/

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", fab=" + fabricante+ '}';
    }

   /* 
    @Override
    public boolean equals(Object o) {
        return super.equals(o); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != 0 ? super.hashCode():0);
        return hash; //To change body of generated methods, choose Tools | Templates.
    }
*/
    
    

    
}
