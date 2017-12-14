public class Calculate {
	
	public static void main(String[] arg) {
		System.out.println("calculate");
		double first = Double.valueOf(arg[0]);
		double second = Double.valueOf(arg[1]);
		
		double sum = first + second;
		double sub = first - second;
		double mul = first * second;
		double div = first / second;

		double deg = Math.pow(first, second);

		System.out.println("sum = " + sum);
		System.out.println("sub = " + sub);
		System.out.println("mul = " + mul);
		System.out.println("div = " + div);
		System.out.println("deg = " + deg);
	}
}