
public class NasumicnaKarta {
	public static String znak(){
		String[] characterArray = {"A", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		int randomChar = (int)(Math.random() * 14);
		return characterArray[randomChar];
	}
	public static String grupa(){
		String[] characterArray = {"Srce", "Pik", "Tref", "Kocka"};
		int randomChar = (int)(Math.random() * 4);
		return characterArray[randomChar];
	}
	public static void main(String[] args) {
		System.out.printf("Karta koju ste izvukli je %s %s.", znak(), grupa());
	}

}
