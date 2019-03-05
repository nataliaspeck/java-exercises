package exercicioLista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salario) de
N funcionários. Não deve haver repetição de id.
Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário.
Para isso, o programa deve ler um id e o valor X. Se o id informado não existir, mostrar uma
mensagem e abortar a operação. Ao final, mostrar a listagem atualizada dos funcionários,
conforme exemplos.
Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário possa
ser mudado livremente. Um salário só pode ser aumentado com base em uma operação de
aumento por porcentagem dada. */

public class Salario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Funcionario> listaFunc = new ArrayList<>();
		System.out.print("Quantos funcionários serão cadastrados? ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Entre com os dados do funciorário " + i + ":");
			System.out.println("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Salário: ");
			double salario = sc.nextDouble();
			System.out.println("ID: ");
			int id = sc.nextInt();
			listaFunc.add(new Funcionario(name, id, salario));
		}
		
		System.out.println("ID: ");
		int id = sc.nextInt();
		Funcionario func = listaFunc.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (func == null) {
			System.out.println("Este funcionário não exite");
		}
		else {
			System.out.print("Insira a porcentagem: ");
			double percentage = sc.nextDouble();
			func.aumentarSalario(percentage);
		}
		
		System.out.println("Lista de funcionários atualizada:");
		
		for (Funcionario funcionario: listaFunc) {
			System.out.println(funcionario);
		}
		sc.close();
	}

}
