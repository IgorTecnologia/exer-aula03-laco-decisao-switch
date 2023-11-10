package com.igor.cursojava.aula03;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		
		float numero1;
		float numero2;
		int operacao;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\n ***** Simulador de calculadora *****");
		System.out.println("\nCódigo       Operação");
		System.out.println("\n  1            Soma");
		System.out.println("\n  2            Subtração");
		System.out.println("\n  3            Multiplicação");
		System.out.println("\n  4            Divisão");
		
		System.out.println("\nEntre com o primeiro número:");
		numero1 = scan.nextFloat();
		
		System.out.println("\nEntre com o segundo número:");
		numero2 = scan.nextFloat();
		
		System.out.println("\nEntre com o código da operação aritimética");
		operacao = scan.nextInt();
		
		switch(operacao) {
		case 1:
			System.out.println("\n10.0 + 5.0 = " + (numero1 + numero2));
			break;
		case 2:
			System.out.println("\n10.0 - 5.0 = " + (numero1 - numero2));
			break;
		case 3:
			System.out.println("\n10.0 * 5.0 = " + (numero1 * numero2));
			break;
		case 4:
			System.out.println("\n10.0 / 5.0 = " + (numero1 / numero2));
			break;
			default:
				System.out.println("\nOperação inválida!");
		}

	}

}
