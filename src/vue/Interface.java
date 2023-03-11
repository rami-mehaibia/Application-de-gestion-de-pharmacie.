/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vue;

/**
 *
 * @author etulyon1
 */
import vue.GestionTraitement;
import vue.GestionClient;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Interface extends JFrame {
    private JButton gestionClientButton, gestionTraitementButton;
    private JLabel logoLabel;

    public Interface() {
        // Création et configuration de la fenêtre principale
        super("Pharmacie");
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Création et configuration du logo
        ImageIcon logoImage = new ImageIcon("C:\\Users\\etulyon1\\Documents\\M1 Miage\\Ingénierie du logiciel\\GestionPharmacie\\logo.png");
        logoLabel = new JLabel(logoImage);
        logoLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Création et configuration des boutons
        gestionClientButton = new JButton("Gestion des clients");
        gestionTraitementButton = new JButton("Gestion des traitements");
        gestionClientButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        gestionTraitementButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Ajout des écouteurs de clic pour les boutons
        gestionClientButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) 
            {
                // Créer une instance de la classe GestionClient
                GestionClient gestionClient = new GestionClient();
                // Afficher la fenêtre de gestion des clients
                gestionClient.setVisible(true);
                // Cacher la fenêtre principale de l'interface
                setVisible(false);
            }
    });


        gestionTraitementButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) 
            {
                // Créer une instance de la classe GestionTraitement
                GestionTraitement gestionTraitement = new GestionTraitement();
                // Afficher la fenêtre de gestion des traitements
                gestionTraitement.setVisible(true);
            }
        });


        // Création et configuration du conteneur principal
        Container contentPane = getContentPane();
        contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));

        // Ajout des composants à la fenêtre
        contentPane.add(Box.createVerticalGlue());
        contentPane.add(logoLabel);
        contentPane.add(Box.createVerticalGlue());
        contentPane.add(gestionClientButton);
        contentPane.add(Box.createVerticalGlue());
        contentPane.add(gestionTraitementButton);
        contentPane.add(Box.createVerticalGlue());

        // Affichage de la fenêtre
        
        setVisible(true);
    }
    public static void main(String[] args) {
    Interface fenetre = new Interface();
    fenetre.setVisible(true);
}
}

