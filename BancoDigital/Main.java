package BancoDigital;

public class Main {

	public static void main(String[] args) {
		Cliente renan = new Cliente();
		renan.setNome();
		
		Conta cc = new ContaCorrente(renan);
		Conta poupança = new ContaPoupança(renan);
		

		cc.depositar(100);
		cc.transferir(100, poupança);
		
		cc.imprimirExtrato();
		poupança.imprimirExtrato();

	}

}
