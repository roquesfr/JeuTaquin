import java.util.Random;
/**
 *
 * @author David, Fred et Morgane la team Licorne
 */
public class GestionPartie {
    PlateauTestTableau board;
    Joueur player;

    public GestionPartie(PlateauTestTableau board, Joueur player) {
        this.board = board;
        this.player = player;
    }
    
    // Lance le jeu en créant le plateau et l'affichant (TEST)
    public void lancerJeu(){
        board.creerPlateau();
        board.afficherPlateau();
        melangerPlateau();
        System.out.println("Plateau mélangé");
        board.afficherPlateau();
    }
    
    // Mélange le plateau de jeu
    public void melangerPlateau(){
        for(int i = board.plateau.size() - 1; i >= 1; i--){
            Random random = new Random();
            int randIndex = random.nextInt(i);
            Carreau tmp = board.plateau.get(randIndex);
            board.plateau.set(randIndex, board.plateau.get(i));
            board.plateau.set(i, tmp);
            
        }
    }
}
