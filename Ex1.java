package curs5;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {

		int attempts = 0;
		int password = 1234;
		int pass;
		String testUser = "TestUser";
		String user;

		Scanner scan = new Scanner(System.in);

		do {

			System.out.println("Enter a user: ");
			user = scan.next();

			System.out.println("Enter a password: ");
			pass = scan.nextInt();

			attempts = attempts + 1;

			if ((user.equalsIgnoreCase(testUser) && pass == password)) {
				System.out.println("Login Sucessful");
			} else {
				System.out.println("Login Error");
			}

			if (((user.equalsIgnoreCase(testUser) && pass == password) == false) && attempts > 2) {
				System.out.println("Maximum attempts reached. User blocked");
			}

		} while (((user.equalsIgnoreCase(testUser) && pass == password) == false) && (attempts < 3));

	}

}