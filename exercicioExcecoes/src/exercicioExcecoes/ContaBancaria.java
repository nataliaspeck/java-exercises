package exercicioExcecoes;

import java.util.Scanner;

public class ContaBancaria {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com as informações da conta");
		System.out.print("Número: ");
		int number = sc.nextInt();
		System.out.print("Nome do titular: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Saldo inicial: ");
		double balance = sc.nextDouble();
		System.out.print("Limite de saque: ");
		double withdrawLimit = sc.nextDouble();
		
		Conta acc = new Conta(number, holder, balance, withdrawLimit);
		
		System.out.println();
		System.out.print("Entre com a quantia a ser sacada: ");
		double amount = sc.nextDouble();
		
		try {
			acc.sacar(amount);
			System.out.println("Novo saldo: " + String.format("%.2f", acc.getSaldo()));
		}
		catch (Excecao e) {
			System.out.println("Erro de saque: " + e.getMessage());
		}
		
		sc.close();
	}

}
