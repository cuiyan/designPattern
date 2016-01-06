package chain_of_responsibily;
/**
 * 定义点击事件
 * @author cuiyan
 *
 */
public class ClickEvent implements JsEvent {
	
	private String type;
	
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return this.type;
	}

	@Override
	public Dom getTarget() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void stopPropagation() {
		// TODO Auto-generated method stub
		
	}

	public void setType(String type) {
		this.type = type;
	}

}
