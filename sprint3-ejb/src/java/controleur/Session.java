package controleur;
import metier.*;

public class Session {
    private EnumTypeEcran typeEcran;
    private Client leClientIdentifie;
    private Commande laCommande;

    public TraiterConnexionReponse traiterConnexion() {
        return new TraiterConnexionReponse(EnumTypeEcran.ECRAN_ACCUEIL);
    }

    public TraiterIdentificationReponse traiterIdentification(String ps, String mdp) {
        Client leClient = Client.rechercherClientParPseudo(ps, mdp);
        Produit leProduit = Produit.rechercherProduitDuJour();
        TraiterIdentificationReponse reponse = new TraiterIdentificationReponse(EnumTypeEcran.ECRAN_ACCUEIL_PERSO, leClient, leProduit);

        return reponse;

    }

    public TraiterAjoutPanierReponse traiterAjoutPanier(Produit leProduit, int quantite) {
        Commande laCommande = new Commande();
        laCommande.ajouterProduit(leProduit, quantite);
        TraiterAjoutPanierReponse reponse = new TraiterAjoutPanierReponse(EnumTypeEcran.ECRAN_PANIER, laCommande);

        return reponse;
    }

}
