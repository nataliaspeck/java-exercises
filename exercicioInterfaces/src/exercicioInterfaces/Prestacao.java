package exercicioInterfaces;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Prestacao {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Date dataVencimento;
	private Double quantia;
	
	public Prestacao() {
	}
	public Prestacao(Date dataVencimento, Double quantia) {
		this.dataVencimento = dataVencimento;
		this.quantia = quantia;
	}
	public Date getDataVencimento() {
		return dataVencimento;
	}
	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	public Double getQuantia() {
		return quantia;
	}
	public void setQuantia(Double quantia) {
		this.quantia = quantia;
	}
	
	@Override
	public String toString() {
		return "Prestacao [dataVencimento=" 
				+ sdf.format(dataVencimento)
				+ ", quantia=" 
				+ quantia 
				+ "]";
	}
	
	
	
}
