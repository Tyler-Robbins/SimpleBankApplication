package io.github.tylerrobbins;
import java.util.Scanner;

public class Methods {
	
	private double cashAmount;
	
	
	public Methods(double totalCash) {
		totalCash = cashAmount;
	}
	
	public double addCash() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How much would you like to add to your account?");
		double cashAdd = scanner.nextDouble();
		cashAmount += cashAdd;
		System.out.println("You now have " + cashAmount + "!");
		
		return cashAdd;
	}
	
	public double withdrawCash() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How much would you like to withdraw from your account?");
		double cashRemove = scanner.nextDouble();
		if(cashAmount < cashRemove) {
			System.out.println("Unfortunately you can not remove this amount of cash from your bank!");
		} else {
		cashAmount -= cashRemove;
		}
		System.out.println("You now have " + cashAmount + "!");
		
		return cashAmount;
	}
	
	public double checkCash() {
		System.out.println("You now have " + cashAmount + "!");
		return cashAmount;
	}

}
