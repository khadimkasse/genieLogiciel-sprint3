/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package table_produit;

//import tables_FrenchChic_Clem.table_ligne_commande;

import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author user
 */
public class JavaApplication_Produit {
    /**
     * @param args the command line arguments
     */
    //private static EntityManagerFactory emf;
    //private static EntityManager em;
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Produit prdt1 = new Produit();
        prdt1.setRef("0234LMEKS");
        prdt1.setEstDuJour(false);
        prdt1.setPrix(53);
        prdt1.setQteStock(30);
        //em.persist(client1);
        //em.getTransaction().commit();
        
        Produit prdt2=new Produit();
        prdt2.setRef("3456FOJDL");
        prdt2.setEstDuJour(true);
        prdt2.setPrix(57);
        prdt1.setQteStock(33);
        //em.persist(client2);
        

    
    }
}
