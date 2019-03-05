package exercicioConstThisSobrecEncap;

public class Conta {
	
	private String name;
	private int numeroConta;
	private double deposito;
	
	
	public Conta() {
	}
	
	public Conta(String name, int numeroConta, double depositoInicial) {
		this.name = name;
		this.numeroConta = numeroConta;
		adicionarDeposito(depositoInicial);
	}
	
	public Conta(String name, int numeroConta) {
		this.name = name;
		this.numeroConta = numeroConta;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public double getDeposito() {
		return deposito;
	}
	
	public void adicionarDeposito(double quantidadeAdd) {
		this.deposito += quantidadeAdd;
	}
	
	public void sacarDeposito(double saque) {
		this.deposito -= saque + 5.0;
	}

	@Override
	public String toString() {
		return "Conta [name=" + name + ", numeroConta=" + numeroConta + ", deposito=" + deposito + "]";
	}
	
	
}
