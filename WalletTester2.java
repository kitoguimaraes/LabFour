
public class WalletTester2 {

	public static void main(String[] args) {
		DriverLicence d = new DriverLicence("John Doe", "08-097654", 2003);
		CallingCard c = new CallingCard("Omega Card", "301233985945", 1030);
		
		Wallet wallet = new Wallet();
		
		wallet.addCard(d);
		wallet.addCard(c);
		
		System.out.println(wallet.formatCards());
		System.out.println("Number of expired cards: " + wallet.getExpiredCardCount());
		System.out.println("Expected: 1");

	}

}
