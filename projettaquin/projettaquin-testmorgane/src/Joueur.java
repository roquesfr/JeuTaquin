/**
 *
 * @author David, Fred et Morgane la team Licorne
 */
public class Joueur {
    String name;
    int score = 0;

    public Joueur(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
    
    // Incremente le score du joueur
    public void augmenterScore(){
        score++;
    }
}
