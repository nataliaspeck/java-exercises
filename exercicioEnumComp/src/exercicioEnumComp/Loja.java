package exercicioEnumComp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Loja {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com os dados do cliente:");
		System.out.print("Nome: ");
		String name = sc.nextLine();
		sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		sc.nextLine();
		System.out.print("Birth date: ");
		Date nascimento = sdf.parse(sc.next());
		Cliente cliente = new Cliente(name, email, nascimento);
		System.out.print("Entre com o status do pedido: ");
		String status = sc.next();
		StatusPedido stat = StatusPedido.valueOf(status);
		Pedido pedido = new Pedido(new Date(), stat, cliente);
		System.out.print("Quantos itens para esse pedido? ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.print("Nome do produto: ");
			String nomeDoProduto = sc.nextLine();
			sc.nextLine();
			System.out.print("Preço do produto: ");
			double precoDoProduto = sc.nextDouble();
			Produto produto = new Produto(nomeDoProduto, precoDoProduto);
			System.out.print("Quantidade do produto: ");
			int quantidadeDoProduto = sc.nextInt();
			ItemPedido itempedido = new ItemPedido(quantidadeDoProduto, precoDoProduto, produto);
			pedido.addItem(itempedido);
		}
		
		System.out.println();
		System.out.println("INFO PEDIDO:");
		System.out.println(pedido);
		
		sc.close();
	}

}
