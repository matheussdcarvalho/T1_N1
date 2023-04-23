package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Contas atrasadas, 2%
		
				Scanner sc = new Scanner(System.in);
				double sal, conta1, conta2, salResto, totalContas;
			
				System.out.println("Digite o valor do salário de João: ");
				sal = sc.nextDouble();
			
				System.out.println("Digite o valor da PRIMEIRA conta: ");
				conta1 = sc.nextDouble();
			
				System.out.println("Digite o valor da SEGUNDA conta: ");
				conta2 = sc.nextDouble();
				
				totalContas = conta1 + (conta1 * 0.02) + conta2 + (conta2 * 0.02);
				
				salResto = sal - totalContas;
				
				System.out.println("O valor total a ser pago com as multas é: " + "R$" + totalContas);
				System.out.println("O saldo restante após o pagamento das contas é: " + "R$" + salResto);	

	}

}
