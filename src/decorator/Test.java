package decorator;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Double> list = new ArrayList<Double>();
		
		double d;
		do {
			d = in.nextDouble();
			if (d >= 0){
				list.add(d);
			}
		} while (d >= 0);
		
		Calculator ave = new AverageCalculator();
		OptionalCalculator over = new OverAverageCalculator();
		OptionalCalculator var = new VarianceCalculator();
		
		over.setCalculator(ave);
		var.setCalculator(over);
		
		System.out.println("Æ½¾ùÖµ£º" + var.getResult(list));

	}
}
