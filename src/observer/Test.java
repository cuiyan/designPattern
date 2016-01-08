package observer;

public class Test {
	public static void main(String[] args) {
		NewsPublisher publisher = new NewsPublisher();
		publisher.addObserver(new SubscriberObserver());
		publisher.addObserver(new ManagerObserver());
		publisher.publishNews("new news Title", "I am a new news");
	}
}
