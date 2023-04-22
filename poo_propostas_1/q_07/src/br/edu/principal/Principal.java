package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Aumento salário

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu salário atual");
			double sal = sc.nextDouble();
		
		if(sal < 500) {
			double novoSal = sal + (sal * 30/100);
			System.out.println("Seu novo salário é: " + "R$" + novoSal);
					
		}else {
			System.out.println("Você não tem direito ao aumento!");
		}
	}

}
