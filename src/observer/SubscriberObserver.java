package observer;

import java.util.Observable;
import java.util.Observer;

public class SubscriberObserver implements Observer{

	@Override
	public void update(Observable o, Object arg) {
		if(arg instanceof News){
			mail2Subscriber((News)arg);
		}
	}
	private void mail2Subscriber(News news){
		System.out.println("Mail to subscriber,a news published with tittle :"+news.getTitle());
	}
}
