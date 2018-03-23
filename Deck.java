import java.util.ArrayList;
/**
 * Write a description of class Deck here.
 *
 * Anna Mary Starr
 * 3/21/18
 */
public class Deck
{
    private ArrayList<Card> deck;
    
    /**
     * Constructor for objects of class Deck
     */
    public Deck()
    {
        deck = new ArrayList<Card>();
        initializeDeck();
        shuffle();
    }
    
    public void initializeDeck()
    {
        String[] suits = {"Hearts", "Clubs", "Spades", "Diamonds"};
        String[] ranks = {"Ace", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "nine", "Ten", "Jack", "Queen", "King"};
        for(String s: suits) {
            int value = 1;
            for(String r : ranks) {
                Card temp = new Card (value, s, r);
                value ++;
                deck.add(temp);
            }
        }
    }
    
    public void shuffle()
    {
        
    }
    
    public Card deal()
    {
        return null;
    }
    
    public void printDeck() 
    {
        for (Card c: deck) {
            System.out.print(c);
        }
    }

}
