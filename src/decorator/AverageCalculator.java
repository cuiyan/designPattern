 	package decorator;

import java.util.List;

public class AverageCalculator implements Calculator{

	@Override
	public double getResult(List<Double> list) {
		double sum = 0;
		for(int i =0;i<list.size();i++){
			sum += list.get(i);
		}
		
		return sum/(list.size()==0?1:list.size());
	}

}
