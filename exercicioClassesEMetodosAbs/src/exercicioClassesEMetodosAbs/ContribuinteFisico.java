package exercicioClassesEMetodosAbs;

public class ContribuinteFisico extends Contribuinte {
	private Double gastoSaude;
	
	public ContribuinteFisico() {
		super();
	}
	public ContribuinteFisico(String name, Double rendaAnual, Double gastoSaude) {
		super(name, rendaAnual);
		this.gastoSaude = gastoSaude;
	}
	public Double getGastoSaude() {
		return gastoSaude;
	}
	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}
	@Override
	public Double impostoPago() {
		if (getRendaAnual() < 20000.0) {
			return (getRendaAnual() * 0.15) - (gastoSaude * 0.5);
		}else {
			return (getRendaAnual() * 0.25) - (gastoSaude * 0.5);
		}
	}
	
}
