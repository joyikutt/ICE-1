/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardtrickice1;

/** step1 : generate 7 random cards and store in array - how
 * step 2: take any card input from user suit,number
 * step 3: user card is in  the array 'card is found'
 *
 * @author sivagamasrinivasan,May 23rd
 */
public class CardTrickICE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Card[] magicHand = new Card[7]; //Array of object
        for( int i=0;i<magicHand.length;i++)
        {
            Card c1 = new Card();
            c1.setValue(1 + (int) (Math.random() * 13));//use a method to generate random *13
            c1.setSuits("hearts");//random method suit 
        }
        //step 2:take input 
        
                int suits = (int)(Math.random() * 4);
           c1.setSuits(suits);//random method suit 
        
         Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        

        //step 3: match with array 
    }        
        for(Suits: suit : Suits.values()){
  {
            for(Value value : Value values)List<> deck;
{
        suits.add(new Card(suits, value));
        }
    Collections.shuffle(deck);
        for (int i = 0; i <5; i++){
        System.out.println(deck.get(magicHand(i).getValue() 
                + "of" + deck.get(i).getSuits()));
        }
        return null;
        }
    } 

    private Object magicHand(int i) {
        return null;
    }

    
}
