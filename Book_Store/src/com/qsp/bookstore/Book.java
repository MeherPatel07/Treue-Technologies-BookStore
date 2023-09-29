package com.qsp.bookstore;

public class Book 
{
	private String title;
	private String author;
	private double price;
	
	public Book(String title, String author, double price) 
	{
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*String bookname;
	
	public Book(String bookname) 
	{
		super();
		this.bookname = bookname;
	}
	
	Scanner scanner=new Scanner(System.in);
	List<Book> list=new ArrayList<>();

	@Override
	public String toString() {
		return "Bookname : " + bookname;
	}
*/	
	
	

