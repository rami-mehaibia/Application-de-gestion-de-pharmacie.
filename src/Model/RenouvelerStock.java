/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.util.List;
import java.util.ArrayList;


/**
 *
 * @author rayen
 */
public class RenouvelerStock {
    private Stock stock;
    private ArrayList<Notification> notifications = new ArrayList<Notification>();

    public RenouvelerStock(Stock stock) {
        this.stock = stock;
    }

   public void renouveler() {
    List<Produit> produits = stock.getProduits();

    for (Produit produit : produits) {
        if (produit.datePeremptionProche()) {
            int quantiteMax = produit.getQuantiteMax();
            int quantiteActuelle = produit.getQuantite();
            int quantiteACommander = quantiteMax - quantiteActuelle;
            
            if (quantiteACommander > 0) {
                String message = "Commander " + quantiteACommander + " unité(s) du produit " + produit.getNom();
                Notification notification = new Notification(message);
                notifications.add(notification);
            }
        }
    }
}

}
