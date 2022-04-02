
public class Main {

	public static void main(String[] args) {
    Cliente cliente1 = new Cliente();
		cliente1.setNome("Cristiano");
		
    Cliente cliente2 = new Cliente();
		cliente2.setNome("Idelfonso");

		Conta cc1 = new ContaCorrente(cliente1);
		Conta poupanca1 = new ContaPoupanca(cliente1);
    
		Conta cc2 = new ContaCorrente(cliente2);
		Conta poupanca2 = new ContaPoupanca(cliente2);

		cc1.depositar(100);
		cc1.transferir(100, poupanca1);

		cc2.depositar(100);
		cc2.transferir(100, poupanca2);
		
		cc1.imprimirExtrato();
		cc2.imprimirExtrato();

		poupanca1.imprimirExtrato();
		poupanca2.imprimirExtrato();
	}

}
