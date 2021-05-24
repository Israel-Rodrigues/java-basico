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

		// exibindo as informações para o usuário
		if (imc < 18.5) {
			JOptionPane.showInternalMessageDialog(null, "Abaixo do peso!");
		} else if ((imc >= 18.5) && (imc <= 24.9)) {
			JOptionPane.showInternalMessageDialog(null, "Peso ideal!");
		} else if ((imc >= 25) && (imc <= 29.9)) {
			JOptionPane.showInternalMessageDialog(null, "Acima do peso!");
		} else if ((imc >= 30) && (imc <= 34.9)) {
			JOptionPane.showInternalMessageDialog(null, "Obesidade nível 1!");
		} else {
			JOptionPane.showInternalMessageDialog(null, "Obesidade mórbida!");
		}

	}

}
