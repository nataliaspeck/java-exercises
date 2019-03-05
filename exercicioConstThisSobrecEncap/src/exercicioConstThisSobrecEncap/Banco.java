package exercicioConstThisSobrecEncap;

import java.util.Scanner;

public class Banco {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String name;
		char choice;
		int numeroConta;
		Conta conta;
		
		System.out.print("Entre com o nome do titular da conta: ");
		name = sc.nextLine();
		System.out.print("Entre com o número da conta: ");
		numeroConta = sc.nextInt();
		System.out.print("Deseja iniciar a conta com algum depósito? (y/n) ");
		choice = sc.next().charAt(0);
		if (choice == 'y') {
			double depositoInicial;
			System.out.print("Qual é o depósito inicial? ");
			depositoInicial = sc.nextDouble();
			conta = new Conta(name, numeroConta, depositoInicial);
		}else {
			conta = new Conta(name, numeroConta);
		}
		
		System.out.println("Informações da conta:");
		System.out.print(conta);
		
		System.out.println();
		System.out.print("Entre com um valor de depósito ");
		double depositValue = sc.nextDouble();
		conta.adicionarDeposito(depositValue);
		System.out.println("Informação da conta atualizada:");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Entre com uma valor de saque: ");
		double withdrawValue = sc.nextDouble();
		conta.sacarDeposito(withdrawValue);
		System.out.println("Informação da conta atualizada:");
		System.out.println(conta);
		
		sc.close();
	}

}
