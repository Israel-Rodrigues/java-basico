package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler tr�s valores e escrever a multiplica��o dos dois menores
 * 
 * @author Israel Oliveira Rodrigues
 * @since 09/02/2021
 */
public class Exercicio51 {

	/*
	 * M�todo principal para execu��o da classe
	 */
	public static void main(String[] args) {
		// Declara��o de vari�veis
		int valor1, valor2, valor3;

		// Entrada de dados forneidos pelo usu�rio
		valor1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o primeiro valor: "));
		valor2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o segundo valor: "));
		valor3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o terceiro valor: "));

		// Verificando os dois maiores n�meros e apresentando a soma deles
		if ((valor1 > valor2) && (valor1 > valor3)) {
			JOptionPane.showMessageDialog(null, "A multiplica��o dos dois valores menores �: " + (valor2 * valor3));
		} else if ((valor2 > valor1) && (valor2 > valor3)) {
			JOptionPane.showMessageDialog(null, "A multiplica��o dos dois valores menores �: " + (valor1 * valor3));
		} else {
			JOptionPane.showMessageDialog(null, "A multiplica��o dos dois valores menores �: " + (valor1 * valor2));
		}
	}
}
