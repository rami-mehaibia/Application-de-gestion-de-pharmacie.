/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author rayen
 */
import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;
import java.util.List;


public class Stock {
    private ArrayList<Produit> produits; // Une liste de produits dans le stock
    
public ArrayList<Produit> getProduits() {
    return produits;
}


    public Stock() {
        produits = new ArrayList<>();
    }

    // Ajouter un produit au stock
    public void ajouterProduit(Produit produit) {
        produits.add(produit);
    }

    // Supprimer un produit du stock
    public void supprimerProduit(Produit produit) {
        produits.remove(produit);
    }

    // Modifier un produit dans le stock
    public void modifierProduit(Produit produit, String nom, int quantite, double prix, Date datePeremption, String fournisseur) {
        produit.setNom(nom);
        produit.setQuantite(quantite);
        produit.setPrix(prix);
        produit.setDatePeremption(datePeremption);
        produit.setFournisseur(fournisseur);
    }

    // Vérifier si un produit est présent dans le stock
    public boolean produitPresent(Produit produit) {
        return produits.contains(produit);
    }

    // Rechercher un produit par son nom dans le stock
    public Produit chercherProduitParNom(String nom) {
        for (Produit produit : produits) {
            if (produit.getNom().equals(nom)) {
                return produit;
            }
        }
        return null; // Retourne null si le produit n'est pas trouvé
    }

    // Obtenir la liste de tous les produits dans le stock
    public ArrayList<Produit> getListeProduits() {
        return produits;
    }

    // Vérifier si un produit a une date de péremption proche
    public boolean datePeremptionProche(Produit produit) {
        return produit.datePeremptionProche();
    }

    // Vérifier si un produit a une date de péremption atteinte
    public boolean datePeremptionAtteinte(Produit produit) {
        return produit.datePeremptionAtteinte();
    }
}
