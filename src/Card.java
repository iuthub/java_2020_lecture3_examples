public class Card {
    private String face;
    private String suit;

    // constructor
    public Card(String face, String suit){
        // initialise
        this.face = face;
        this.suit = suit;
    }
    public String toString(){
        return face + " of " + suit;
    }
}
