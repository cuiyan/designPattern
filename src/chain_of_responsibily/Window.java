package chain_of_responsibily;

import java.util.ArrayList;
import java.util.List;

/**
 * dom元素集合容器 同事自己也是一个dom元素
 * @author cuiyan
 *
 */
public class Window extends DomHtml {
	//dom元素集合容器
	List<Dom> elements = new ArrayList<Dom>();
	/**
	 * 获取下一个dom对象
	 * @param dom
	 * @return
	 */
	public Dom nextDom(Dom dom){
		if(dom==null)
			return null;
		int index = elements.indexOf(dom);
		index ++;
		if(index <0 || index >= elements.size())
			return null;
		return elements.get(index);
	}
	/**
	 * 注册
	 * @param dom
	 */
	public void putDom(Dom dom){
		if(dom==null)
			return ;
		this.elements.add(dom);
	}
	/**
	 * 获取目标dom元素的下一个元素，并调用下一个元素的冒泡事件方法
	 * @param event
	 * @param dom
	 */
	public void flowEvent(JsEvent event,Dom dom){
		Dom next = this.nextDom(dom);
		if(next == null){
			System.out.println("事件已经冒到window上了");
			return;
		}
		//在下一个对象的dom对象方法中，将this传递过去，是为了下一个对象还能回到这个方法
		next.flowEvent(event, this);
	}
	@Override
	public Dom getParent() {
		// TODO Auto-generated method stub
		return null;
	}
}
