package exercicioHerancaPoli;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto {
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	Date dataFabricacao;
	
	public ProdutoUsado(String nome, double preco, Date dataFabricacao) {
		super(nome, preco);
		this.dataFabricacao = dataFabricacao;
	}
	public Date getDataFabricacao() {
		return dataFabricacao;
	}
	public void setDataFabricacao(Date dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}
	
	@Override
	public String etiquetaPreco() {
		return "Produto [Nome = " 
				+ getNome() 
				+ ", preço =" 
				+ getPreco() 
				+ ", data de fabricação"
				+ sdf.format(dataFabricacao)
				+ "]";
	}
}
