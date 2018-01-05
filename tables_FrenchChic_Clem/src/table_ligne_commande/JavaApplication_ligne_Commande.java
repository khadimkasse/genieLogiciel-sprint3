/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package table_ligne_commande;
//import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
/**
 *
 * @author user
 */
public class JavaApplication_ligne_Commande {
   /* private static EntityManagerFactory emFactory;
    private static EntityManager em;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("JavaApplication_TP2"); //param : nom de la Persitence Unit
        EntityManager em = emFactory.createEntityManager();
        em.getTransaction().begin();
        Ligne_de_commande quantite1;
        quantite1 = new Ligne_de_commande();
        quantite1.setQte(3);
        //em.persist(quantite1);
        //em.getTransaction().commit();
        
        //Ligne_de_commande clientDynamique = new Ligne_de_commande(); //On cree un client dynamique
        //em.persist(clientDynamique);
        
       /* Scanner sc = new Scanner(System.in);
        em.getTransaction().begin();
        System.out.println("Saisir le nom du client a ajouter");  //On demande a l'utilisateur de rentrer le nom
        clientDynamique.setNom(sc.nextLine());// On rajoute le nom du client dans la ligne suivante dans la base   
        em.getTransaction().commit();//On verifie que le nom a bien ete ajoute
        
        
        em.getTransaction().begin();//On rouvre une transaction
        System.out.println("Saisir la ville du client");// On demande a l'utilisateur de rentrer la ville
        clientDynamique.setVille(sc.nextLine()); // On rajoute le nom dans la ligne suivante (derniere ligne) de la base    
        em.getTransaction().commit();//On verifie que le nouveau client est bien dans la base */
 
    }
        
}
