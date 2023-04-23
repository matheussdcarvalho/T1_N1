package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Área quadrado
		
		Scanner sc = new Scanner(System.in);
		double lado, area = 0;
	
		System.out.println("Digite a medida do lado do quadrado: ");
		lado = sc.nextDouble();
	
		area = lado * lado;
	
		System.out.println("A área do quadrado é: " + area);


	}

}
