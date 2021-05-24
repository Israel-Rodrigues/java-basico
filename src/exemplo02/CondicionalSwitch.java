package exemplo02;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar o comando Switch
 * 
 * @author iorodrigues
 * @since 08/02/2021
 */
public class CondicionalSwitch {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {

		// Declarando vari�vel
		int mes;

		// Capturando os dados do usu�rio
		mes = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o m�s"));

		// Exibindo o m�s escolhido pelo usu�rio
		switch (mes) {
		case 1: {
			JOptionPane.showInternalMessageDialog(null, "M�s escolhido - Janeiro");
			break;
		}
		case 2: {
			JOptionPane.showInternalMessageDialog(null, "M�s escolhido - Fevereiro");
			break;
		}
		case 3: {
			JOptionPane.showInternalMessageDialog(null, "M�s escolhido - Mar�o");
			break;
		}
		case 4: {
			JOptionPane.showInternalMessageDialog(null, "M�s escolhido - Abril");
			break;
		}
		case 5: {
			JOptionPane.showInternalMessageDialog(null, "M�s escolhido - Maio");
			break;
		}
		case 6: {
			JOptionPane.showInternalMessageDialog(null, "M�s escolhido - Junho");
			break;
		}
		case 7: {
			JOptionPane.showInternalMessageDialog(null, "M�s escolhido - Julho");
			break;
		}
		case 8: {
			JOptionPane.showInternalMessageDialog(null, "M�s escolhido - Agosto");
			break;
		}
		case 9: {
			JOptionPane.showInternalMessageDialog(null, "M�s escolhido - Setembro");
			break;
		}
		case 10: {
			JOptionPane.showInternalMessageDialog(null, "M�s escolhido - Outubro");
			break;
		}
		case 11: {
			JOptionPane.showInternalMessageDialog(null, "M�s escolhido - Novembro");
			break;
		}
		case 12: {
			JOptionPane.showInternalMessageDialog(null, "M�s escolhido - Dezembro");
			break;
		}
		default:
			JOptionPane.showInternalMessageDialog(null, "M�s n�o corresponde");
		}

	}

}
