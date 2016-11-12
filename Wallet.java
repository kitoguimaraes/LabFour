
public class Wallet {
	
	private Card card1;
	private Card card2;
	
	public void addCard(Card c) {
		
		if (card1 == null) {
			card1 = c;
		} else if (card2 == null) {
			card2 = c;
		}		
	}
	
			
    public String formatCards() {
    	String card1Formatted = card1 == null ? "null" : card1.format();
    	String card2Formatted = card2 == null ? "null" : card2.format();
    	return "[" + card1Formatted + " | " + card2Formatted + "]"; 
    }
	
    public int getExpiredCardCount() {
    	int count = 0;
    	
    	if (card1 != null && card1.isExpired()) {
    		count++;
    	}
    	
    	if (card2 != null && card2.isExpired()) {
    		count++;
    	}
    	return count;
    	
    }
    

}
