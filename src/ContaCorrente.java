;
public class ContaCorrente {

	private int agencia;
	private int conta;
	private String titular;
	private double saldo;
	
	public ContaCorrente(int agencia, int conta, String titular) {
		this.agencia = agencia;
		this.conta = conta;
		this.titular = titular;
	}

	public boolean depositar(double valorDeposito) {
		
		boolean depositoRealizado = false;
		
		if(valorDeposito > 0) {
			saldo += valorDeposito;
			depositoRealizado = true;
		}
		
		return depositoRealizado;
	}
	
	public void saque(double valorSaque) throws SaldoInsuficienteException, UsuarioInvalidoException {
		
		if(titular == null) {
			throw new UsuarioInvalidoException();
		}
		
		if(valorSaque > 0 && valorSaque <= saldo) {
			saldo -= valorSaque;		
		} else {
			throw new SaldoInsuficienteException();
		}
		
	}

	
	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
