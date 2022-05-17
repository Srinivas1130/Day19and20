package com.bridgelabz.day20;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class mobileNoValidationUc4 {
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

		String emailPattern = "[A-Za-z0-9.+-]+@[a-z0-9]+[.][a-z]";
		System.out.println("Enter your Email:");
		Scanner scanner = new Scanner(System.in);
		String email = scanner.next();

		Pattern pattern2 = Pattern.compile(emailPattern);
		Matcher matcher2 = pattern2.matcher(email);
		boolean result2 = matcher2.matches();

		if(result2 == true)
			validatingUserMobileNumber();
		else
			System.out.println("Email is invalid");
	}

	private static void validatingUserMobileNumber() {
		String mobileNoPattern = "(91-)?[6-9][0-9]{9}";
		System.out.println("Enter your Mobile Number:");
		Scanner scanner = new Scanner(System.in);
		String mobileNumber = scanner.next();

		Pattern pattern3 = Pattern.compile(mobileNoPattern);
		Matcher matcher3 = pattern3.matcher(mobileNumber);
		boolean result3 = matcher3.matches();

		if(result3 == true)
			System.out.println("Mobile Number is Valid");
		else
			System.out.println("Mobile Number is invalid");
	}

	public static void main(String[] args) {
		System.out.println("Welcome to User Registration program");
		mobileNoValidationUc4.validatingUserFirstName();
	}
}
