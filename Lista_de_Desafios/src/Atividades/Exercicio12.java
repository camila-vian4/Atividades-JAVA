package Atividades;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Exercício 12: Crie um programa que leia números até o usuário digitar 0 e exiba soma total, maior e menor número.\n");
		
		System.out.println("\n-- LEITURA DE NÚMEROS ATÉ 0 (SOMA TOTAL, MAIOR E MENOR):\n");
		
		System.out.print("Informe um número: ");
		int numero = input.nextInt();
		
		while (numero == 0) {
		    System.out.print("\nO 1° número não pode ser 0!");
		    System.out.print("\nInforme novamente outro número: ");
		    numero = input.nextInt();
		}
		
		int soma = numero;
		int maior = numero;
		int menor = numero;
		
		while (true) {

			System.out.print("Informe outro número: ");
			numero = input.nextInt();
			if (numero == 0) {
				break;
			}
			
			soma += numero;
			
			if (numero > maior) {
				maior = numero;
			}
			
			if (numero < menor) {
				menor = numero;
			}
			
		}
		
		System.out.println("\nSoma total: " + soma);
		System.out.println("Maior número: " + maior);
		System.out.println("Menor número: " + menor);
			
		input.close();

	}

}
