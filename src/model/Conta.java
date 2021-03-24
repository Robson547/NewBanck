package model;

public class Conta {

	String nome;
	String agencia;
	int numeroConta;
	double saldoCC;
	double saldoCP;
	boolean contaAtiva = false;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public double getSaldoCC() {
		return saldoCC;
	}
	public void setSaldoCC(double saldo) {
		this.saldoCC = saldo;
	}	
	public double getSaldoCP() {
		return saldoCP;
	}
	public void setSaldoCP(double saldo) {
		this.saldoCP = saldo;
	}
	public boolean getContaAtiva() {
		return contaAtiva;
	}
	public void setContaAtiva(boolean contaAtiva) {
		this.contaAtiva = contaAtiva;
		
		if (contaAtiva == true) {
			System.out.println("Conta está ativa!");
		}else {
			System.out.println("Conta está inativa!");
		}
			
	}
	public void transfere(double valor, ContaPoupanca destino) {
        this.saldoCC = this.saldoCC - valor;
        destino.saldoCP = destino.saldoCP + valor;
	}

		

}
