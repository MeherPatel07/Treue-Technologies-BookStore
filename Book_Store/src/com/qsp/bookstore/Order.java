package com.qsp.bookstore;

import java.util.List;

public class Order 
{
	private User user;
    private List<Book> books;
    private double total;
    
	public Order(User user, List<Book> books, double total) 
	{
		
		this.user = user;
		this.books = books;
		this.total = total;
	}

	public User getUser() 
	{
		return user;
	}

	public List<Book> getBooks() 
	{
		return books;
	}

	public double getTotal() 
	{
		return total;
	}

}
