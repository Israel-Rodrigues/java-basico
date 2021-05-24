package exemplo01;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar entrada de dados fornecido pelo usu�rio
 * @author iorodrigues
 * @since 05/02/2021
 */
public class EntradaDados {

	/*
	 * M�todo principal para execu��o do programa
	 */
	public static void main(String[] args) {
		
		// declarando vari�veis
		String nome;
		
		// Atribuir valor para a vari�vel nome informado peo usu�rio
		nome = JOptionPane.showInputDialog("Digite o seu nome");
		
		//Exibindo dados no console
		System.out.println("Seu nome �: " + nome);

	}

}
