public class Calculator {
	private double firstArg;
	private double secondArg;

	private double result;

	public void add() {
		this.result = firstArg + secondArg;
	}

	public void sub() {
		this.result = firstArg - secondArg;
	}

	public void mul() {
		this.result = firstArg * secondArg;
	}

	public void div() {
		this.result = firstArg / secondArg;
	}

	public double getResult() {
		return this.result;
	}

	public void setResult(double res) {
		this.result = res;
	}

	public double getFirstArg() {
		return this.firstArg;
	}

	public void setFirstArg(double arg) {
		this.firstArg = arg;
	}

	public double getSecondArg() {
		return this.secondArg;
	}

	public void setSecondArg(double arg) {
		this.secondArg = arg;
	}


	public void cleanResult() {
		this.result = 0;
	}
}