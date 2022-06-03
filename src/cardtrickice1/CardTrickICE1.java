/*
Name: Prabha Joyikutty
ID: 991533645
 */
package cardtrickice1;

/**
 * step1 : generate 7 random cards and store in array - how step 2: take any
 * card input from user suit,number step 3: user card is in the array 'card is
 * found'
 *
 *
 */
public class CardTrickICE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Card[] magicHand = new Card[7]; //Array of object
        for (int i = 0; i < magicHand.length; i++) {

        }

        Card c1 = new Card();
        c1.setValue(1 + int(Math.random() * 13
        )); //use a method to generate random *13
           
            
            c1.setSuits("hearts");//random method suit 
    }
    int suits = int

    (Math.random ()
    *4);
    
        //step 2:take input 
           Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    //step 3: match with array 

    for(Suits
    : suit

    : Suits.values () 
        
            ){
  {
            for (Value value : Value {
                values
            }
            )
            List<> deck;
            {
                suits.add(new Card(suits, value));
            }
            Collections.shuffle(deck);
            for (int i = 0; i < 5; i++) {
                System.out.println(deck.get(magicHand(i).getValue()
                        + "of" + deck.get(i).getSuits()));
            }
            return null;

        }

        System.out.println("Please choose the suits: " +);
    }

    System.out.println (
            

    "Please choose the value: " + );
    private Object magicHand(int i) {
        return null;

    }

}
