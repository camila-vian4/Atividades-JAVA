package Atividades;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Exercício 5: Escreva um programa que leia a idade de uma pessoa e diga se ela é menor de idade, maior de idade ou idosa.\n");
		
		System.out.println("-- IDENTIDADE - FAIXA ETÁRIA:\n");
		
		System.out.print("Informe a sua idade: ");
		int idade = input.nextInt();
		
		if (idade < 18) {
			System.out.println("\nResultado: Você é menor de idade.");
			
		} else if (idade >= 60) {
			System.out.println("\nResultado: Você é idoso(a).");
			
		} else {
			System.out.println("\nResultado: Você é maior de idade.");
		}
		
		input.close();
	}

}
