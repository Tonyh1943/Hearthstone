
/**
 * Controller class to simulate battles in Hearthstone 
 *
 * @ Tony
 * @ 23/3/2021
 */
public class Arena
{
    // instance variables - replace the example below with your own
    private final int WARBANDSIZE;
    private ArrayList<Card> warBandOne = new ArrayList<Card>();
    private ArrayList<Card> warBandTwo = new ArrayList<Card>();

    public Arena()
    {
        // initialise instance variables
        int WARBANDSIZE = 7
    }

    public void populateArray()
    {
        warBandOne.add(new Card("Chris", 25, 14));
        warBandOne.add(new Card("Joe", 30, 13));
        warBandOne.add(new Card("Becky", 34, 33));
        warBandOne.add(new Card("Bill", 16, 16));
        warBandOne.add(new Card("Karen", 18, 23));
        warBandOne.add(new Card("Matt", 19, 16));
        warBandOne.add(new Card("Matty", 50, 6));
        
        warBandTwo.add(new Card("Greg", 19, 16));
        warBandTwo.add(new Card("Lilly", 19, 16));
        warBandTwo.add(new Card("Niamh", 19, 16));
        warBandTwo.add(new Card("Tom", 19, 16));
        warBandTwo.add(new Card("Gerald", 19, 16));
        warBandTwo.add(new Card("Harry", 19, 16));
        warBandTwo.add(new Card("Ben", 19, 16));
    }
}
