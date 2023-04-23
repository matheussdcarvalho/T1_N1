package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	
	Scanner input = new Scanner (System.in);
	
	System.out.println("Digite seu salário: ");
		double salario = input.nextDouble();
	
	double grat = salario * 5/100; 
	double imposto = salario * 7/100;

	double salReceber = salario + grat - imposto;
	
	System.out.println("Você receberá: " + "R$"+ salReceber);
	
	}

}
