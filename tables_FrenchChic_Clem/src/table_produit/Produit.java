/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package table_produit;
import java.io.Serializable;
import javax.persistence.*;
/**
 *
 * @author user
 */
@Entity
@Table(name = "produit")
public class Produit implements Serializable {
    
    @Id
    @Column(name = "REF")
    private String ref;
    public Produit(){}  
    
    @Column(name = "EST_DU_JOUR")
    private boolean est_du_jour;
    
     @Column(name = "PRIX_PRDT")
    private int prix_prdt; // Attention, on a mis int pour être cohérent avec le chemin, mais a revoir maybe
     
     @Column(name = "QTE_STOCK")
    private int qte_stock;
    
        
   
    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }
     public boolean getEstDuJour() {
        return est_du_jour;
    }
       
    public void setEstDuJour(boolean a) {
        est_du_jour = a;
    }
    
    public int getPrix() {
        return prix_prdt;
    }

    public void setPrix(int a) {
        prix_prdt = a;
    }
    
    public int getQteStock() {
        return qte_stock;
    }

    public void setQteStock(int a) {
        qte_stock = a;
    }
    
    public void setStockRestant (int qte) { //qte serait la qte d'achat
        qte_stock = qte_stock - qte;
    }
    
    public String VerifStockRestant (int qte) { //qte serait la qte d'achat
        if (qte_stock - qte >=0) {
            return "Ok"; //A peaufiner bien sûr
        }
        else {
            return "Nous n'avons plus assez de produits en stock";
        }
    }
    
}