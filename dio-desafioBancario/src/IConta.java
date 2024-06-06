
public interface IConta {
	
	//uma interface ja é pública, seria redundante colocar o modificador de acesso public
	void sacar(double valor);
	
	void depositar(double valor);
	
	void transferir(double valor, Conta contaDestino);
	
	void imprimirExtrato();
}
