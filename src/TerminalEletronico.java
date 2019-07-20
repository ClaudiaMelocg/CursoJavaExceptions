
public class TerminalEletronico {

	ContaCorrente cc = new ContaCorrente(1, 1, "Pudim");
	
	public void sacar(double valor) throws SaldoInsuficienteException, UsuarioInvalidoException {
		cc.saque(valor);
	}
	
}
