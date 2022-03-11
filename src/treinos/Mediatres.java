package treinos;

import java.util.Scanner; 


public class Mediatres {


	    public static void main(String[] args) {
	    
	    	   		 
	    	       Scanner entrada = new Scanner (System.in);
	    		    int A = entrada.nextInt();
	    		    int B = entrada.nextInt();
	    		    int C = entrada.nextInt();
	    		    int D = entrada.nextInt();;
	    		    int DIFERENCA;
	    		    DIFERENCA = A * B - C * D;
	    		    entrada.close();
	    		    System.out.printf("DIFERENCA = %d", + DIFERENCA);
	    }
	 
	}