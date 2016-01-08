package strategy;

public class LineExporter implements TableExporter{

	@Override
	public String getExported(String[] data) {
		if(data == null){
			return "";
		}
		StringBuffer top = new StringBuffer("+");
		StringBuffer mid = new StringBuffer("|");
		for(int i =0;i<data.length;i++){
			String str = data[i];
			for(int j=0;j<str.length();j++){
				top.append("-");
			}
			mid.append(str);
			top.append("+");
			mid.append("|");
		}
		top.append("\n");
		mid.append("\n");
		return top.toString()+mid.toString()+top.toString();
	}

}
