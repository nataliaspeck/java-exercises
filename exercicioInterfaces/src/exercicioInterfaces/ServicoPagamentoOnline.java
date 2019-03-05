package exercicioInterfaces;

public interface ServicoPagamentoOnline {
	Double taxaPagamento(Double quantia);
	Double juro(Double quantia, Integer meses);
}
