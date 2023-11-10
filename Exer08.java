package com.igor.cursojava.aula03;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		
		int operacao;
		float saldo = 1000.00f;
		float saque;
		float deposito;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nCódigo da Operação        Operação");
		System.out.println("\n    1                      Saldo");
		System.out.println("\n    2                      Saque");
		System.out.println("\n    3                      Depósito");
		
		System.out.println("\nEntre com o código da operação");
		operacao = scan.nextInt();
		
		switch(operacao) {
		case 1:
			System.out.println("\nSaldo: R$ " + saldo);
			break;
		case 2:
			System.out.println("\nOperação - saque:");
			System.out.println("\nDigite o valor do saque:");
			saque = scan.nextFloat();
			if(saque>=10000.00) {
				System.out.println("\nSaldo insuficiente!");
				break;
			}else if(saque <=1000.00) {
				System.out.println("\nNovo Saldo: R$ " + (saldo - 500));
				break;
			}
			case 3: 
				System.out.println("\nOperação - Depósito");
				System.out.println("\nDigite o valor do depósito:");
				deposito = scan.nextFloat();
				System.out.println("\nNovo Saldo: R$ 3000.00");
				break;
			default:
				System.out.println("\nOperação Inválida");
		}
	
	}
		
}
