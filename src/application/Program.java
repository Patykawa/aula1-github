package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Product[] vect = new Product[n];
		
		for (int i=0; i<n; i++) {
			sc.nextInt();
			String name = sc.findInLine();
			double price = sc.nextDouble();
			vector [n] = new Product(name, price);
		}
	
	}
}