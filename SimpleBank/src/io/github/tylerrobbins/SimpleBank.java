package io.github.tylerrobbins;

import java.util.Scanner;

public class SimpleBank {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Methods methods = new Methods(0);
		System.out.println("Welcome to the Simple Bank Application!");
		
		System.out.println("What would you like to do?");
		System.out.println("Add money to your account");
		System.out.println("Remove money from your account");
		System.out.println("Check your account balance");
		
		if(scanner.nextLine().equalsIgnoreCase("Add money to your account") || scanner.nextLine().equalsIgnoreCase("Add money to my account")) {
			methods.addCash();
		} else {
			return;
		}
		if(scanner.nextLine().equalsIgnoreCase("Remove money from your account") || scanner.nextLine().equalsIgnoreCase("Remove money from my account")) {
			methods.withdrawCash();
		} else {
			return;
		}
		if(scanner.nextLine().equalsIgnoreCase("Check your account balance") || scanner.nextLine().equalsIgnoreCase("Check my account balance")) {
			methods.checkCash();
		} else {
			return;
		}
		
	}
	
	
	

}
