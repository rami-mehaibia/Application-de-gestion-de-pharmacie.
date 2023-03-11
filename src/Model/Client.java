/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


public class Client {
    private String nom;
    private String adresse;
    private String numeroTelephone;
    private String dateNaissance;
    private String numeroSecuriteSociale;

    // Constructeur
    public Client(String nom, String adresse, String numeroTelephone, String dateNaissance, String numeroSecuriteSociale) {
        this.nom = nom;
        this.adresse = adresse;
        this.numeroTelephone = numeroTelephone;
        this.dateNaissance = dateNaissance;
        this.numeroSecuriteSociale = numeroSecuriteSociale;
    }

    // Méthodes pour accéder aux attributs
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getNumeroTelephone() {
        return numeroTelephone;
    }

    public void setNumeroTelephone(String numeroTelephone) {
        this.numeroTelephone = numeroTelephone;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getNumeroSecuriteSociale() {
        return numeroSecuriteSociale;
    }

    public void setNumeroSecuriteSociale(String numeroSecuriteSociale) {
        this.numeroSecuriteSociale = numeroSecuriteSociale;
    }

    // Méthode pour afficher les informations du client
    @Override
    public String toString() {
        return "Nom : " + nom + "\nAdresse : " + adresse + "\nNuméro de téléphone : " + numeroTelephone + "\nDate de naissance : " + dateNaissance + "\nNuméro de sécurité sociale : " + numeroSecuriteSociale;
    }
}
