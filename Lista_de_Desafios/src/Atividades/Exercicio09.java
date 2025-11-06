package Atividades;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Exercício 9: Exiba todos os números de 1 a 50 utilizando o laço for.");
		
		System.out.println("\n-- LAÇO DE REPETIÇÃO (1 A 50):\n");	
		
		for (int i = 1; i <= 50; i++) { 

		    System.out.println(i);
		}
		
		input.close();
		
	}

}
