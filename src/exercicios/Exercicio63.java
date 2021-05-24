package exercicios;

import javax.swing.JOptionPane;

/**
 * Verificar se um empregado esta qualificado para a aposentadoria
 * 
 * @author Israel Oliveira Rodrigues
 * @since 09/02/2021
 */
public class Exercicio63 {

	/*
	 * Método principal para execução da classe
	 */
	public static void main(String[] args) {

		// Declaração de variáveis
		int numEmpregado, anoNasc, anoAdmissao, idade, tempTrabalho;

		// Entrada de dados fornecidos pelo usuário
		numEmpregado = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o número do empregado:"));
		anoNasc = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o ano de nascimento do empregado:"));
		anoAdmissao = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o ano de admissão:"));

		// Calculando a idade do empregado
		idade = 2021 - anoNasc;

		// Calculando o tempo de trabalho
		tempTrabalho = 2021 - anoAdmissao;

		// Verificando se deve ou não requerer a aposentadoria
		if ((idade >= 65) || (tempTrabalho >= 30)) {
			JOptionPane.showMessageDialog(null,
					"Número do empregado: " + numEmpregado + "\n" + "Requerer aposentadoria");
		} else if ((idade >= 60) || (tempTrabalho >= 25)) {
			JOptionPane.showMessageDialog(null,
					"Número do empregado: " + numEmpregado + "\n" + "Requerer aposentadoria");
		} else {
			JOptionPane.showMessageDialog(null, "Número do empregado: " + numEmpregado + "\n" + "Não requerer");
		}
	}
}
