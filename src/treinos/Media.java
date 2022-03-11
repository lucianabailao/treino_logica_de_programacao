package treinos;

import java.util.Scanner;


public class Media {

	public static void main(String[] args) {
				    
				Scanner sc = new Scanner (System.in);
				double a = sc.nextDouble();
				double b = sc.nextDouble();
				double media = (3.5 * a + 7.5*b)/11;
				sc.close();
				System.out.println(String.format("MEDIA = %.5f", media));
			}
				    
				
			
}
