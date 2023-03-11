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
public class Notification {

    // Attributs de la classe Notification
    private String message;

    // Constructeur de la classe Notification
    public Notification(String message) {
        this.message = message;
    }

    // Méthode pour envoyer la notification
    public void envoyerNotification() {
        // Ici, on simule l'envoi d'une notification en affichant simplement un message dans la console
        System.out.println("Notification envoyée : " + message);
    }
}

