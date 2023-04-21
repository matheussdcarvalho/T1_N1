package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Salário & cheques

	Scanner input = new Scanner(System.in);
	
	System.out.println("Digite o valor do salário: ");
	double salario = input.nextDouble(); 
	
	System.out.println("Digite o valor do primeiro cheque: ");
	double cheque1 = input.nextDouble();
		
	System.out.println("Digite o valor do segundo cheque: ");
	double cheque2 = input.nextDouble();
	
	double cpmf1 = cheque1 * 0.38/100;
	double cpmf2 = cheque2 * 0.38/100;
	
	double saldo = salario - cheque1 - cheque2 - cpmf1 - cpmf2;
	
	System.out.println("Seu saldo atual é: " + "R$" + saldo);
	
	}

}
