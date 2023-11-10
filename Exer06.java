package com.igor.cursojava.aula03;

import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {
		
		String nome;
		int codigo;
		float salario;
		float reajuste =0 ;
		float novoSalario;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nCodigo do cargo | cargo | Percentual do reajuste");
		System.out.println("\n   1            |Genente |        10%");
		System.out.println("\n   2            |Vendedor|        7%");
		System.out.println("\n   3            |Supervisor|      9%");
		System.out.println("\n   4            |Motorista|       6%");
		System.out.println("\n   5            |Estoquista|      5%");
		System.out.println("\n   6            |Técnico de TI|   8%");
		
		System.out.println("\nDigite o nome:");
		nome = scan.nextLine();
		
		System.out.println("\nDigite o código do colaborador:");
		codigo = scan.nextInt();
		
		System.out.println("\nDigite o salário:");
		salario = scan.nextFloat();
		
		novoSalario = salario + (salario * reajuste );
		
		switch(codigo) {
		case 1:
			System.out.println("\nNome do colaborador: " + nome + " | Cargo: Gerente"  + " | salário: R$ " + (novoSalario += ( salario / 100 ) *10));
			break;
		case 2:
			System.out.println("\nNome do colaborador: " + nome + " | Cargo: Vendedor" + " | salário: R$ " + (novoSalario += (salario / 100) * 7));
			break;
		case 3:
			System.out.println("\nNome do colaborador: " + nome + " | Cargo: Supervisor" + " | salário: R$ " + (novoSalario += (salario / 100) * 9));
			break;
		case 4: 
			System.out.println("\nNome do colaborador: " + nome + " | Cargo: Motorista" + " | salário: R$ " + (novoSalario += (salario / 100) * 6));
			break;
		case 5: 
			System.out.println("\nNome do colaborador: " + nome + " | Cargo: Estoquista" + " | salário: R$ " + (novoSalario += (salario / 100) * 5));
			break;
		case 6:
			System.out.println("\nNome do colaborador: " + nome + " | Cargo: Técnico de ti" + " | salário: R$" + (novoSalario += (salario / 100) * 8));
			break;
		default:
			System.out.println("\nInformações inválidas!!!");
		}
	}

}
