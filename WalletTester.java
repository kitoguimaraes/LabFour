
public class WalletTester {
	
	public static void main(String[] args) {
		
		//IDCard idCard = new IDCard("Marco", "0904");
		DriverLicence d = new DriverLicence("John Doe", "08-097654", 2017);
		//DriverLicence driverLicence = new DriverLicence("Laylla", "2020");
		CallingCard c = new CallingCard("Omega Card", "301233985945", 1030);
		
		Wallet wallet = new Wallet();
		
		wallet.addCard(d);
		wallet.addCard(c);
		
		System.out.println(wallet.formatCards());
		
		System.out.println("Expected: [Name: John Doe, Card number: 08-097654, "
				+ "Expiration year: 2017 |"
				+ " Name: Omega Card, Card number: 301233985945, Pin: 1030]");
						
	}

}
