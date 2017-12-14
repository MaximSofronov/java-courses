/**
* Realises Calculator
*/
public class Calculator {
	private double firstArg;
	private double secondArg;
	private double result;

	private String action;
	private boolean isSaved;

	public void add() {
		this.result = this.firstArg + this.secondArg;
	}

	public void sub() {
		this.result = this.firstArg - this.secondArg;
	}

	public void mul() {
		this.result = this.firstArg * this.secondArg;
	}

	public void div() {
		this.result = this.firstArg / this.secondArg;
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

	public String getAction() {
		return this.action;
	}

	public void setAction(String arg) {
		this.action = arg;
	}

	public boolean getIsSaved() {
		return this.isSaved;
	}

	public void setIsSaved(boolean arg) {
		this.isSaved = arg;
	}


	public void cleanResult() {
		this.result = 0;
	}
}