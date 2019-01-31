package com.ahmed.acount;

public class Acount1 {

	int acc_no;
	String name;
	float amount;
	int phone;

	void insert(int a, String n, float amt, int ph) {

		acc_no = a;
		name = n;
		amount = amt;
		phone = ph;

	}

	void deposit(float amt) {
		amount = amount + amt;
		System.out.println(amt + "deposit");

	}

	void withdraw(float amt) {
		if (amount < amt) {
			System.out.println("insufficient Balance");
		} else {
			amount = amount - amt;
			System.out.println(amt + "withdrawn");
		}

	}

	void checkBalance() {
		System.out.println("Balance is :" + amount);
	}

	void display() {
		System.out.println(acc_no +" \n "+ name + "\n " + amount+" \n"+"phone Number: " + phone);
		
	}

	void phone() {

		System.out.println();
	}

	public class Main {

	}

	public static void main(String[] args) {
		Acount1 a1 = new Acount1();
		a1.insert(1234, "Ahmed", 40000, 77023455);
		a1.display();
		a1.checkBalance();
		a1.deposit(1000);
		a1.checkBalance();
		a1.withdraw(15000);
		a1.checkBalance();
		
	}

}
