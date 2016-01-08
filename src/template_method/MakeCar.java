package template_method;
/**
 * 汽车组装工具抽象来
 * @author cuiyan
 *
 */
public  abstract class MakeCar {
	//组装车头
	abstract void makeHead();
	//组装车身
	abstract void makeBody();
	//组装车尾
	abstract void makeTail();
	//测试
	abstract boolean checkMake();
	
	public void make(){
		System.out.println("start make car...");
		makeHead();
		makeBody();
		makeTail();
		if(checkMake()){
			System.out.println("make ok");
		}else{
			System.out.println("male failure");
		}
	}
}
