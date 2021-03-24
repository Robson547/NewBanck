package model;

public class ContaCorrente extends Conta {
		
	public void exibirDados() {
		
		System.out.println("Olá, seja bem vindo ao NovoBank!");
		System.out.println("Nome: " + this.getNome());
		System.out.println("Agencia: " + this.getAgencia());
		System.out.println("Numero da Conta Corrente: " + this.getNumeroConta());
		System.out.println("Saldo: " + this.getSaldoCC());
		
	}

}
