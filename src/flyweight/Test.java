package flyweight;

public class Test {
	public static void main(String[] args) {
		BusFactory busFactory = new BusFactory();
		Bus bus1 = busFactory.getBus("A");  
		Bus bus2 = busFactory.getBus("B");  
		Bus bus3 = busFactory.getBus("C");  
		Bus bus4 = busFactory.getBus("D");  
		Bus bus5 = busFactory.getBus("E");  
		Bus bus6 = busFactory.getBus("B");  
		bus1.printNumber();  
		bus2.printNumber();  
		bus3.printNumber();  
		bus4.printNumber();  
		bus5.printNumber();  
		bus6.printNumber();  
		System.out.println("bus2 = bus6:" + bus2.equals(bus6));  

	}
}
