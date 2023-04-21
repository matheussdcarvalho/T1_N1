package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		// médiaPonderada

	Scanner input = new Scanner(System.in);

	System.out.println("Digite a primeira nota: ");
		double nota1 = input.nextDouble();
	
	System.out.println("Digite o peso da primeira nota: ");
		double peso1 = input.nextDouble();
		
	System.out.println("Digite a segunda nota: ");
		double nota2 = input.nextDouble();
		
	System.out.println("Digite o peso da segunda nota: ");
		double peso2 = input.nextDouble();	
		
	System.out.println("Digite a terceira nota: ");
		double nota3 = input.nextDouble();	
		
	System.out.println("Digite o peso da terceira nota: ");
		double peso3 = input.nextDouble();
		
	double mediaPonderada = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3)/(peso1 + peso2 + peso3);
		
	System.out.println("Sua média ponderada foi: " + mediaPonderada);
	
	}

}
