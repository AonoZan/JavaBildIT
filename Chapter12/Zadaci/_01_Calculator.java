/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class _01_Calculator {
	public static java.util.Scanner input = new java.util.Scanner(System.in);
	public static void closeScanner() {input.close();}
	public static int calculate(int number1, int number2, String operation){
		switch (operation) {
			case "*":
				return number1 * number2;
			case "/":
				return number1 / number2;
			case "+":
				return number1 + number2;
			case "-":
				return number1 - number2;
			default:
				break;
		}
		return number1;
	}
	public static int resultFromLine(String[] line) throws Exception{
		int num1 = 0, sum = 0;
		String operation = new String(), comparison = new String();
		if (line.length < 3) throw new Exception("Not enough of arguments");
		boolean numberOperations = true;
		for (String input : line) {
			if(numberOperations){
				for (char c : input.toCharArray() )
					if(!Character.isDigit(c))
						throw new Exception("Wrong numerical Input \"" + input + "\"");
				num1 = Integer.valueOf(input);
				if(!operation.equals(comparison)) {
					sum = calculate(sum, num1, operation);
				}else{
					sum += num1;
				}
				operation = comparison;
				
			}else{
				if (input.length() > 1 || !"*/+-".contains(input))
					throw new Exception("Wrong operational input \"" + input + "\"");
				operation = input;
				
			}
			numberOperations = !numberOperations;
//			System.out.println(input);
		}
		return sum;
	}
	public static void main(String[] args) {
		
		String userInput = "";
		int result = 0;
		while(true){
			System.out.print("Enter operations: ");
			try {
				userInput = input.nextLine();
				result = resultFromLine(userInput.split(" "));
			} catch (Exception e) {
				System.out.println(e.getMessage());
				break;
			}
			System.out.printf("Result:\n\t%s = %d\n", userInput, result);
			
		}
		
	}

}
