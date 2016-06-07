/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class _24_PickACard {

	public static void main(String[] args) {
		int randomCardRank = 1+(int)(Math.random() * 13);
		int randomCardSuit = 1+(int)(Math.random() * 4);
		
		System.out.print("Program picked ");
		switch (randomCardRank) {
		case 1:
			System.out.print("Ace");
			break;
		case 11:
			System.out.print("Jack");
			break;
		case 12:
			System.out.print("Queen");
			break;
		case 13:
			System.out.print("King");
			break;
		default:
			System.out.print(randomCardRank);
			break;
		}
		System.out.print(" of ");
		switch (randomCardSuit) {
		case 1:
			System.out.println("Clubs");
			break;
		case 2:
			System.out.println("Diamonds");
			break;
		case 3:
			System.out.println("Hearts");
			break;
		case 4:
			System.out.println("Spades");
			break;
		default:
			System.out.println("INVALID");
			break;
		}
	}

}
