
public class CallingCard extends Card {
	
	private String cardNumber;
	private int pin;
	
	public CallingCard(String n, String cardN, int pin){
		super(n);
		this.cardNumber = cardN;
		this.pin = pin;
	}

    public String format() {
    	return super.format() + ", Card Number: " + cardNumber + ", PIN: " + pin;
    }
	
    @Override
    public String toString() {
        return super.toString() + "[Card Number: " + cardNumber + ", PIN: " + pin+"]";
    }
    
    @Override
    public boolean equals(Object otherObject) {
    	if (otherObject == null) {
    		return false;
    	}
    	if (getClass().equals(otherObject.getClass())) {
    		CallingCard other = (CallingCard) otherObject;
    		return getName().equals(other.getName())
    				&& this.cardNumber.equals(other.cardNumber) && this.pin == other.pin;
    	}	
    	return false;
    }    
}
