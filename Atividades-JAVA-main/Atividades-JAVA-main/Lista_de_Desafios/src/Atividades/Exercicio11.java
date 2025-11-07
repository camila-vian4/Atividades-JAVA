package Atividades;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Exercício 11: Leia 10 números inteiros e conte quantos deles são pares e quantos são ímpares.");
		
		System.out.println("\n-- PAR E ÍMPAR:\n");
		
		int pares = 0;
		int impares = 0;
		
		for (int i = 1; i <= 10; i++) { 
			System.out.print("Digite o " + i + "º número: ");
			int num = input.nextInt();
			
			if (num % 2 == 0) {
				pares++;
				
			} else {
				impares++;
				
			}
			
		}
		
		System.out.println("\nQuantidade de números pares: " + pares);
		System.out.println("Quantidade de números ímpares: " + impares);
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																			
		input.close();
		
	}

}
