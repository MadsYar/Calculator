 package calculator.operations;

public class Subtraction extends Operations {

	@Override
	public String getName() {
		return "substraction";
	}

	@Override
	public String getOperator() {
		// TODO Auto-generated method stub
		return "-";
	}

	@Override
	public double calc() {
		// TODO Auto-generated method stub
		return a - b;
	}

}
