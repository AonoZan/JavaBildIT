/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class _03_MessageOutOfBounds {
	public static void main(String[] ar){
		int[] array = new int[100];
		Inputs.genRand(array, 0, 10);
		
		int index = 0;
		while (true) {
			System.out.print("Enter index: ");
				
			try {
				index = Inputs.input.nextInt();
				System.out.printf("Random number on %d position is: %d", index, array[index]);
				break;
			} catch (IndexOutOfBoundsException e){
				System.out.println("Error: Index Out Of Bounds");
			} catch (Exception e) {
				System.out.println("Error: enter number");
				Inputs.input.nextLine();
			}
			
		}
		
	}

}
