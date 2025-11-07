package Atividades;

import java.util.*;

public class AREA {

		// ATIVIDADE EM AULA - DESAFIO (calcular a area de um determinado lugar) inputar a base, altura e fazer base x altura.
		
		public static double calcularArea(double base, double altura) {
			
			double area = (base * altura) / 2;
			return area;
			
		}
		
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			System.out.println("-- ÁREA DO TRIANGULO:\n");
			System.out.print("Informe o valor da Base: ");
			double base = input.nextDouble();
			
			System.out.print("Informe o valor da Altura: ");
			double altura = input.nextDouble();
			
			double area = calcularArea(base, altura);
			
			System.out.printf("\nValor da àrea: %.2fm²", area);
			
			input.close();
			
		}

}