
public abstract class Conta implements IConta {
	//classe abstrata: solicita alguma implementa��o qque sozinha n�o consegue resolver. 
	//S� tem o contrato de uso, delega a implementa��o para outra classe.
	//Uma classe pode ser abstrata por quest�o de estrat�gia, ja que uma classe abstrata n�o pode ser instanciada.
	
	private static final int AGENCIA_PADRAO = 0;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	
	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}

	@Override
	public void sacar(double valor) {
		saldo = saldo - valor;
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
	
	protected void imprimirInformacoesComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("N�mero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}

	public void imprimirExtrato() {
		
	}

}
