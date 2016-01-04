package singleton;

public class Test {
	 public  static void main(String args[])
     {
		 PrintSpooler printSpooler1;
		 PrintSpooler printSpooler2;
		 PrintSpooler printSpooler3;
		 printSpooler1 = PrintSpooler.getPrintSpooler();
		 printSpooler2 = PrintSpooler.getPrintSpooler();
		 printSpooler3 = PrintSpooler.getPrintSpooler();
		 printSpooler1.addPrint("print1");
		 printSpooler1.addPrint("print2");
		 printSpooler2.deletePrint("print1");
		 printSpooler3.getPrint();
     }
}
