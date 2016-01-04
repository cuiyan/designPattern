package simple_factory;

public class TestClient {

	public static  void main(String[] args){
		Operation oper = OperationFactory.getOperation('+');
		System.out.println(oper.getResult(4,5));
	}

}
