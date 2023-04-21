package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// depósito e taxa de juros

	Scanner input = new Scanner(System.in);
	
	System.out.println("Digite o valor do depósito: ");
		double deposito = input.nextDouble();
	
	System.out.println("Digite a taxa de juros: ");
		double taxa = input.nextDouble();
	
	double rendimento = deposito * taxa/100;	
		
	double total = deposito + rendimento;
	
	System.out.println("O valor do rendimento foi: " + "R$" + rendimento);
	System.out.print("\n");
	System.out.println("O valor total foi: " + "R$" + total);
		
		
	}

}
