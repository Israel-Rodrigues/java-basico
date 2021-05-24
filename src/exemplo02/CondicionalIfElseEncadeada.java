package exemplo02;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar o comando If Else encadeado
 * 
 * @author iorodrigues
 * @since 08/02/2021
 */
public class CondicionalIfElseEncadeada {

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

		// exibindo as informa��es para o usu�rio
		if (imc < 18.5) {
			JOptionPane.showInternalMessageDialog(null, "Abaixo do peso!");
		} else if ((imc >= 18.5) && (imc <= 24.9)) {
			JOptionPane.showInternalMessageDialog(null, "Peso ideal!");
		} else if ((imc >= 25) && (imc <= 29.9)) {
			JOptionPane.showInternalMessageDialog(null, "Acima do peso!");
		} else if ((imc >= 30) && (imc <= 34.9)) {
			JOptionPane.showInternalMessageDialog(null, "Obesidade n�vel 1!");
		} else {
			JOptionPane.showInternalMessageDialog(null, "Obesidade m�rbida!");
		}

	}

}
