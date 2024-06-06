
public class Main {

	public static void main(String[] args) {
		
		Cliente vanessa = new Cliente();
		vanessa.setNome("Vanessa");
		
		Conta cc = new ContaCorrente(vanessa);
		Conta cp = new ContaPoupanca(vanessa);
		
		cc.depositar(100);
		cc.transferir(100, cp);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
	}

}
