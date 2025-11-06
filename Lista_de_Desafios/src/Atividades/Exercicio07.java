package Atividades;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Exercício 7: Faça um programa que leia o valor de uma compra e o método de pagamento (à vista, cartão, parcelado) e mostre o valor final.\n");
		
		System.out.println("\n-- BANCO DIGITAL:\n");
		
		System.out.print("Informe o valor da compra: ");
		double valorInicialCompra = input.nextDouble();
		
		while (true) {
			
			System.out.println("\nMÉTODOS DE PAGAMENTOS:\n");
			System.out.println("1 - À vista (10% de desconto)");
			System.out.println("2 - Cartão (sem juros)");
			System.out.println("3 - Parcelado (10% de acréscimo)");
		
			System.out.print("\nEscolha a opção (1, 2 ou 3): ");
			int metodoPag = input.nextInt();
		
			double valorFinal;
		
			switch (metodoPag) {
		
				case 1:
					valorFinal = valorInicialCompra * 0.90;
					System.out.printf("\nVocê utilizou o pagamento à vista e ganhou 10 porcento de desconto! Valor final: R$ %.2f.", valorFinal);
					break;
			
				case 2:
					valorFinal = valorInicialCompra;
					System.out.printf("\nVocê utilizou o pagamento pelo cartão! Valor final: R$ %.2f.", valorFinal);
					break;
			
				case 3: 
					valorFinal = valorInicialCompra * 1.10;
					System.out.printf("\nVocê utilizou o pagamento parcelado e teve um acréscimo de 10 porcento! Valor final: R$ %.2f.", valorFinal);
					break;
			
				default:
					System.out.println("\nOpção inválida! Tente novamente (1, 2 ou 3).");
					continue;
		
			}
			
			break;
			
		}
			
		input.close();
		
	}
	
}
