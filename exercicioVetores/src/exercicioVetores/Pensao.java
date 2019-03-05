package exercicioVetores;

import java.util.Scanner;

/* A dona de um pensionato possui dez quartos para alugar para estudantes,
sendo esses quartos identificados pelos números 0 a 9.
Fazer um programa que inicie com todos os dez quartos vazios, e depois
leia uma quantidade N representando o número de estudantes que vão
alugar quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel dos
N estudantes. Para cada registro de aluguel, informar o nome e email do
estudante, bem como qual dos quartos ele escolheu (de 0 a 9). Suponha
que seja escolhido um quarto vago. Ao final, seu programa deve imprimir
um relatório de todas ocupações do pensionato, por ordem de quarto,
conforme exemplo. */

public class Pensao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EstudantePensao[] pensao = new EstudantePensao[10];
		
		System.out.print("Quantos estudantes vão alugar quartos? ");
		int n = sc.nextInt();
		
		for (int i=1; i <= n; i++) {
			System.out.println("Estudante " + i + ":");
			System.out.print("Insira o nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Insira o email: ");
			String email = sc.nextLine();
			System.out.print("Insira o número do quarto: ");
			int numQuarto = sc.nextInt();
			pensao[numQuarto] = new EstudantePensao(name, email);
		}
		
		System.out.println("Quartos alugados no pensionato:");
		
		for (int i=0; i < 10; i++) {
			if (pensao[i] != null) {
				System.out.println("Quarto " + i + " = " + pensao[i]);
			}
		}
		
		sc.close();
	}

}
