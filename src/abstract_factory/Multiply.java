package abstract_factory;

public class Multiply extends Operation{

	@Override
	public double getResult() {
		return paramA*paramB;
	}

}
