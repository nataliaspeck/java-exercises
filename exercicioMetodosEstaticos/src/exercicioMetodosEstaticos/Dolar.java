package exercicioMetodosEstaticos;

import java.util.Scanner;

public class Dolar {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		double cotacao, compraDolar, valor;
		System.out.println("Qual é a cotação do dólar?");
		cotacao = scanf.nextDouble();
		System.out.println("Quantos reais você pagará pelos dólares?");
		compraDolar = scanf.nextDouble();
		valor = ConversorCambio.cambio(cotacao, compraDolar);
		System.out.print("O valor de dólar a recerber é de: " + valor);
		scanf.close();
	}

}
