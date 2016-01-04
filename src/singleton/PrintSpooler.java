package singleton;

import java.util.ArrayList;
import java.util.List;

public class PrintSpooler {
	private static PrintSpooler printSpooler =null;
	
	private List printList;
	
	private PrintSpooler(){
		printList = new ArrayList();
	}
	
	public synchronized static PrintSpooler getPrintSpooler(){
		if(printSpooler==null){
			printSpooler =  new PrintSpooler();
		}
		return printSpooler;
	}
	public void addPrint(String print){
		printList.add(print);
	}
	//删除任务
	public void deletePrint(String print){
		printList.remove(print);
	}
	//中止
	public void stopPrint(){
		
	}
	//改变优先级
	public void changeSequence(String print){
		
	}
	//获取打印池中的内容
	public void getPrint(){
		printList.forEach(print->{
			System.out.println(print);
		});
	}
	
}
