package calculator.operations;

public class Multiplication extends Operations {

	@Override
	public String getName() {
		return "multiplication";
	}

	@Override
	public String getOperator() {
		return "*";
	}

	@Override
	public double calc() {
		return a * b;
	}

}
