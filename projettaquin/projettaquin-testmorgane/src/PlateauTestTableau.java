/**
 *
 * @author David, Fred et Morgane la team Licorne
 */

import java.util.ArrayList;


public class PlateauTestTableau {
    
    int colonnes;
    int lignes;
    ArrayList<Carreau> plateau;
    final static int COLONNE_DEFAULT = 3;
    final static int LIGNES_DEFAULT = 3;

    // CONSTRUCTEURS
    
    public PlateauTestTableau(int colonnes, int lignes) {
        this.colonnes = colonnes;
        this.lignes = lignes;
        this.plateau = new ArrayList<>();
    }
    
    public PlateauTestTableau(){
        this.colonnes = COLONNE_DEFAULT;
        this.lignes = LIGNES_DEFAULT;
        this.plateau = new ArrayList<>();
    }
    
    // METHODES
    
    public int getColonnes() {
        return colonnes;
    }

    public int getLignes() {
        return lignes;
    }
    
    // Créer le plateau de jeu
    public void creerPlateau(){
        for(int i = 1; i <= getColonnes() * getLignes(); i++){
            plateau.add(new Carreau(i));
        }
    }
    
    // Affiche le plateau de jeu
    public void afficherPlateau(){
        for(int i = 0; i < getColonnes() * getLignes(); i++){
            if(i % getColonnes() == 0 && i != 0){
                System.out.println("|");
            }
            System.out.printf("| %-2d ", plateau.get(i).valeur);
        }
        System.out.println("|");
    }
}
