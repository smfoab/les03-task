package by.htp.les02.main;

import java.util.Scanner;

public class Ex13a {

	public static void main(String[] args) {
		double a = 0;
		double b = 0; 
		double c = 0;
		double d;
		
		Scanner sc = new Scanner(System.in);
		
		///////////////////////////////////////////////////
		
		System.out.print("Введите a:");		
		while(!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.print("Введите a:");			
		}
		
		a = sc.nextDouble();
		
		/////////////////////////////////////////////////////////
		
		System.out.print("Введите b:");		
		while(!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.print("Введите b:");
		}
		
		b = sc.nextDouble();
		
		/////////////////////////////////////////////////////////
		
		System.out.print("Введите c:");		
		while(!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.print("Введите c:");
		}
		
		c = sc.nextDouble();
		
		////////////////////////////////////////////////////////////////
		
		double temp;
		
		temp = 2 * a;
		
		if (temp == 0) {
			System.out.println("Знаменатель равен нулю");
			return;
		}
		
		d = (b + (Math.sqrt((b * b) + (4 * a * c))) / temp) - ((a * a * a) * c) + b;
			System.out.println("Ответ: " + d);	

	}

}
