package exercicioInterfaces;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Pagamento {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Entre com as informações do contrato");
		System.out.print("Número: ");
		int number = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy): ");
		Date date = sdf.parse(sc.next());
		System.out.print("Valor do contrato: ");
		double totalValue = sc.nextDouble();
		
		Contrato contract = new Contrato(number, date, totalValue);
		
		System.out.print("Entre com o número de prestações: ");
		int n = sc.nextInt();
		
		ServicoContrato contractService = new ServicoContrato(new ServicoPaypal());
		
		contractService.processarContrato(contract, n);
		
		System.out.println("Installments:");
		for (Prestacao x : contract.getPrestacoes()) {
			System.out.println(x);
		}
		
		sc.close();
	}

}
