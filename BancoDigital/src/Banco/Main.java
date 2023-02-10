package Banco;
public class Main {

	public static void main(String[] args) {
		Cliente anderson = new Cliente();
		anderson.setNome("Anderson");
		
		Cliente flavia = new Cliente();
		flavia.setNome("Flávia");
		
		Conta cc = new ContaCorrente(anderson);
		Conta poupanca = new ContaPoupanca(anderson);
		
		Conta ccFlavia = new ContaCorrente(flavia);
		Conta poupancaFlavia = new ContaPoupanca(flavia);

		cc.depositar(200);
		cc.transferir(150, poupanca);
		poupanca.depositar(200);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		ccFlavia.depositar(300);
		ccFlavia.transferir(200, poupanca);
		poupancaFlavia.depositar(50);
		
		ccFlavia.imprimirExtrato();
		poupancaFlavia.imprimirExtrato();
		
		
		
		
		
	}

}
