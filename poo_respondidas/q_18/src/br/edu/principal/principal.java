package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		// T1 Q18 R

	Scanner sc = new Scanner(System.in);	
	System.out.println("DIgite o peso do saco: ");
		double pesoSaco = sc.nextDouble();
		
	System.out.println("Digite a quanidade de ração fornecida ao gato 1: ");
		double racaoGato1 = sc.nextDouble();

	System.out.println("Digite a quanidade de ração fornecida ao gato 2: ");
		double racaoGato2 = sc.nextDouble();
	
	racaoGato1 = racaoGato1/1000;	
	racaoGato2 = racaoGato2/1000;	
		
	double total = pesoSaco - 5 * (racaoGato1 + racaoGato2);
	
	System.out.println("Restará " + total + "g" + " no saco após 5 dias");
	}

}
