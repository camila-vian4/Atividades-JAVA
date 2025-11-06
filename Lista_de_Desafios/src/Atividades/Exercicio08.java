package Atividades;

import java.util.*;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Exercício 8: Crie um programa que leia três números e mostre-os em ordem crescente.");
		
		System.out.println("\n-- ORGANIZAÇÃO EM ORDEM CRESCENTE:\n");
		
		System.out.print("Informe o 1° número: ");
		int num1 = input.nextInt();
		
		System.out.print("Informe o 2° número: ");
		int num2 = input.nextInt();
		
		System.out.print("Informe o 3° número: ");
		int num3 = input.nextInt();
		
		int[] numeros = {num1, num2, num3};
		Arrays.sort(numeros); // função pra ordenar em ordem crescente
		
		
		System.out.print("\nNúmeros em ordem crescente: ");
		
		for (int i = 0; i < numeros.length; i++) { 
		    if (i > 0) System.out.print(", "); // para ter vírgula e também evitar de ter uma vírgula antes de ter um número, por isso i > 0
		    System.out.print(numeros[i]);
		}
		
		input.close();
	}

}
