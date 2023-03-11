/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vue;

/**
 *
 * @author etulyon1
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GestionTraitement extends JFrame implements ActionListener {
    
    private JButton ajouterTraitementBtn;
    private JButton visualiserTraitementsBtn;
    private JButton retourBtn;
    
    public GestionTraitement() {
        super("Gestion des traitements");
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        JLabel titreLabel = new JLabel("Gestion des traitements", SwingConstants.CENTER);
        add(titreLabel, BorderLayout.NORTH);
        
        JPanel boutonsPanel = new JPanel(new GridLayout(3, 1));
        ajouterTraitementBtn = new JButton("Ajouter traitement");
        visualiserTraitementsBtn = new JButton("Visualiser traitements");
        retourBtn = new JButton("Retour");
        ajouterTraitementBtn.addActionListener(this);
        visualiserTraitementsBtn.addActionListener(this);
        retourBtn.addActionListener(this);
        boutonsPanel.add(ajouterTraitementBtn);
        boutonsPanel.add(visualiserTraitementsBtn);
        boutonsPanel.add(retourBtn);
        add(boutonsPanel, BorderLayout.CENTER);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ajouterTraitementBtn) {
            // code pour ouvrir la page d'ajout de traitement
        } else if (e.getSource() == visualiserTraitementsBtn) {
            // code pour ouvrir la page de visualisation des traitements
        } else if (e.getSource() == retourBtn) {
            // code pour revenir à la page d'accueil
            
        }
    }
    
}

