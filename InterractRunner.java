import java.util.Scanner;

public class InterractRunner {
	public static void main(String[] arg) {
		Scanner reader = new Scanner(System.in);
		try {
			Calculator calculator = new Calculator();
			String exit = "n";
			String cleanSave = "c";
			while (!exit.equals("y")) {
				System.out.println("Enter action: (a - addition / s - subtraction / m - multiplication / d - divivision)");
				String action = reader.next();
				
				switch (cleanSave) {
					case "c":
						System.out.println("Enter first arg");
						calculator.setFirstArg(Double.valueOf(reader.next()));

						System.out.println("Enter second arg");
						calculator.setSecondArg(Double.valueOf(reader.next()));
						break;
					case "s":
						System.out.println("First arg = " + calculator.getFirstArg());
						System.out.println("Enter second arg");
						calculator.setSecondArg(Double.valueOf(reader.next()));
						break;
				}

				switch (action) {
					case "a":
						calculator.add();
						break;
					case "s":
						calculator.sub();
						break;					
					case "m":
						calculator.mul();
						break;
					case "d":
						calculator.div();
						break;
				}
				

				System.out.println("Result = " + calculator.getResult());

				System.out.println("Clean result or save for further calculations? (c/s)");
				cleanSave = reader.next();
				switch (cleanSave) {
					case "c":
						calculator.cleanResult();
						break;
					case "s":
						calculator.setFirstArg(calculator.getResult());
						break;
				}

				

				System.out.println("Do you want to exit? (y/n)");
				exit = reader.next();
			}
		} finally {
			reader.close();
		}
	}	

}