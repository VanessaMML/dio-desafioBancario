
public interface IConta {
	
	//uma interface ja � p�blica, seria redundante colocar o modificador de acesso public
	void sacar(double valor);
	
	void depositar(double valor);
	
	void transferir(double valor, Conta contaDestino);
	
	void imprimirExtrato();
}
