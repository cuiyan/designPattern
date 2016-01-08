package strategy;

public class HtmlExporter implements TableExporter{

	@Override
	public String getExported(String[] data) {
		if(data==null){
			return "";
		}
		StringBuffer sb = new StringBuffer();
		sb.append("<table>");
		for(int i=0;i<data.length;i++){
			sb.append("<tr><td>"+data[i]+"</td></tr>");
		}
		sb.append("</table>");
		return sb.toString();
	}

}
