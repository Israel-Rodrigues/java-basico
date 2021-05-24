package exemplo02;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar o uso do comando If Else
 * 
 * @author iorodrigues
 * @since 08/02/2021
 */
public class CondicionalIfElse {

	/*
	 * M�todo principal para execu��o do programa
	 */
	public static void main(String[] args) {

		// Declara��o de vari�veis
		double imc, altura, peso;

		// capturando os dados do usu�rio
		peso = Double.parseDouble(JOptionPane.showInputDialog("Informe o peso!"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura!"));

		// calculando o valor do IMC
		imc = peso / (Math.pow(altura, 2));

		// Demonstrando o resultado para o usu�rio
		if (imc < 18.5) {
			JOptionPane.showInternalMessageDialog(null, "Abaixo do peso!");
		} else {
			JOptionPane.showInternalMessageDialog(null, "Peso Ideal!");
		}
	}

}
