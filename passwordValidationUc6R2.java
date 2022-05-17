package com.bridgelabz.day20;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class passwordValidationUc6R2 {
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

		String emailPattern = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9]+)*@" + "(?:[a-zA-Z0-9]+\\.)+[a-zA-Z]{2,7}$";
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
		//UC4 User need to enter valid Mobile Number
		String mobileNoPattern = "(91-)?[6-9][0-9]{9}";
		System.out.println("Enter your Mobile Number:");
		Scanner scanner = new Scanner(System.in);
		String mobileNumber = scanner.next();

		Pattern pattern3 = Pattern.compile(mobileNoPattern);
		Matcher matcher3 = pattern3.matcher(mobileNumber);
		boolean result3 = matcher3.matches();

		if(result3 == true)
			validatingUserPasswordRule1();
		else
			System.out.println("Mobile Number is invalid");
	}

	private static void validatingUserPasswordRule1() {

		String passwordPaternRule1 = "[a-zA-Z0-9~!@#$]{8,}";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your Password for Rule1:");
		String passwordRule1 = scanner.next();

		Pattern pattern4 = Pattern.compile(passwordPaternRule1);
		Matcher matcher4 = pattern4.matcher(passwordRule1);
		boolean result4 = matcher4.matches();

		if(result4 == true)
			validatingUserPasswordRule2();
		else
			System.out.println("Password is invalid & plz enter minimum 8 character");
	}

	private static void validatingUserPasswordRule2() {
		//UC6 User need to enter valid Password with at least one Uppercase
		String passwordPaternRule2 = "([A-Z]){1}[0-9a-zA-Z~!@#$]*";
		System.out.println("Enter your Password for Rule2:");
		Scanner scanner = new Scanner(System.in);
		String passwordRule2 = scanner.next();

		Pattern pattern5 = Pattern.compile(passwordPaternRule2);
		Matcher matcher5 = pattern5.matcher(passwordRule2);
		boolean result5 = matcher5.matches();

		if(result5 == true)
			System.out.println("Password is Valid");
		else
			System.out.println("Password is invalid & plz enter at least one Uppercase");
	}

	public static void main(String[] args) {
		System.out.println("Welcome to User Registration program");
		passwordValidationUc6R2.validatingUserFirstName();
	}
}
