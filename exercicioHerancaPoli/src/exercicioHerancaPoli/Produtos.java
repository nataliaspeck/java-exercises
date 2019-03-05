package exercicioHerancaPoli;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Produtos {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<Produto> produtos = new ArrayList<>();
		System.out.print("Entre com o número de produtos: ");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			System.out.println("Produto " + i + " =");
			System.out.println("O produto é normal, importado ou usado? n/i/u");
			char op = sc.next().charAt(0);
			System.out.print("Entre com o nome do produto: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Entre com o preço do produto: ");
			double preco = sc.nextDouble();	
			if (op == 'n') {
					produtos.add(new Produto(nome, preco));
			} else if(op == 'i') {
					System.out.print("Entre com a taxa da alfândega: ");
					double taxaAlfandega = sc.nextDouble();	
					produtos.add(new ProdutoImportado(nome, preco, taxaAlfandega));
			}else if(op == 'u') {
					System.out.print("Entre com o data de fabricação do produto dd/MM/yyyy: ");
					Date data = sdf.parse(sc.next());
					produtos.add(new ProdutoUsado(nome, preco, data));
			}
		}
		
		for (Produto prod: produtos) {
			System.out.println(prod.etiquetaPreco());
		}
		
		sc.close();
	}

}
