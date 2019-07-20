import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente(1,1,"Pudim");
		
		try {
			//inserir no banco de dados
			cc.saque(100);
		} catch(UsuarioInvalidoException e2) {
			JOptionPane.showMessageDialog(null, "Homi, teus dados tão incorretos");
		} catch(SaldoInsuficienteException e3) {
			JOptionPane.showMessageDialog(null, "Homi, tais liso");
		} catch (Exception e) { //conexaoinvalidaexception
			System.out.println("caiu aqui");
		} finally {
			//encerra a conexão com o banco de dados
		}
		
		//exemplo 2
		
		TerminalEletronico te = new TerminalEletronico();
		
		try {
			te.sacar(100);
		} catch (SaldoInsuficienteException e) {
			e.printStackTrace();
		} catch (UsuarioInvalidoException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
			
	
		
	}

}
