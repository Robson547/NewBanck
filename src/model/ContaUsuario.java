package model;

public class ContaUsuario {
	public static void main(String[] args) {
	
	ContaCorrente cc1 = new ContaCorrente();
	ContaPoupanca cp1 = new ContaPoupanca();
	
	
	//Conta Corrente
	cc1.setNome("Robson");
	cc1.setAgencia("1");
	cc1.setNumeroConta(1010);
	cc1.setSaldoCC(1000);
	cc1.setContaAtiva(false);
	
	
	cc1.exibirDados();
	
	System.out.println("===========================");
	
	//Conta Poupanca
	cp1.setNome("Robson");
	cp1.setAgencia("1");
	cp1.setNumeroConta(2010);
	cp1.setSaldoCP(2000);
	cp1.setContaAtiva(true);
	

	cp1.exibirDados();
	
	System.out.println("==========================");
	
	
	}
	
}
