package Atividades;

import java.util.Scanner;

public class Exercicio15 {
	
	public static void calcularIMC(double peso, double altura) {
		
		double imc = peso / (altura * altura);
		System.out.printf("\nO SEU IMC É: %.2f.", imc);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Exercício 15: Crie um método calcularIMC(double peso, double altura) que retorne o valor do IMC formatado com duas casas decimais.\n");
		
		System.out.println("-- VERIFIQUE O SEU IMC:\n");
		
		System.out.print("Informe o seu peso: ");
		double peso = input.nextDouble();
		
		System.out.print("Informe a sua altura: ");
		double altura = input.nextDouble();
		
		calcularIMC(peso, altura);
		
		input.close();

	}

}
