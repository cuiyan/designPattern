package simple_factory;



public class OperationFactory {
	public static Operation getOperation(char operate){
		Operation oper = null;
		switch(operate){
			case '+':
				oper = new Add();
				break;
			case '-':
				oper = new Subtract();
				break;
			case '*':
				oper = new Multiply();
				break;
			case '/':
				oper = new Devide();
				break;
			default:
				break;
		}
		return oper;
	}
}
