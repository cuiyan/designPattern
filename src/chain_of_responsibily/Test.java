package chain_of_responsibily;

public class Test {
	public static void main(String[] args) {
		DomHtml input = new Input();
		input.setTagName("input");
		DomHtml div = new Div();
		div.setTagName("div");
		DomHtml td = new Td();
		td.setTagName("td");
		DomHtml tr = new Tr();
		tr.setTagName("tr");
		DomHtml table = new Table();
		table.setTagName("table");
		DomHtml body = new Body();
		body.setTagName("body");
		DomHtml html = new Html();
		html.setTagName("html");
		Window window = new Window();
		window.setTagName("window");
		
		window.putDom(window);
		window.putDom(input);
		window.putDom(div);
		window.putDom(td);
		window.putDom(tr);
		window.putDom(table);
		window.putDom(body);
		window.putDom(html);
		
		ClickEvent event = new ClickEvent();
		event.setType("click");
		window.flowEvent(event, window);
	}
}
