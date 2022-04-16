package BancoDigital;

public class Main {

	public static void main(String[] args) {
		Cliente renan = new Cliente();
		renan.setNome();
		
		Conta cc = new ContaCorrente(renan);
		Conta poupanša = new ContaPoupanša(renan);
		

		cc.depositar(100);
		cc.transferir(100, poupanša);
		
		cc.imprimirExtrato();
		poupanša.imprimirExtrato();

	}

}
