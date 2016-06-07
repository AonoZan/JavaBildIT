import java.util.ArrayList;

/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class Test {
	public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2){
		ArrayList<Integer> newList = new ArrayList<>();
//		for (int i = 0; i < list1.size() ; i++) {
//			newList.add(list1.get(i));
//		}
//		for (int i = 0; i < list2.size() ; i++) {
//			newList.add(list2.get(i));
//		}
		newList.addAll(list1);
		newList.addAll(list2);
		return newList;
	}
	public static void printArray(ArrayList<Integer> list){
		for (Integer integer : list) {
			System.out.print(integer + " ");
		}
	}
	public static int quotionet(int broj1, int broj2){
		if(broj2 == 0){
			System.out.println("Djelilac ne moze biti 0.");
			System.exit(1);
		}
		return broj1/broj2;
	}
	public static void main(String[] args){
		/*
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		
		list1.add(4);
		list1.add(5);
		list1.add(45);
		list1.add(78);
		list1.add(46);
		
		list2.add(7);
		list2.add(5);
		list2.add(87);
		list2.add(3);
		list2.add(1);
		
		ArrayList<Integer> newList = union(list1, list2);
		
		printArray(newList);*/
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.println("Unesite dva broja: ");
//		int broj1 = input.nextInt();
//		int broj2 = input.nextInt();
		
		
		try {
//			int broj1 = input.nextInt();
//			int broj2 = input.nextInt();
//			System.out.println(quotionet(broj1, broj2));
//			int br =  broj1 / broj2;
		} catch (ArithmeticException e) {
//			System.out.println("Djelilac nastavlja sa radom...");
			System.out.println(e.getStackTrace());
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
		
//		int rezultat = quotionet(broj1, broj2);
//		System.out.printf("broj1 / broj2 = %d", rezultat);
		input.close();
	}

}
