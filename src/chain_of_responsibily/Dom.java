package chain_of_responsibily;

public interface Dom {
	//获取当前dom元素的名称
	public String getTagName();
	
	//获取父dom对象
	Dom getParent();
	
	//事件冒泡
	void flowEvent(JsEvent event, Dom dom);

	//事件处理
	void catchEvent(JsEvent event);
	
	//阻止冒泡
	boolean stopEvent();


}
