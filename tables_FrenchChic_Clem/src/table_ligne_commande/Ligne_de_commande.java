/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package table_ligne_commande;
import java.io.Serializable;
import javax.persistence.*;
/**
 *
 * @author user
 */
@Entity
@Table(name = "ligne_de_commande")
public class Ligne_de_commande implements Serializable {
    @Id // Pb : pas de id dans cette table
    @GeneratedValue
    private int qte;
    public Ligne_de_commande(){}
    public int getQte(){
        return qte;
    }
    public void setQte(int n){
        qte=n;
    }
}