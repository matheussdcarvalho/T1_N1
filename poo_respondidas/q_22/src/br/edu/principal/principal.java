package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		// T1 Q22 R

	Scanner sc = new Scanner(System.in);
	System.out.println("Digite o valor do salário mínimo: ");
		double sal = sc.nextDouble();
	
	System.out.println("Digite a quantidade de quilowatts consumida: ");
		double qtdKw = sc.nextDouble();
		
	double vlrKw = sal/5;
	double vlrReais = vlrKw * qtdKw;
	double desc = vlrReais * 15/100;
	double vlrDesc = vlrReais - desc;
	
	System.out.println("O valor de cada quilowatt foi: " + vlrKw);
	System.out.println("O valor a ser pago é: " + "R$" + vlrReais);
	System.out.println("O valor com desconto é: " + "R$" + vlrDesc);	
	
		
	}

}
