package com.qsp.bookstore;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart 
{
	private List<Book> books;

	public ShoppingCart() 
	{
		books=new ArrayList<>();
	}
	
	public void addBook(Book book)
	{
		books.add(book);
	}
	
	public void removeBook(Book book)
	{
		books.remove(book);
	}
	
	public List<Book> getBooks()
	{
		return books;
	}
	
	public double calculateTotal()
	{
		double total=0.0;
		for(Book book:books)
		{
			total+=book.getPrice();
		}
		return total;
	}

}
