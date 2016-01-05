package flyweight;

import java.util.HashMap;
import java.util.Map;

public class BusFactory {
	 Map<String, Bus> pool; 
	 public BusFactory(){  
		 this.pool = new HashMap<String, Bus>();
	 }
	 public Bus getBus(String number){ 
		 Bus bus = this.pool.get(number);  
		 if(bus == null) {  
			  bus = new Bus(number);  
			  this.pool.put(number, bus);  

		 }
		  return bus;  
	 }
}
