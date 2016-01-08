package observer;

import java.util.Observable;

public class NewsPublisher extends Observable{
	public void publishNews(String newsTitle,String newsBody){
		News news = new News(newsTitle,newsBody);
		setChanged();
		System.out.println("news published:"+newsTitle);
		//
		this.notifyObservers(news);
		
	}
}
