package exercicioInterfaces;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contrato {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Integer numero;
	private Date data;
	private Double valorTotal;
	private List<Prestacao> prestacoes = new ArrayList<Prestacao>();

	public Contrato() {
	}
	public Contrato(Integer numero, Date data, Double valorTotal) {
		this.numero = numero;
		this.data = data;
		this.valorTotal = valorTotal;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public List<Prestacao> getPrestacoes() {
		return prestacoes;
	}
	public void addPrestacao(Prestacao prestacao) {
		prestacoes.add(prestacao);
	}
	public void remPrestacao(Prestacao prestacao) {
		prestacoes.remove(prestacao);
	}
	
	@Override
	public String toString() {
		return "Contrato [numero=" 
				+ numero 
				+ ", data=" 
				+ sdf.format(data) 
				+ ", valorTotal=" 
				+ valorTotal 
				+ "]";
	}
	
	
}
