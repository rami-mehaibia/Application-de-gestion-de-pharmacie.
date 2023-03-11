/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vue;

/**
 *
 * @author etulyon1
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GestionClient extends JFrame {
    private JButton ajouterClient;
    private JButton visualiserClients;
    private JButton retour;
    
    public GestionClient() {
        // Configure la fenêtre
        this.setTitle("Gestion des clients");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(700, 700);
        this.setLocationRelativeTo(null); // Centre la fenêtre
        
        // Ajoute un panneau principal avec un layout en colonne
        JPanel mainPanel = new JPanel(new GridLayout(0, 1));
        this.getContentPane().add(mainPanel);
        
        // Ajoute les boutons pour les différentes fonctionnalités
        ajouterClient = new JButton("Ajouter un client");
        visualiserClients = new JButton("Visualiser les clients");
        mainPanel.add(ajouterClient);
        mainPanel.add(visualiserClients);
        
        // Ajoute le bouton retour
        retour = new JButton("Retour");
        mainPanel.add(retour);
        
        // Ajoute un écouteur d'événement pour les boutons
        ajouterClient.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Ouvre la fenêtre pour ajouter un client
               /* AjouterClient ajouterClientFenetre = new AjouterClient();
                ajouterClientFenetre.setVisible(true);*/
            }
        });
        
        visualiserClients.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Ouvre la fenêtre pour visualiser les clients
                /*VisualiserClients visualiserClientsFenetre = new VisualiserClients();
                visualiserClientsFenetre.setVisible(true);*/
            }
        });
        
        retour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Ferme cette fenêtre et retourne à la fenêtre principale
                dispose();
            }
        });
    }
}

