package exemplo10;

import javax.swing.JOptionPane;

/**
 * Classe para demonstrar a utilização de exceções em Java
 *
 * @author Israel Oliveira Rodrigues
 * @since 23 de fev. de 2021
 * 
 */
public class TestaUsuario {

	public void receberDados() {
		if (Valida.isStringVazio(JOptionPane.showInputDialog(Mensagem.informeNome))) {
			JOptionPane.showMessageDialog(null, Mensagem.nomeVazio, "Cadastro de usuário", 0);
		} else {
			JOptionPane.showMessageDialog(null,"Nome válido", "Cadastro de usuário", 1);
		}
		
		if (Valida.isStringValida(JOptionPane.showInputDialog(Mensagem.informeNome))) {
			JOptionPane.showMessageDialog(null,"Nome válido", "Cadastro de usuário", 1);
		} else {
			JOptionPane.showMessageDialog(null, Mensagem.nomeInvalido, "Cadastro de usuário", 0);
		}
		
		if (Valida.isNumber(JOptionPane.showInputDialog(Mensagem.informeIdade))) {
			JOptionPane.showMessageDialog(null, "Idade Válida", "Cadastro de usuário", 1);
		}else {
			JOptionPane.showMessageDialog(null, Mensagem.idadeInvalido, "Cadastro de usuário", 0);
		}
	}

	public static void main(String[] args) {
		new TestaUsuario().receberDados();
	}
}
