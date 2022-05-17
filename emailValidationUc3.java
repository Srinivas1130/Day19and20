package com.bridgelabz.day20;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class emailValidationUc3 {
	private static void validatingUserFirstName() {

		String firstNamePattern = "[A-Z]{1}[a-z]{2,}";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First Name:");
		String firstName = scanner.next();

		Pattern pattern = Pattern.compile(firstNamePattern);
		Matcher matcher = pattern.matcher(firstName);
		boolean result = matcher.matches();

		if(result == true)
			validatingUserLastName();
		else
			System.out.println("First Name is Invalid");
	}

	private static void validatingUserLastName() {

		String lastNamePattern = "[A-Z]{1}[a-z]{2,}";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Last Name:");
		String lastName = scanner.next();

		Pattern pattern1 = Pattern.compile(lastNamePattern);
		Matcher matcher1 = pattern1.matcher(lastName);
		boolean result1 = matcher1.matches();

		if(result1 == true)
			validatingUserEmail();
		else
			System.out.println("Last Name is invalid");
	}

	private static void validatingUserEmail() {
		//UC3 User need to enter valid Email
		String emailPattern = "[A-Za-z0-9]+@[a-z0-9]*+[.][a-z]*";
		System.out.println("Enter your Email:");
		Scanner scanner = new Scanner(System.in);
		String email = scanner.next();

		Pattern pattern2 = Pattern.compile(emailPattern);
		Matcher matcher2 = pattern2.matcher(email);
		boolean result2 = matcher2.matches();

		if(result2 == true)
			System.out.println("Email is Valid");
		else
			System.out.println("Email is invalid");
	}

	public static void main(String[] args) {
		System.out.println("Welcome to User Registration program");
		emailValidationUc3.validatingUserFirstName();
	}
}
