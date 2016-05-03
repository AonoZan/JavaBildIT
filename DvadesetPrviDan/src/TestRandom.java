class MyRandom{
   
    int rand;
    int seed;
    boolean fliper = true;
    // sacuva trenutni generisani broj
    int currentRandom = 0;
    // sacuva staticni varijablu value koja se mjenja na svim objektima koje su instance MyRandom klase
    static int value = 0;
    // cuva nepromjenljivu(final) varijablu koja predstavlja neki cudan broj
    // ona je definisana na nivou operativnog sistem(npr Win XP ili Mac OS)
    // cini mi se da python koristi (int)(Math.pow(2, 19937) - 1)
    // ali u javi je to "infinity"...
    private final int SYSTEM_SEED = 2*7*19937-1;
   
    MyRandom(){
       
    }
   
    MyRandom(int newSeed){
        seed = newSeed;
    }
   
    int nextInt(int rand){
    	// dodaj vrjedjnosti na value svaki put
    	if (fliper) {
    		value += SYSTEM_SEED + seed + rand;
    	}else {
    		value -= SYSTEM_SEED + seed + rand;
    	}
    	if (value > 100000000 || value < 10000) {
    		fliper = !fliper;
    	}
    	// ako value postane prevelika vrjednost smanji je
//    	if (value > SYSTEM_SEED * 100000000) value = value % seed;
    	
    	// ako je fix jednako seed promjeni u nesto drugo jer bi bila
    	// greska na liniji  "java.lang.ArithmeticException: / by zero"
    	if (currentRandom == seed) currentRandom = SYSTEM_SEED % rand/seed;
    	// kreiraj trenutacni broj na osnovu value
    	int number = value;
    	// oduzimaj od broja dok ne bude manji od rand(znaci u rasponu od nule do rand)
        while (number > rand) {
        	
	    	number -= SYSTEM_SEED % (seed - currentRandom);
//        	System.out.println(value);
	    	if(number < rand) break;
	    	number -= SYSTEM_SEED % (rand + currentRandom);
//        	System.out.println(value);
        }
        int divider = 10;
        while(true) {
        	if (rand % divider == 0) break;
        	divider = divider *10;
        }
//        System.out.printf("return: %d\n", (2*7*19937-1));
        // sacuvaj trenutno generisan broj
        currentRandom = number;
//        System.out.print (number + "  ");
        // ako je broj negativan pretvori ga u pozitivan
        if (number < 0) number = Math.abs(number);
//        System.out.println(number);
    	// vrati broj
//        return number;
        return ((value % rand) + SYSTEM_SEED) % rand;
    }
 
}
public class TestRandom {
 
    public static void main(String[] args) {
 
        System.out.println("From random1: ");
        MyRandom random1 = new MyRandom(1);
        random1.seed = 25;
        
        int[] comparison = {random1.nextInt(100), random1.nextInt(100), random1.nextInt(100)};
        
        int[] current = {0, 0, 0};
        System.out.println((17950-8975) + " " + (26925 - 17950) + " " + (35900 - 26925));
        for(int i =1; i <= 5000; i++){
        	int num = random1.nextInt(100);
        	current[0] = current[1];
        	current[1] = current[2];
        	current[2] = num;
        	
        	System.out.print(num + " ");
        	if (i%10 == 0) System.out.println();
			if (current[0] == comparison[0] &&
					current[1] == comparison[1] &&
					current[2] == comparison[2]) {
				System.out.printf("Same : %d-%d , %d-%d, %d-%d, %d\n",
						current[0], comparison[0],
						current[1], comparison[1],
						current[2], comparison[2],
						i);
			}
//        	System.out.println(i);
//        	random1.nextInt(100);
        }
        
//        System.out.println(2*7*19937-1);
//        System.out.println(Math.pow(2, 19937)-1);
    }
 
}