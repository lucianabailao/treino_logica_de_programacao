package treinos;

import java.util.Scanner;


public class Salario {

	public static void main(String[] args) {
		  Scanner entrada = new Scanner (System.in);
	        int numeroDofuncionario = entrada.nextInt();
	        int numeroDehorasTrabalhadas = entrada.nextInt();
	        double valorHora = entrada.nextDouble();
	        double salarioFuncionario = numeroDehorasTrabalhadas * valorHora;
	        
	        System.out.printf("N�mero do Funcion�rio = %d\nSal�rio do Funcion�rio = $%.2f\n" , numeroDofuncionario, salarioFuncionario);
	        
	        
	        entrada.close();

	}

}
