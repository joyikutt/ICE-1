/*
Name: Prabha Joyikutty
ID: 991533645
 */
package cardtrickice1;

/** define card value and suits
 * 
 *
 * 
 */
public class Card 
{
    private int value;
    private String suits; //encapsulation
    //constant
    public static final String [] SUITS = { "diamonds","clubs","spades","hearts"};

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * @return the suits
     */
    public String getSuits() {
        return suits;
    }

    /**
     * @param suits the suits to set
     */
    public void setSuits(String suits) {
        this.suits = suits;
    }
   //number
     void Card(int i) {
        Card c1 = new Card();
        c1.setValue(1 + (int) (Math.random() * 13));
        
    //method for suits
    c1.setSuits(suits);

        Card[] magicHand = null;

        magicHand[i] = c1;
}
}