
/**
 *
 * @author David, Fred et Morgane la team Licorne
 */
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import static java.util.Collections.shuffle;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;

public class Plateau {

    //variables
    JFrame frame;
    GridLayout grid;
    JButton[] buttons;
    ArrayList<String> labels;
    int colonnes=3;
    int lignes=3;
    String nomJoueur = "Joueur1";
    int score = 0;

    // création du plateau
    public Plateau(int lignes, int colonnes) {
        this.colonnes = colonnes;
        this.lignes = lignes;

        // création de la fenêtre de jeu
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        grid = new GridLayout(0, colonnes);
        buttons = new JButton[colonnes * lignes];
        labels = new ArrayList<>();
        frame.setTitle("Taquin");

        // on centre le jeu sur l'écran
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        // le jeu se ferme lorsqu'on ferme la fenêtre
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // on interdit le choix de la taille de la fenêtre par l'utilisateur
        frame.setResizable(false);

        //ajoute un menu déroulant
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Jeu");
        JMenuItem menuNouvellePartie = new JMenuItem("Nouvelle partie");
        menu.add(menuNouvellePartie);
        menu.add(new JSeparator());
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);
        JMenuItem menuQuitter = new JMenuItem("Quitter");
        menu.add(menuQuitter);
        JMenu menu2 = new JMenu("" + nomJoueur);
        JMenuItem menu2NomJoueur = new JMenuItem("Configurer nom du joueur");
        menu2.add(menu2NomJoueur);
        menuBar.add(menu2);

        //création d'une pop up pour saisir le nom du joueur
        menu2NomJoueur.addActionListener((ActionEvent e) -> {
            String nomJoueur = JOptionPane.showInputDialog("Entrez votre nom");

        });
        //faire que le menu quitter ferme la fenetre
        menuQuitter.addActionListener((ActionEvent e) -> {
            System.exit(0);
        });
        //faire que le menu Nouvelle partie mélange le plateau
        menuNouvellePartie.addActionListener((ActionEvent e) -> {
            String nouvelleLignes = JOptionPane.showInputDialog("Combien de lignes");
            String nouvelleColonnes = JOptionPane.showInputDialog("Combien de colonnes");
            new Plateau(parseInt(nouvelleLignes),parseInt(nouvelleColonnes));
            melangerPlateau();
        });

        frame.setLayout(grid);
        // affichage du plateau avec boutons, un bouton manquant qui sera invisible
        for (int i = 1; i <= colonnes * lignes - 1; i++) {

            final int j = i;
            buttons[i - 1] = new JButton("" + i);

            // on peut déplacer les boutons lors du clic s'ils sont à coté de l'invisible
            buttons[i - 1].setName("button" + i);
            buttons[i - 1].addActionListener((ActionEvent e) -> {
                score = score + 1;
                buttonBas(j - 1);
                buttonHaut(j - 1);
                buttonGauche(j - 1);
                buttonDroite(j - 1);

            });

            frame.add(buttons[i - 1]);
            labels.add("" + i);
            buttons[i - 1].setName("button" + i);
        }
        buttons[colonnes * lignes - 1] = new JButton("" + colonnes * lignes);
        buttons[colonnes * lignes - 1].setName("button" + (colonnes * lignes));
        buttons[colonnes * lignes - 1].addActionListener((ActionEvent e) -> {
            buttonBas(colonnes * lignes - 1);
            buttonHaut(colonnes * lignes - 1);
            buttonGauche(colonnes * lignes - 1);
            buttonDroite(colonnes * lignes - 1);
        });

        frame.add(buttons[colonnes * lignes - 1]);
        buttons[colonnes * lignes - 1].setVisible(false);

        //on mélange le jeu lors d'une nouvelle partie
        melangerPlateau();

        frame.pack();
        frame.setVisible(true);

    }

    //ajout d'une méthode pour mélanger le plateau
    private void melangerPlateau() {
        shuffle(labels);
        for (int i = 1; i <= colonnes * lignes - 1; i++) {
            buttons[i - 1].setLabel(labels.get(i - 1));

        }
    }

    //méthode pour bouger les touches
    private void buttonHaut(int positionJButton) {

        if (positionJButton - colonnes >= 0) {
            JButton jbutton = buttons[positionJButton - colonnes];
            if (!jbutton.isVisible()) {
                jbutton.setVisible(true);
                jbutton.setLabel(buttons[positionJButton].getLabel());
                buttons[positionJButton].setVisible(false);

                if (victoire()) {
                    System.out.println(score);
                    frame.disable();
                    System.exit(0);
                }
            }
        }
    }

    private void buttonBas(int positionJButton) {

        if (positionJButton + colonnes <= buttons.length - 1) {
            JButton jbutton = buttons[positionJButton + colonnes];
            if (!jbutton.isVisible()) {
                jbutton.setVisible(true);
                jbutton.setLabel(buttons[positionJButton].getLabel());
                buttons[positionJButton].setVisible(false);
                if (victoire()) {
                    System.out.println(score);
                    frame.disable();
                    System.exit(0);
                }
            }
        }

    }

    private void buttonGauche(int positionJButton) {

        if (positionJButton - 1 >= 0) {
            JButton jbutton = buttons[positionJButton - 1];
            if (!jbutton.isVisible() && (positionJButton / colonnes == (positionJButton - 1) / colonnes)) {
                jbutton.setVisible(true);
                jbutton.setLabel(buttons[positionJButton].getLabel());
                buttons[positionJButton].setVisible(false);
                if (victoire()) {
                    System.out.println(score);
                    frame.disable();
                    System.exit(0);
                }
            }
        }

    }

    private void buttonDroite(int positionJButton) {

        if (positionJButton + 1 <= buttons.length - 1) {
            JButton jbutton = buttons[positionJButton + 1];
            if (!jbutton.isVisible() && (positionJButton / colonnes == (positionJButton + 1) / colonnes)) {
                jbutton.setVisible(true);
                jbutton.setLabel(buttons[positionJButton].getLabel());
                buttons[positionJButton].setVisible(false);
                if (victoire()) {
                    System.out.println(score);
                   
                    frame.disable();
                    System.exit(0);
                }
            }
        }
    }

    private boolean victoire() {

        int i = 1;

        while (i <= colonnes * lignes - 1 && buttons[i - 1].getLabel().equals("" + i)) {
            System.out.println(buttons[i - 1].getLabel() + "&" + i);
            i++;
        }
        if (i == colonnes * lignes) {
            //ouverture d'une fenetre pop up en cas de victoire
            JOptionPane.showMessageDialog(null, "Bravo tu as gagné! Score = " + score, "OK", JOptionPane.INFORMATION_MESSAGE);
            return true;
        }
        return false;
    }

}
