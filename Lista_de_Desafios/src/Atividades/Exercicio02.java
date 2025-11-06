package Atividades;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
		System.out.println("Exercício 2: Crie um programa que leia dois números inteiros e exiba a soma, subtração, multiplicação e divisão entre eles.\n");
		
		System.out.println("-- CALCULADORA:\n");
		System.out.print("Informe um número: ");
		int num1 = input.nextInt();
		
		System.out.print("Informe outro número: ");
		int num2 = input.nextInt();
		
        System.out.println("\n-- RESULTADOS:\n");
        System.out.println("Adição: " + (num1 + num2));
        System.out.println("Subtração: " + (num1 - num2));
        System.out.println("Multiplição: " + (num1 * num2));
        System.out.println("Divisão: " + (num1 / num2));
        
        input.close();
	
	}

}
