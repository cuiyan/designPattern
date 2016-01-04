package prototype;

import java.io.Serializable;

public class Book implements Serializable{
	//价格
	private double price;
	//书名
	private String bookName;
	//作者
	private String author;
	
	public Book(double price,String bookName,String author){
		this.price = price;
		this.bookName = bookName;
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
}
