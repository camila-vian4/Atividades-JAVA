package Atividades;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Exercício 4: Faça um programa que leia o salário atual de um funcionário e aplique um reajuste de 15%, exibindo o novo salário.\n");
		
		System.out.println("-- CONTABILIDADE - ÁREA PARA REAJUSTE DE SALÁRIOS:\n");
		
		System.out.print("Informe o salário atual: ");
		double salarioAtual = input.nextDouble();
		
		double reajusteSalario = salarioAtual * 0.15;
		System.out.printf("Valor do reajuste: R$ %.2f%n", reajusteSalario);
		
		double novoSalario = salarioAtual + reajusteSalario;
		System.out.printf("Novo salário: R$ %.2f%n", novoSalario);
		
		input.close();

	}

}
