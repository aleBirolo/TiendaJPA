/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendajpa;

import java.util.Collection;
import java.util.UUID;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import tiendajpa.Entidades.Fabricante;
import tiendajpa.Entidades.Producto;

/**
 *
 * @author Alejandro Birolo
 */
public class TiendaJPA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        /// Creacion
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("TiendaJPAPU");
        EntityManager em = emf.createEntityManager();
        
        try {
            
            ///fab1.setCodigo(UUID.randomUUID().toString());
            Fabricante fab1 = new Fabricante();
            fab1.setCodigo(15);
            fab1.setNombre("Asus");
        
            em.getTransaction().begin();
            em.persist(fab1);
            em.getTransaction().commit();
           
           
            Fabricante fab2 = new Fabricante();
            fab2.setCodigo(25);
            fab2.setNombre("Samsung");
           
            em.getTransaction().begin();
            em.persist(fab2);
            em.getTransaction().commit();
        
        
            Producto pro1 = new Producto();
            pro1.setCodigo(155);
            pro1.setNombre("PC Portatil");
            pro1.setPrecio(500);
            pro1.setFab(fab1);
            
            em.getTransaction().begin();
            em.persist(pro1);
            em.getTransaction().commit();
            em.close();
            
        } catch (Exception e) {
             
            System.out.println("Error de sistema");
        }
        
        */
        
        /// Consultas
        /*
        try {
            
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("TiendaJPAPU");
            EntityManager em = emf.createEntityManager();

            int codigo = 15;
            Fabricante fab1 = (Fabricante) em.createQuery("SELECT f"
                                                          + " FROM Fabricante f "
                                                          + " WHERE f.codigo = :codigo").
                                                         setParameter("codigo", codigo).
                                                         getSingleResult();
            
            System.out.println(fab1);
           
            Fabricante fab2 = em.find(Fabricante.class, fab1.getCodigo());
            

            Collection<Fabricante> fabricantes = em.createQuery("SELECT f"
                                                                    + " FROM Fabricante f").
                                                                    getResultList();
            for (Fabricante f : fabricantes) {
                System.out.println(f.getCodigo());
                System.out.println(f.getNombre());
            }

            Producto pro1 = (Producto) em.createQuery("SELECT p"
                                                                + " FROM Producto p"
                                                                + " WHERE p.codigo= :codigo").
                                                        setParameter("codigo", 155).
                                                        getSingleResult();

            System.out.println(pro1.getCodigo());
            System.out.println(pro1.getNombre());
            System.out.println(pro1.getPrecio());
            System.out.println(pro1.getFab().getNombre());

            
            try {
                Producto pro2 = (Producto) em.createQuery("SELECT p"
                                                                + " FROM Producto p"
                                                                + " WHERE p.codigo= :codigo").
                                                        setParameter("codigo", 150).
                                                        getSingleResult();
            } catch (NoResultException e) {
                System.out.println("No se encontro producto para el codigo indicado");
            }

        } catch (Exception e) {
            System.out.println("Error de sistema");
        }
       */
        
        /// Modificar
        /*
        try {
            
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("TiendaJPAPU");
            EntityManager em = emf.createEntityManager();

            int codigo = 15;
            Fabricante fab1 = (Fabricante) em.createQuery("SELECT f"
                                                          + " FROM Fabricante f "
                                                          + " WHERE f.codigo = :codigo").
                                                         setParameter("codigo", codigo).
                                                         getSingleResult();
            
            fab1.setNombre("Lenovo");
            
            em.getTransaction().begin();
            em.merge(fab1);
            em.getTransaction().commit();

        } catch (Exception e) {
            System.out.println("Error de sistema");
        }
        */
                
        /// Eliminar
        try {
            
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("TiendaJPAPU");
            EntityManager em = emf.createEntityManager();

            int codigo = 25;
            Fabricante fab1 = (Fabricante) em.createQuery("SELECT f"
                                                          + " FROM Fabricante f "
                                                          + " WHERE f.codigo = :codigo").
                                                         setParameter("codigo", codigo).
                                                         getSingleResult();
            
            em.getTransaction().begin();
            em.remove(fab1);
            em.getTransaction().commit();
           
       
        }catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error de sistema");
        }
        
    }
}
