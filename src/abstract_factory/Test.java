package abstract_factory;

public class Test {
	public static  void main(String[] args){
		double paramA =4;
		double paramB =5;
		char op1='+';
		char op2='-';
		char op3='*';
		char op4='/';
		Operation oper1 = OperatorFactory.createOperation(op1);
		oper1.paramA = paramA;
		oper1.paramB = paramB;
		Operation oper2 = OperatorFactory.createOperation(op2);
		oper2.paramA = paramA;
		oper2.paramB = paramB;
		Operation oper3 = OperatorFactory.createOperation(op3);
		oper3.paramA = paramA;
		oper3.paramB = paramB;
		Operation oper4 = OperatorFactory.createOperation(op4);
		oper4.paramA = paramA;
		oper4.paramB = paramB;
		System.out.println(oper1.getResult());
		System.out.println(oper2.getResult());
		System.out.println(oper3.getResult());
		System.out.println(oper4.getResult());
		
	}
}
