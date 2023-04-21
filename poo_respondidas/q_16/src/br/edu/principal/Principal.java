package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//16 R

	Scanner sc = new Scanner(System.in);
	System.out.println("Digite a quantidade de horas trabalhadas: ");
		double horasT = sc.nextDouble();
	
	System.out.println("Digite o valor do salário mínimo: ");
		double vlrSalMin = sc.nextDouble();
		
	double vlrHoraT = vlrSalMin/2;
	double vlrSalBru = vlrHoraT * horasT;	
	double imp = vlrSalBru * 3/100;	
	double salLiq = vlrSalBru - imp;	
		
	System.out.println("O valor do salário líquido é: " + salLiq);
	}

}
