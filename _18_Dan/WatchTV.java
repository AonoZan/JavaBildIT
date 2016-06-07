
public class WatchTV {

	public static void main(String[] args) {
		TV samsung = new TV();
		
		System.out.println(samsung.channel);
		
		samsung.channelUp();
		System.out.println(samsung.channel);
		
	}

}
