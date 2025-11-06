package Atividades;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 System.out.println("Exercício 10: Crie um programa que leia um número inteiro e exiba a tabuada desse número de 1 até 10.");
		 
		 System.out.println("\n-- TABUADA:\n");
		 
		 System.out.print("Informe um número e descubra sua tabuada: ");
		 
		 int numInt = input.nextInt();
		 double numDouble = numInt;
			
			System.out.println("\n-- ADIÇÃO:\n");
			
			for (int i = 1; i <= 10; i++) { 
			System.out.printf("%d + %d = %d\n", i, numInt, i + numInt);
			
			}
			
			System.out.println("\n-- SUBTRAÇÃO:\n");
			
			for (int i = 1; i <= 10; i++) { 
			System.out.printf("%d - %d = %d\n", numInt, i, numInt - i);
			
			}
			System.out.println("\n-- MULTIPLICAÇÃO:\n");
			 
			for (int i = 1; i <= 10; i++) { 
				System.out.printf("%d x %d = %d\n", numInt, i, numInt * i);
				
			}
			
			System.out.println("\n-- DIVISÃO:\n");
			
			for (double i = 1; i <= 10; i++) { 
			System.out.printf("%.1f / %.1f = %.1f\n", numDouble, i, numDouble / i);
			
			}
		
		input.close();
		
	}

}
