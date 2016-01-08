package strategy;

public class Test {
	public static void main(String[] args) {
		String[] data = new String[]{"Jack","Maya","Mikes","Shadow"};
		TableExporter tb = new HtmlExporter();
		System.out.println(tb.getExported(data));
		
		TableExporter tb2 = new LineExporter();
		System.out.println(tb2.getExported(data));
	}
}
