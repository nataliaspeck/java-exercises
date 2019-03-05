package exercicioInterfaces;

public class ServicoPaypal implements ServicoPagamentoOnline{

	@Override
	public Double taxaPagamento(Double quantia) {
		return quantia * 0.02;
	}

	@Override
	public Double juro(Double quantia, Integer meses) {
		return quantia * meses * 0.01;
	}

}
