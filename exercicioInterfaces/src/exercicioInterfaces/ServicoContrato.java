package exercicioInterfaces;

import java.util.Calendar;
import java.util.Date;

public class ServicoContrato {
	
	private ServicoPagamentoOnline servPagOn;
	
	public ServicoContrato(ServicoPagamentoOnline servPagOn) {
		this.servPagOn = servPagOn;
	}

	public void processarContrato(Contrato contrato, Integer meses){
		double basicQuota = contrato.getValorTotal() / meses;
        for (int i = 1; i <= meses; i++) {
            Date date = addMeses(contrato.getData(), i);
            double updatedQuota = basicQuota + servPagOn.juro(basicQuota, i);
            double fullQuota =  updatedQuota + servPagOn.taxaPagamento(updatedQuota);
            contrato.addPrestacao(new Prestacao(date, fullQuota));
        }
	}
	
	private Date addMeses(Date data, Integer meses) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(data);
		cal.add(Calendar.MONTH, meses);
		return cal.getTime();
	}
}
