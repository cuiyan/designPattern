package adapter;

public class Adaptee {
	public long getPower(long base,long exp){
		long result=1;
		for(int i=0;i<exp;i++)
			result*=base;
		return result;
	}

}
