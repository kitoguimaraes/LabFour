public class IDCard extends Card {
	
	private String idNumber;
	
	public IDCard(String n, String id) {
		super(n);
		idNumber = id;
	}
	
	
    public String format() {
    	//System.out.println(super.format());    	
    	return super.format() + "ID Number: " + idNumber;
    }
    
    public String getIDnumber() {
    	return idNumber;
    	}    
    
    @Override
    public String toString() {
        return super.toString() + "[ID number: " + idNumber+"]";
    }   

    @Override
    public boolean equals(Object otherObject) {
    	if (otherObject == null) {
    		return false;
    	}
    	if (getClass().equals(otherObject.getClass())) {
    		IDCard other = (IDCard) otherObject;
    		return getName().equals(other.getName())
    				&& idNumber.equals(other.idNumber);
    	}	
    	return false;
    }
    
}
