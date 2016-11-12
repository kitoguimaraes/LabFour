/**
 * CardDriver is a basic driver with a simple main method.
 * It tests the Card class and subclasses
 */
public class CardDriver {
	
    public static void main(String[] args) {
        
    	Card card = new Card();
        System.out.println("Card format after default constructor:\n" + card.format());
        
        card = new Card("Emmett Lathrop Brown");
        System.out.println("Card format after default constructor:\n" + card.format());
    }
}
