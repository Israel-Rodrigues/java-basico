package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler um número que é um código de usuário, verificar se o
 * usuário e senha são válidos e permitir o acesso
 * 
 * @author Israel Oliveira Rodrigues
 * @since 09/02/2021
 */
public class Exercicio60 {

	/*
	 * Método principal para execução do programa
	 */
	public static void main(String[] args) {

		// Declaração de variáveis
		int id, senha;

		// Entrada de dados fornecidos pelo usuário
		id = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o código de usuário: "));

		if (id != 1234) {
			JOptionPane.showMessageDialog(null, "Usuário inválido");
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
