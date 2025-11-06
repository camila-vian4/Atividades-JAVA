package Atividades;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Exercicio 3: Desenvolva um programa que leia três números inteiros e exiba a média aritmética deles.\n");
		
		System.out.println("MÉDIA ARITMÉTICA - ESCOLAR:\n");
		
		System.out.print("Informe a 1° nota: ");
		int nota1 = input.nextInt();
		
		System.out.print("Informe a 2° nota: ");
		int nota2 = input.nextInt();
		
		System.out.print("Informe a 3° nota: ");
		int nota3 = input.nextInt();
		
		System.out.println("\n-- RESULTADO:\n");
		double media = (nota1 + nota2 + nota3) / 3.0; 
		System.out.printf("Nota final: %.2f", media);
		
		input.close();

	}

}
