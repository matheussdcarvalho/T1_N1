package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		// ÁreaCírculo

		Scanner input = new Scanner (System.in);
		
		System.out.println("Digite o raio do círculo: ");
		double raio = input.nextDouble();
		
		double area = 3.1415 * raio * raio;
		
		System.out.println("A área do círculo é: " + area);
		
		
	}

}
