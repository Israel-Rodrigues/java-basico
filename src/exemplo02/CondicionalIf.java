package exemplo02;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar o comando IF
 * @author iorodrigues
 * @since 08/02/2021
 */
public class CondicionalIf {

	/*
	 * M�todo principal para execu��o do programa
	 */
	public static void main(String[] args) {
		
		// Declarando vari�veis
		double imc, altura, peso;
		
		// Capturando os dados do usu�rio
		peso = Double.parseDouble(JOptionPane.showInputDialog("Informe o peso"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura"));
		
		// Calculando o IMC do usu�rio
		imc = peso / (Math.pow(altura, 2));
		
		// Exibindo o resultado do IMC
		if (imc < 18.5) {
			JOptionPane.showMessageDialog(null, "Abaixo do peso!");
		}
		
		if ((imc >= 18.5) && (imc <= 24.9)) {
			JOptionPane.showInternalMessageDialog(null, "Peso ideal!");
		}
		
		
		
	}

}
