import java.time.*;

public class DriverLicence extends IDCard {
	
	private int expYear;
	
	public DriverLicence(String n, String id, int eY){		
		super(n, id); // The superclass is IDCard
		this.expYear = eY;
	}
	
    public String format() {
    	return super.format() + ", Expiration year: " + expYear;
    	
    }
    
    @Override
    public boolean isExpired() {
    	
    	//GregorianCalendar calendar = new GregorianCalendar();
    	
    	if (expYear < Year.now().getValue())
    	//if (expYear < calendar.get(calendar.YEAR))
    	{
    		return true;
    	} else {
    		return false;	
    	}
        
    }
    
    @Override
    public String toString() {
        return super.toString() + "[Exp Year: " + expYear+"]";
    }  
    
    @Override
    public boolean equals(Object otherObject) {
    	if (otherObject == null) {
    		return false;
    	}
    	if (getClass().equals(otherObject.getClass())) {
    		DriverLicence other = (DriverLicence) otherObject;
    		return getName().equals(other.getName())
    				&& getIDnumber().equals(other.getIDnumber())
    				&& this.expYear == other.expYear;
    	}	
    	return false;
    }    
    
}
