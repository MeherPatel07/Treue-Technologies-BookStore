package com.qsp.bookstore;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookStore 
{
	Scanner scanner=new Scanner(System.in);
   private List<Book> inventory;
   private List<User> users;
   private List<Order> orders;
   
  public BookStore() 
  {
	inventory = new ArrayList<>();
	users = new ArrayList<>();
	orders =new ArrayList<>();  }
   
  public void addBook(Book book)
  {
	  inventory.add(book);
  }
  
  public void registerUser(User user)
  {
	  
	  users.add(user);
	  
  }
  
  public User getUser(User username)
  {
	  for(User user:users)
	  {
		  if(user.getUsername().equals(username))
		  {
			  return user;
		  }
	  }
	  return null;
  }
  
  public void placeOrder(User user,ShoppingCart cart)
  {
	  double total=cart.calculateTotal();
	  Order order=new Order(user, cart.getBooks(), total);
	  orders.add(order);
	  cart.getBooks().clear();
  }
  
  public List<Order> getOrderHistory(User user)
  {
	  List<Order> userOrders=new ArrayList<>();
	  for(Order order:orders)
	  {
		  if(order.getUser().equals(user))
		  {
			  userOrders.add(order);
		  }
	  }
	  return userOrders;
  }
  
  public List<Book> searchBooksByTitle(String title)
  {
	  List<Book> result=new ArrayList<>();
	  for(Book book:inventory)
	  {
		  if(book.getTitle().equalsIgnoreCase(title))
		  {
			  result.add(book);
		  }
	  }
	  return result;
  }
  
  
  public List<Book> searchBooksByAuthor(String author)
  {
	  List<Book> result=new ArrayList<>();
	  for(Book book:inventory)
	  {
		  if(book.getAuthor().equalsIgnoreCase(author))
		  {
			  result.add(book);
		  }
	  }
	  return result;
  }
   
}
