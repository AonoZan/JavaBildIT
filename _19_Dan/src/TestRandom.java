class MyRandom{
   
    int rand;
    int seed;
    // broji kreirane brojeve
    static int counter = 0;
    // sacuva trenutni generisani broj
    int currentRandom = 25;
    // sacuva staticni varijablu value koja se mjenja na svim objektima koje su instance MyRandom klase
    static int value = 0;
    // cuva nepromjenljivu(final) varijablu koja predstavlja neki cudan broj
    // ona je definisana na nivou operativnog sistem(npr Win XP ili Mac OS)
    // cini mi se da python koristi (int)(Math.pow(2, 19937) - 1)
    // ali u javi je to "infinity"...
    private final int SYSTEM_SEED = 5689; //2*7*19937-1;
   
    MyRandom(){
       
    }
   
    MyRandom(int newSeed){
        seed = newSeed;
    }
    int nextInt(int rand){
    	// napravi niz koji ce sacivati uvjek razlicitu duzinu nekih vrjednosti
//    	System.out.println(generateNum(25));
    	int x = lowerToRange(currentRandom*21+240, 512);
//    	System.out.println(x);
    	int nuze = generateNum(generateNum(x) + 78); //((generateNum(rand)+100)%100);
//    	System.out.printf("%d %d", nuze, lowerToRange(nuze, 500));
    	int[] numbers = new int[nuze];
    	// prodji kroz niz i popuni ga nekim vrjednostima
    	for (int i = 0; i < numbers.length; i++) {
			numbers[i] = generateNum(rand);
		}
    	// saberi sve te vrjednosti
    	int number = sum(numbers);
    	// smanji broj do dozvoljenog 
    	number = lowerToRange(number, rand);
    	return number;
    }
    // saberi citav niz i vrati taj zbir
    int sum(int[] array) {
    	int sum = 0;
    	for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
    	return sum;
    }
    // metoda vraca broj manji od varijable range a veci od nula
    int lowerToRange(int number, int range) {
    	// ako proleti previse i otidje u negativno jednostavno ga pretvori u pozitivan
    	if (number < 0)
			number = Math.abs(number);
    	// smanjuj broj dok ne bude manji od range
    	while (number > range) {
			counter++;
			if(counter % range/2 == 0) {number >>= 1; counter = 0;}
			number -= range;
			
		}
    	// ako proleti previse i otidje u negativno jednostavno ga pretvori u pozitivan
    	if (number < 0)
			number = Math.abs(number);
    	return number;
    }
    // metoda generise random broj
    int generateNum(int rand){
    	// bitno je da value bude uvjek razlicito i da se uvjek povecava
    	value += SYSTEM_SEED+currentRandom - seed * rand;
    	// broj je jednak value
    	int number = value;
    	// smanji broj ako je veci od maksimalnog dozvoljenog (varijabla rand)
    	number = lowerToRange(number, rand);
    	// sacuvaj dobiveni broj
    		currentRandom = number;
		// oduzmi broj od value da bi se dobio jos nasumicniji broj
    	value -= number;
    	// ako value premasi 1000000 resertuj na pocetak
    	// ova linija ce uvjek vracat isti broj ako je on manji od 1000000
    	// ovo je potrebno da racunar ne bi stalno povecavao value i morao se boriti
    	// sa ogromnim brojevima
		value = (value + 1000000) % 1000000;
//    	System.out.printf("%d   %d\n", number, value);
		return number;
    	
    }
}
public class TestRandom {
 
    public static void main(String[] args) {
 
        System.out.println("From random1: ");
        MyRandom random1 = new MyRandom(451);
        
        for (int i = 0; i < 5000; i++) {
        	random1.nextInt(100);
		}
        
        int[] comparison = {random1.nextInt(100), random1.nextInt(100), random1.nextInt(100)};
        int[] current = {0, 0, 0};
        int firstIndex = 0;
        
        for(int i =1; i <= 5000; i++){
        	int num = random1.nextInt(100);
        	current[0] = current[1];
        	current[1] = current[2];
        	current[2] = num;
        	
//        	System.out.printf("%2d ", num);
//        	if (i%25 == 0) System.out.println();
			if (current[0] == comparison[0] &&
					current[1] == comparison[1] &&
					current[2] == comparison[2]) {
				System.out.printf("Same : %d-%d , %d-%d, %d-%d, %d (%d)\n",
						current[0], comparison[0],
						current[1], comparison[1],
						current[2], comparison[2],
						(i - firstIndex), i);
				firstIndex = i;
			}
        }
    }
}