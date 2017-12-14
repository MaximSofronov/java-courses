import java.util.Scanner;

/**
* Realises users interraction with Calculator
*/
public class InterractRunner {

	public static void main(String[] arg) {
		Calculator calculator = new Calculator();
		do {
			input(calculator);
			calculate(calculator);
			output(calculator);
			saveResult(calculator);
		} while (isExit(calculator) == false);
	}

	/**
	* Processing basic user input without saving result.
	*/
	private static void input(Calculator calc) {
		Scanner reader = new Scanner(System.in);

		System.out.println("Enter action (a - addition / s - subtraction / m - multiplication / d - divivision):");
		calc.setAction(reader.next());
		
		if (calc.getIsSaved() == false) {
			System.out.println("Enter first arg");
			calc.setFirstArg(Double.valueOf(reader.next()));
		} else {
			System.out.println("First arg is " + calc.getFirstArg());
		}
		System.out.println("Enter second arg");
		calc.setSecondArg(Double.valueOf(reader.next()));

		return;
	}

	/**
	* Performs calculations
	*/
	private static void calculate(Calculator calc) {
		switch (calc.getAction()) {
			case "a":
				calc.add();
				break;
			case "s":
				calc.sub();
				break;					
			case "m":
				calc.mul();
				break;
			case "d":
				calc.div();
				break;
			default:
				System.out.println("Incorrect input");
				break;
			}
		return;
	}

	/**
	* Result output
	*/
	private static void output(Calculator calc) {
		System.out.println("Result is " + calc.getResult());
	}

	/**
	* Processes "exit" input
	*/
	private static boolean isExit(Calculator calc) {
		boolean exit = false;
		if (calc.getIsSaved() == true) {
			exit = false;
		} else {
			Scanner reader = new Scanner(System.in);
			System.out.println("Do you want to exit? (y/n)");
			exit = reader.next().equals("y") ? true : false;
		}
		return exit;
	}


	/**
	* Processes "save result" input
	*/
	private static void saveResult(Calculator calc) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Do you want to save result for further calculations? (y/n)");
		calc.setIsSaved(reader.next().equals("y") ? true : false);

		if (calc.getIsSaved() == true)  {
			calc.setFirstArg(calc.getResult());
		}
		return;
	}
}
