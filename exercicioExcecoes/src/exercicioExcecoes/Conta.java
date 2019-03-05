package exercicioExcecoes;

public class Conta {
	
	private Integer numConta;
	private String nomeTitular;
	private Double saldo;
	private Double limiteSaque;
	
	public Conta() {
	}
	public Conta(Integer numConta, String nomeTitular, Double saldo, Double limiteSaque) {
		this.numConta = numConta;
		this.nomeTitular = nomeTitular;
		this.saldo = saldo;
		this.limiteSaque = limiteSaque;
	}
	public Integer getNumConta() {
		return numConta;
	}
	public void setNumConta(Integer numConta) {
		this.numConta = numConta;
	}
	public String getNomeTitular() {
		return nomeTitular;
	}
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	public Double getSaldo() {
		return saldo;
	}
	public Double getLimiteSaque() {
		return limiteSaque;
	}
	public void setLimiteSaque(Double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}
	
	public void depositar(double quantia){
		saldo = saldo + quantia;
	}
	
	public void sacar(double quantia){
		if(saldo <= 0) {
			throw new Excecao("O saldo da conta é vazio, o saque não pode ser realizado");
		}else
		if(quantia > saldo) {
			throw new Excecao("O valor a ser retirado é maior que o saldo");
		}else
		if(quantia > limiteSaque) {
			throw new Excecao("O valor a ser retirado é maior que o limite de saque");
		}else
		saldo = saldo - quantia;
	}
	
}
