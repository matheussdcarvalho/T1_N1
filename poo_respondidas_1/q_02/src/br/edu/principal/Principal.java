package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// médiaAritmética

	Scanner input = new Scanner (System.in);
	
		System.out.println("Digite sua PRIMEIRA nota: ");
			double nota1 = input.nextDouble();
			
		System.out.println("Digite sua SEGUNDA nota: ");
			double nota2 = input.nextDouble();
			
		System.out.println("Digite sua TERCEIRA nota: ");
			double nota3 = input.nextDouble();
			
		double media = (nota1 + nota2 + nota3)/3;
		
		System.out.println("A sua média é: " + media);
			
		
			
	}

}
