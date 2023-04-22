package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		// T1 Q08_P
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu peso em quilos: ");
			double pKg = sc.nextDouble();
			
		double Pgramas = pKg * 1000;
		
		System.out.println("Seu peso em gramas é: " + Pgramas + "g");
		
		
		
		
		
	}

}
