package chain_of_responsibily;

public class Div extends DomHtml{
	
	public void catchEvent(JsEvent event){
		System.out.println("-------------div通用事件处理方法--------------------");
		System.out.println(this.getTagName()+" 对事件 "+event.getType() +" 进行如下处理");
		System.out.println("弹出窗口");
		System.out.println("--------------处理结束-----------------");
	}
	@Override
	public Dom getParent() {
		// TODO Auto-generated method stub
		return null;
	}

}
