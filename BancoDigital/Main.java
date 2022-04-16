package BancoDigital;

public class Main {

	public static void main(String[] args) {
		Cliente renan = new Cliente();
		renan.setNome();
		
		Conta cc = new ContaCorrente(renan);
		Conta poupan�a = new ContaPoupan�a(renan);
		

		cc.depositar(100);
		cc.transferir(100, poupan�a);
		
		cc.imprimirExtrato();
		poupan�a.imprimirExtrato();

	}

}
