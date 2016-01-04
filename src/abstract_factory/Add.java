package abstract_factory;

public class Add extends Operation{

	@Override
	public double getResult() {
		return paramA+paramB;
	}

}
