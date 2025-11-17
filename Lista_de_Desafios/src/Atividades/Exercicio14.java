package Atividades;

import java.util.Scanner;
public class Exercicio14 {

	public static void soma(int a, int b) {
		
		int adicao = a + b;
		System.out.print("\nSOMA TOTAL = " + adicao);
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Exercício 14: Crie um método soma(int a, int b) que retorne a soma de dois números inteiros.");
		
		System.out.println("\n-- SOMA DE DOIS NÚMEROS INTEIROS:");
		
		System.out.print("\nInforme um número: ");
		int a = input.nextInt();
		
		System.out.print("Informe outro número: ");
		int b = input.nextInt();
		
		soma(a, b);

		input.close();
	}

}
