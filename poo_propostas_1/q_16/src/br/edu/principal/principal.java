package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		// T1 Q16 P

	Scanner sc = new Scanner(System.in);
		
	System.out.println("Digite o valor do cateto 1: ");
		double c1 = sc.nextDouble();
	System.out.println("Digite o valor do cateto 2: ");
		double c2 = sc.nextDouble();	
		
	double hipo = Math.sqrt(Math.pow(c1, 2) + Math.pow(c2, 2));
	
	System.out.println("O valor da hipotenusa é: " + hipo);
	}

}
