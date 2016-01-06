package chain_of_responsibily;
/**
 * 定义事件接口
 * @author cuiyan
 *
 */
public interface JsEvent {
	//事件类型
	public String getType();
	//事件作用对象
	public Dom getTarget();
	//阻止冒泡事件
	public void stopPropagation();
}
