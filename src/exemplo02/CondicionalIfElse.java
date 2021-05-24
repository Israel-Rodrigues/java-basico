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
	 * Método principal para execução do programa
	 */
	public static void main(String[] args) {

		// Declaração de variáveis
		double imc, altura, peso;

		// capturando os dados do usuário
		peso = Double.parseDouble(JOptionPane.showInputDialog("Informe o peso!"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura!"));

		// calculando o valor do IMC
		imc = peso / (Math.pow(altura, 2));

		// Demonstrando o resultado para o usuário
		if (imc < 18.5) {
			JOptionPane.showInternalMessageDialog(null, "Abaixo do peso!");
		} else {
			JOptionPane.showInternalMessageDialog(null, "Peso Ideal!");
		}
	}

}
