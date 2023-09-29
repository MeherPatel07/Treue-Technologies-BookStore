package com.qsp.bookstore;

import java.util.List;
import java.util.Scanner;

public class Controller {

	public static void main(String[] args) 
	{
		BookStore bookStore=new BookStore();
		Scanner scanner=new Scanner(System.in);
		
		
		while(true)
		{
			System.out.println("********************");
			System.out.println("1.Register User \n2.Add book to book store \n3.Place  order \n4.Get order history \n5.Search book by title \n6.Search book by author");
			System.out.println("********************");
			System.out.println("Enter your choice : ");
			
			switch(scanner.nextInt())
			{
			case 1:
			{
				System.out.println("Enter username : ");
				String username=scanner.next();
				
				System.out.println("Enter password : ");
				String password=scanner.next();
				
				bookStore.registerUser(new User(username,password));
				System.err.println("User registered successfully.");
				break;
			}
			case 2:
			{
				System.out.println("Enter book name to add to book store : ");
				String bookname=scanner.next();
				
				List<Book> existingBooks=bookStore.searchBooksByTitle(bookname);
				if(!existingBooks.isEmpty())
				{
					System.err.println("Book with the same title already exists in inventory.");
				}
				else
				{
					System.out.println("Enter author name : ");
					String authorName=scanner.next();
					System.out.println("Enter price of book : ");
					double price=scanner.nextDouble();
					
					bookStore.addBook(new Book(bookname, authorName, price));
					System.err.println("Book added to the inventory.");
				}
				
				break;
			}
			
			case 3:
			{
				System.out.println("Enter user name to place order : ");
				String username=scanner.next();
				
				System.out.println("Enter password : ");
				String password=scanner.next();
				
				User user=new User(username, password);
				
				if(user!=null)
				{
					ShoppingCart cart=new ShoppingCart();
					System.out.println("Enter book name which you want to order : ");
					String bookname=scanner.next();
					List<Book> books=bookStore.searchBooksByTitle(bookname);
					
					if(books!=null)
					{
						cart.addBook(books.get(0));
						bookStore.placeOrder(user, cart);
						System.err.println("Order placed successfully.");
					}
					else
					{
						System.err.println("Book not found.");
					}
					
				}
				else
				{
					System.err.println("User not found.");
				}
				
			   		
				break;
			}
			case 4:
			{
				System.out.println("Enter username : ");
				String username=scanner.next();
				
				System.out.println("Enter password : ");
				String password=scanner.next();
				
				User user=new User(username, password);
				
				if(user!=null)
				{
					List<Order>orderHistory=bookStore.getOrderHistory(user);
					if(orderHistory.isEmpty())
					{
						System.err.println("No order history found.");
					}
					else
					{
						System.err.println("Order history : ");
						for(Order order:orderHistory)
						{
							System.out.println(order);
						}
					}
				}
				else 
				{
					System.out.println("User not found.");
				}
				break;
			}
			case 5:
			{
				System.out.println("Enter book name which you want to search : ");
				String bookname=scanner.next();
				List<Book> books=bookStore.searchBooksByTitle(bookname);
				
				if(books.isEmpty())
				{
					System.err.println("No book is available with given name : ");
				}
				else
				{
					System.err.println("Book found");
					for(Book book:books)
					{
						System.out.println(book);
					}
				}
				break;
			}
			case 6:
			{
				System.out.println("Enter author to search : ");
				String authorname=scanner.next();
				List<Book> books=bookStore.searchBooksByAuthor(authorname);
				
				if(books.isEmpty())
				{
					System.err.println("No book is available by given author : ");
				}
				else
				{
					System.err.println("Book found");
					for(Book book:books)
					{
						System.out.println(book);
					}
				}
				break;
			}
			case 7:
			{
				System.err.println("Existing program.");
				scanner.close();
				System.exit(0);
			}
			default:
			{
				System.err.println("Invalid choice.Please enter valid option.");
			}
			
			
			}
		}
	}

}
