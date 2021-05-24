package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler um n�mero que � um c�digo de usu�rio, verificar se o
 * usu�rio e senha s�o v�lidos e permitir o acesso
 * 
 * @author Israel Oliveira Rodrigues
 * @since 09/02/2021
 */
public class Exercicio60 {

	/*
	 * M�todo principal para execu��o do programa
	 */
	public static void main(String[] args) {

		// Declara��o de vari�veis
		int id, senha;

		// Entrada de dados fornecidos pelo usu�rio
		id = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o c�digo de usu�rio: "));

		if (id != 1234) {
			JOptionPane.showMessageDialog(null, "Usu�rio inv�lido");
		} else {
			senha = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a senha: "));
			if (senha != 9999) {
				JOptionPane.showMessageDialog(null, "Senha incorreta: ");
			} else {
				JOptionPane.showMessageDialog(null, "Acesso permitido.");
			}
		}
	}
}
