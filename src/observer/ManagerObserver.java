package observer;

import java.util.Observable;
import java.util.Observer;

public class ManagerObserver implements Observer{
	@Override
	public void update(Observable o, Object arg) {
		if(arg instanceof News){
			mail2Manager((News)arg);
		}
	}
	private void mail2Manager(News news){
		System.out.println("Mail to manager,a news published with tittle :"+news.getTitle());
	}
}
