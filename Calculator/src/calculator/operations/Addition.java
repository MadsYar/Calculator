package calculator.operations;

public class Addition extends Operations {

	@Override
	public String getName() {
		return "addition";
	}

	@Override
	public String getOperator() {
		return "+";
	}

	@Override
	public double calc() {
		return a + b;
	}

}
