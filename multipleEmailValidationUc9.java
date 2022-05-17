package com.bridgelabz.day20;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class multipleEmailValidationUc9 {

	private static void multipleEmailValidation() {
		//UC9 Should clear all email samples
		ArrayList<String> eMails = new ArrayList<String>();
		eMails.add("abc@yahoo.com");
		eMails.add("abc-100@yahoo.com");
		eMails.add("abc.100@yahoo.com");
		eMails.add("abc111@abc.com");
		eMails.add("abc-100@abc.net");
		eMails.add("abc.100@abc.com.au");
		eMails.add("abc@1.com");
		eMails.add("abc@gmail.com");
		eMails.add("abc+100@gmail.com");
		eMails.add("abc");
		String multipleEmailePattern = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9]+)*@" + "(?:[a-zA-Z0-9]+\\.)+[a-zA-Z]{2,7}$";
		Pattern pattern = Pattern.compile(multipleEmailePattern);

		for (String eMail: eMails) {
			Matcher matcher = pattern.matcher(eMail);
			System.out.println(eMail + " --> " + matcher.matches());
		}
	}

		public static void main(String[] args) {
			System.out.println("Welcome to User Registration program");
			multipleEmailValidation();
		}
	}
