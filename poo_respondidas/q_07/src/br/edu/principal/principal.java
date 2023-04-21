package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		// salário + gratificação

	Scanner input = new Scanner(System.in);
	
	System.out.println("Digite seu salário: ");
		double salario = input.nextDouble();
		
	double imposto = salario * 10/100;
	
	double salreceber = salario + 50 - imposto;
	
	System.out.println("Seu salário final será: " + "R$" + salreceber);
	
	
	
	
	
	}

}
