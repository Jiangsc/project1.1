package Project01;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Register {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<User> dataSet = new HashSet<>();
		User user = new User();
		Scanner sc1 = new Scanner(System.in);
		System.out.println("log in press 1 , sign up press 2");
		int choice = sc1.nextInt();
		if( choice == 2) {
		dataSet.add(user);
		
			int num = dataSet.size();
			dataSet.add(register());
		}
		else if ( choice == 1) {
			System.out.println("please type in your username");
			String userName = sc1.nextLine();
			System.out.println("please type in your password");
			String passWord = sc1.nextLine();
			for (User u :dataSet) {
				if(userName.equals(u.getUserName()) && passWord.equals(u.getPassword())) {
					System.out.println("succeed");
				}
				else System.out.println("please try again");
			}
		}

	}

	public static User register() {
		Scanner sc = new Scanner(System.in);
		User user = new User();
		System.out.println("please input your name!");
		String name = sc.nextLine();
		user.setUserName(name);
		System.out.println("please input your password!");
		String password = sc.nextLine();
		user.setPassword(password);
		System.out.println("please input your email!");
		String email = sc.nextLine();
		return user;

	}

}
