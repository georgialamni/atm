package gr.codehub.atm;

import java.util.Scanner;

public class AtmApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String userAnswer="";
		while(!userAnswer.equals("5")){
			menu();
			userAnswer = sc.nextLine();
		}
	}

	public static void menu() {
		System.out.println("Welcome to the bank");
		System.out.println("Choose one of the following options: ");
		System.out.println("1 - Deposit");
		System.out.println("2 - Withdraw");
		System.out.println("3 - Display Account Info");
		System.out.println("4 - Exit");
	}

}
