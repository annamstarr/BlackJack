import java.util.ArrayList;
import java.util.Scanner;
/**
 * Write a description of class Player here.
 *
 * Anna Mary Starr
 * 3/21/18
 */
public class Player extends Game
{
    public String name;
    public int amountOfMoney;
    public int handTotal;
    ArrayList<Card> hand = new ArrayList<Card>();
    
    Scanner scan = new Scanner(System.in);
    
    /**
     * Constructor for objects of class Player
     */
    public Player(String nm, int money, int total)
    {
        this.name = nm;
        this.amountOfMoney = money;
        this.handTotal = total;
    }
    
    public void bet()
    {
        System.out.println("How much would you like to bet?");
        int betMoney = scan.nextInt();
        
    }
    
    public void hit()
    {
        
    }
    
    public void stay()
    {
        
    }
    
    public int getHandTotal()
    {
        
        return handTotal;
    }
    
    public String toString()
    {
        return "The status of the hand is ";
    }

}
