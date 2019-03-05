package exercicioClassesEMetodosAbs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Impostos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Contribuinte> cont = new ArrayList<>();
		
		System.out.print("Entre com o número de contribuintes: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Contribuinte #" + i + " dados:");
			System.out.print("Pessoa físca ou jurídica (f/j)? ");
			char type = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Renda anual: ");
			double income = sc.nextDouble();
			if (type == 'f') {
				System.out.print("Health expenditures: ");
				double gastoSaude = sc.nextDouble();
				cont.add(new ContribuinteFisico(name, income, gastoSaude));
			}
			else {
				System.out.print("Número de funcionários: ");
				int numb = sc.nextInt();
				cont.add(new ContribuinteJuridico(name, income, numb));
			}
			
			double soma = 0.0;
			for (Contribuinte ct : cont) {
				soma = soma + ct.impostoPago();
			}
			
			System.out.println("Total de imposto pago " + soma);
			
			sc.close();
		}
	}

}
