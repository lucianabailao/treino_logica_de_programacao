package treinos;

import java.util.Scanner;

public class Prod {

	public static void main(String[] args) {
	    
		Scanner sc = new Scanner (System.in);
		System.out.println("digite o primeiro numero:");
		int num1 = sc.nextInt();
		System.out.println("digite o segundo numero:");
		int num2 = sc.nextInt();
		int prod = num1 * num2;
		sc.close();
		System.out.println("PROD = " + prod);
		}
	}