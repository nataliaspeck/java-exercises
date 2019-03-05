package exercicioEnumComp;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Date momento;
	private StatusPedido status;
	private List<ItemPedido> itens = new ArrayList<>();
	private Cliente cliente;
	
	public Pedido() {
	}
	public Pedido(Date momento, StatusPedido status, Cliente cliente) {
		this.momento = momento;
		this.status = status;
		this.cliente = cliente;
	}
	
	public Date getMomento() {
		return momento;
	}
	public void setMomento(Date momento) {
		this.momento = momento;
	}
	public StatusPedido getStatus() {
		return status;
	}
	public void setStatus(StatusPedido status) {
		this.status = status;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public List<ItemPedido> getItens() {
		return itens;
	}
	public void addItem(ItemPedido itempedido) {
		itens.add(itempedido);
	}
	public void removeItem(ItemPedido itempedido) {
		itens.remove(itempedido);
	}
	public double total() {
		double soma = 0.0;
		for (ItemPedido it : itens) {
			soma += it.subtotal();
		}
		return soma;
	}
	@Override
	public String toString() {
		return "Pedido [momento=" 
				+ sdf.format(momento) 
				+ ", status=" 
				+ status 
				+ ", itens=" 
				+ itens 
				+ ", cliente=" 
				+ cliente 
				+ "]";
	}
	
	
	
}
