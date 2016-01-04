package decorator;

import java.util.List;

public abstract class OptionalCalculator implements Calculator {

	protected Calculator calculator; 
	
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	
	public abstract double getResult(List<Double> list);


}
