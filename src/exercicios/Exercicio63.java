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
	 * M�todo principal para execu��o da classe
	 */
	public static void main(String[] args) {

		// Declara��o de vari�veis
		int numEmpregado, anoNasc, anoAdmissao, idade, tempTrabalho;

		// Entrada de dados fornecidos pelo usu�rio
		numEmpregado = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o n�mero do empregado:"));
		anoNasc = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o ano de nascimento do empregado:"));
		anoAdmissao = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o ano de admiss�o:"));

		// Calculando a idade do empregado
		idade = 2021 - anoNasc;

		// Calculando o tempo de trabalho
		tempTrabalho = 2021 - anoAdmissao;

		// Verificando se deve ou n�o requerer a aposentadoria
		if ((idade >= 65) || (tempTrabalho >= 30)) {
			JOptionPane.showMessageDialog(null,
					"N�mero do empregado: " + numEmpregado + "\n" + "Requerer aposentadoria");
		} else if ((idade >= 60) || (tempTrabalho >= 25)) {
			JOptionPane.showMessageDialog(null,
					"N�mero do empregado: " + numEmpregado + "\n" + "Requerer aposentadoria");
		} else {
			JOptionPane.showMessageDialog(null, "N�mero do empregado: " + numEmpregado + "\n" + "N�o requerer");
		}
	}
}
