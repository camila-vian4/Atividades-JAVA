package Atividades;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Exercício 6: Crie um programa que leia um número e informe se ele é positivo, negativo ou zero.");
		
		System.out.println("\n-- POSITIVO, NEGATIVO OU ZERO:\n");
		
		System.out.print("Informe um número: ");
		int numero = input.nextInt();
		
		if (numero > 0) {
			System.out.println("\nO número que você informou é POSITIVO.");
		} else if (numero < 0) {
			System.out.println("\nO número que você informou é NEGATIVO.");
		} else {
			System.out.println("\nO número que você informou é ZERO.");
		}
		
		input.close();
	}

}
