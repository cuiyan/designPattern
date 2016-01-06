package chain_of_responsibily;

public abstract class DomHtml implements Dom {
	//html 元素ID
	private String id;
	
	//html 元素名称
	private String tagName;
	
	//html元素js 处理方法
	private String eventFunction="";
	
	@Override
	public String getTagName() {
		// TODO Auto-generated method stub
		return this.tagName;
	}

	@Override
	public abstract Dom getParent() ;

	/**
	 * 冒泡
	 */
	public void flowEvent(JsEvent event, Dom dom) {
		//正向冒泡
		System.out.println(this.getTagName()+"进行了 "+event.getType());
		//执行事件的方法
		this.catchEvent(event);
		//是否停止冒泡
		if(stopEvent())
			return ;
		//调用dom
		dom.flowEvent(event, this);
		
		//反向冒泡事件流
		System.out.println(this.getTagName() +"进行了 "+event.getType());
		this.catchEvent(event);
		if(stopEvent())
			return;
	}
	/**
	 * 模板的默认处理方法
	 */
	@Override
	public void catchEvent(JsEvent event) {
		if(this.eventFunction == null || "".equals(this.eventFunction.trim()))
			System.out.println(this.getTagName() +"未对事件 "+event.getType() +"进行处理");
		else{
			System.out.println(this.getTagName() +"对事件 "+event.getType() +"进行如下处理");
			System.out.println(this.eventFunction);
			System.out.println("----------处理结束-------------");
		}
	}

	@Override
	public boolean stopEvent() {
		if(this.eventFunction !=null && this.eventFunction.indexOf("stopPropagation") !=-1){
			System.out.println("----------停止往上冒泡------------");
			return true;
		}
		System.out.println(this.getTagName() +"未阻止事件冒泡");
		return false;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEventFunction() {
		return eventFunction;
	}

	public void setEventFunction(String eventFunction) {
		this.eventFunction = eventFunction;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

}
