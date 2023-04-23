package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// CalculadoraÁreaTriângulo
		
	
		Scanner input = new Scanner (System.in);
		
			System.out.println("Digite a base do seu triangulo: ");
				int base = input.nextInt();
				
			System.out.println("Digite a altura do se triangulo: ");
				int altura = input.nextInt();
				
				double area = (base * altura)/2;
				
		System.out.println("A area do seu triangulo é: " + area);
	
	}

}
