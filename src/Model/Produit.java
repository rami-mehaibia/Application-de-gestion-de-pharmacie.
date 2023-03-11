/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;
import java.util.Date;
import java.util.Calendar;

public class Produit {
    private String nom;
    private int quantite;
    private double prix;
    private Date datePeremption;
    private String fournisseur;

    public Produit(String nom, int quantite, double prix, Date datePeremption, String fournisseur) {
        this.nom = nom;
        this.quantite = quantite;
        this.prix = prix;
        this.datePeremption = datePeremption;
        this.fournisseur = fournisseur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public Date getDatePeremption() {
        return datePeremption;
    }

    public void setDatePeremption(Date datePeremption) {
        this.datePeremption = datePeremption;
    }

    public String getFournisseur() {
        return fournisseur;
    }

    public void setFournisseur(String fournisseur) {
        this.fournisseur = fournisseur;
    }

    public void ajouterProduit(int quantite) {
        this.quantite += quantite;
    }

    public void supprimerProduit(int quantite) {
        this.quantite -= quantite;
    }

    public void modifierProduit(double prix, Date datePeremption, String fournisseur) {
        this.prix = prix;
        this.datePeremption = datePeremption;
        this.fournisseur = fournisseur;
    }
    
/*
    La fonction datePeremptionProche() permet de vérifier si la date de péremption
    du produit est proche, c'est-à-dire si elle est dans les 30 jours à venir.
    Pour ce faire, on utilise la classe Date pour récupérer la date actuelle, 
    et la classe Calendar pour ajouter 30 jours à cette date et obtenir
    une date limite. Ensuite, on compare cette date limite avec la date 
    de péremption du produit et on retourne un booléen qui indique si la date 
    de péremption est proche ou non.
    
    */
    public boolean datePeremptionProche() {
        
        Date dateActuelle = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(dateActuelle);
        cal.add(Calendar.DATE, 30);
        Date dateLimite = cal.getTime();
        return datePeremption.before(dateLimite);
    }

    /*
    La fonction datePeremptionAtteinte() permet de vérifier si la date de 
    péremption du produit est atteinte, c'est-à-dire si elle est antérieure
    à la date actuelle. Pour ce faire, on utilise également la classe Date 
    pour récupérer la date actuelle, puis on compare cette date avec la date
    de péremption du produit et on retourne un booléen qui indique si 
    la date de péremption est atteinte ou non.
    */
    public boolean datePeremptionAtteinte() {
        Date dateActuelle = new Date();
        return datePeremption.before(dateActuelle);
    }
    
    
     public int getQuantiteMax() {
        if (datePeremptionProche()) {
            return quantite / 2;
        } else {
            return quantite;
        }
    }
     
     
}



