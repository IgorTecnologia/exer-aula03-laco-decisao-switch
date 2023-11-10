package com.igor.cursojava.aula03;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		
		int cardapio;
		float quantidade;
		float valorTotal;
		float preco = 0;
		
		System.out.println("\n\t\tLanchonete Generation");
		
		System.out.println("\n1- Cachorro Quente | R$ 10.00 ");
		System.out.println("\n2- X-Salada | R$ 15.00");
		System.out.println("\n3- X-Bacon | R$ 18.00");
		System.out.println("\n4- Bauru | R$ 12.00");
		System.out.println("\n5- Refrigerante | R$ 8.00");
		System.out.println("\n6- Suco de laranja | R$ 13.00");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nEscreva o código do cardápio");
		cardapio = scan.nextInt();
		
		System.out.println("\nEscreva a quantidade de itens");
		quantidade = scan.nextInt();
		
		System.out.println();
		
		valorTotal = quantidade * preco;
		switch(cardapio) {
		case 1: 
			System.out.printf("\n Código do produto: 1"  + " | quantidade:  " +  quantidade  + " | Produto: Cachorro Quente"  + " | valor = R$  " + "%.2f ", (valorTotal = quantidade * 10));
			break;
		case 2:
			System.out.printf("\nCódigo do produto: 2" + " | quantidade: " + quantidade + " | Produto: X-Salada " + " | valor = R$ " + "%.2f ", (valorTotal = quantidade * 15));
			break; 
		case 3:
			System.out.printf("\nCódigo do produto: 3" + " | quantidade: " + quantidade + " | Produto: X-Bacon " + " | valor = R$ " + "%.2f ", (valorTotal = quantidade * 18));
			break;
		case 4:
			System.out.printf("\nCódigo do produto: 4" + " | quantidade: " + quantidade + " | Produto: Bauru " + " | valor = R$ " + "%.2f ", (valorTotal = quantidade * 12));
			break;
		case 5:
			System.out.printf("\nCódigo do produto: 5" + " | quantidade: " + quantidade + " | Produto: Refrigerante " + " | valor = R$ " + "%.2f ", (valorTotal = quantidade * 8));
			break;
		case 6:
			System.out.printf("\nCódigo do produto: 6" + " | quantidade: " + quantidade + " | Produto: Suco de laranja " + " | valor = R$ " + "%.2f ", (valorTotal = quantidade * 13));
			break;
		default:
			System.out.println("\nComando inválido!!!");
		}
		
	}
}

