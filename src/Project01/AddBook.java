package Project01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class AddBook {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1 = new Scanner(System.in);
		System.out.print("add books press 1; search books press 2");
		int choice = sc1.nextInt();
		
		Set<Book> dataSet = new HashSet<>();
		Book book = new Book();
		
		dataSet.add(book);
		if(choice == 1) {
			int num = dataSet.size();
			dataSet.add(addBook());
			choose();
			while (choose().equals("Y")) {
				dataSet.add(addBook());
				choose();
			}
				

		
		
		}
		else if ( choice == 2) {
			System.out.println("please type in key words");
			String keyWords = sc1.nextLine();
			for (Book b :dataSet) {
				if (keyWords.equals(b.getAuthors())||keyWords.equals(b.getBookCondition())||keyWords.equals(b.getCourse())||keyWords.equals(b.getSubject())) {
					System.out.println("there is a book you may need belongs to " + b.getUserIdOfBook());
				}
				else System.out.println("sorry there is no such book yet");
			}
		}
	}
	public static Book addBook() {
		Scanner sc = new Scanner(System.in);
		Book book = new Book();
		System.out.println("please input authors ");
		String authors = sc.nextLine();
		book.setAuthors(authors);
		System.out.println("please input edition");
		String edition = sc.nextLine();
		book.setBookCondition(edition);
		System.out.println("please input  subject!");
		String subject = sc.nextLine();
		book.setSubject(subject);
		System.out.println("please input course");
		String course = sc.nextLine();
		book.setCourse(course);
		System.out.println("please input book condition");
		String bookCondition = sc.nextLine();
		book.setBookCondition(bookCondition);
		System.out.println("please input your User ID");
		String userIdOfBook = sc.nextLine();
		book.setUserIdOfBook(userIdOfBook);
		return book;

		
	}
	public static String choose() {
		Scanner cho = new Scanner(System.in);
		System.out.println("if you want to add another book press Y otherwise press N");
		String choose = cho.nextLine();
		return choose;
	}
}
