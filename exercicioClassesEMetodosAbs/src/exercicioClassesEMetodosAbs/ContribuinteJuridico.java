package exercicioClassesEMetodosAbs;

public class ContribuinteJuridico extends Contribuinte {
	private Integer numFunc;
	
	public ContribuinteJuridico() {
		super();
	}
	public ContribuinteJuridico(String name, Double rendaAnual, Integer numFunc) {
		super(name, rendaAnual);
		this.numFunc = numFunc;
	}
	public Integer getNumFunc() {
		return numFunc;
	}
	public void setNumFunc(Integer numFunc) {
		this.numFunc = numFunc;
	}
	@Override
	public Double impostoPago() {
		if (getNumFunc() < 10) {
			return getRendaAnual() * 0.16;
		}else {
			return getRendaAnual() * 0.14;
		}
	}
	
}
