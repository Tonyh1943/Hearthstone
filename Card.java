
/**
 * A card in the battleground for hearthstone with attack and health values
 *
 * @ Tony Huang
 * @ 23/3/2021
 */
public class Card
{
    // instance variables
    private String name;
    private int attack;
    private int health;
    
    /**
     * Constructor for objects of class Card
     */
    public Card(int ap, int hp)
    {
        attack = ap;
        health = hp;
    }
    /**
     * An attack on another card 
     *
     */
    public int getAttack()
    {
        return(attack);
    }
  
    /**
     * Takes damage from another attack
     */
    public void takeDamage(int damage)
    {
        this.health -= damage;

    }
    
    public boolean alive()
    {
        if (this.health > 0) 
        {
            return(true);
        } else {
            return(false);
        }
    }
    
}

