package abstract_factory;

public class Subtract extends Operation{

	@Override
	public double getResult() {
		return paramA-paramB;
	}

}
