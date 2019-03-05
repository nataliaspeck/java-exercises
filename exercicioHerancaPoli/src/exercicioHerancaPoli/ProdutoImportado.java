package exercicioHerancaPoli;

public class ProdutoImportado extends Produto {
	private double taxaAlfandega;
	
	public ProdutoImportado(String nome, double preco, double taxaAlfandega) {
		super(nome, preco);
		this.taxaAlfandega = taxaAlfandega;
	}

	public double getTaxaAlfandega() {
		return taxaAlfandega;
	}

	public void setTaxaAlfandega(double taxaAlfandega) {
		this.taxaAlfandega = taxaAlfandega;
	}

	public double precoTotal() {
		return getPreco() + taxaAlfandega;
	}

	@Override
	public String etiquetaPreco() {
		return "Produto [Nome = " 
				+ getNome() 
				+ ", preço =" 
				+ precoTotal()
				+ ", taxa da alfândega"
				+ taxaAlfandega
				+ "]";
	}
}
