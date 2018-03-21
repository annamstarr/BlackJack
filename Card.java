/**
 * Write a description of class Card here.
 *
 * Anna Mary Starr
 * 3/21/18
 */
public class Card extends Deck
{
    public int value;
    public String suit;
    public String rank;
    
    /**
     * Constructor for objects of class Card
     */
    public Card(int val, String st, String rnk)
    {
        this.value = val;
        this.suit = st;
        this.rank = rnk;
    }
    
    public int getValue()
    {
        return value;
    }
    
    public String getSuit()
    {
        return suit;
    }
    
    public void setValue()
    {
        
    }
    
    public void setSuit()
    {
        
    }
}
