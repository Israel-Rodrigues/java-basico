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
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {

		// Declarando variável
		int mes;

		// Capturando os dados do usuário
		mes = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o mês"));

		// Exibindo o mês escolhido pelo usuário
		switch (mes) {
		case 1: {
			JOptionPane.showInternalMessageDialog(null, "Mês escolhido - Janeiro");
			break;
		}
		case 2: {
			JOptionPane.showInternalMessageDialog(null, "Mês escolhido - Fevereiro");
			break;
		}
		case 3: {
			JOptionPane.showInternalMessageDialog(null, "Mês escolhido - Março");
			break;
		}
		case 4: {
			JOptionPane.showInternalMessageDialog(null, "Mês escolhido - Abril");
			break;
		}
		case 5: {
			JOptionPane.showInternalMessageDialog(null, "Mês escolhido - Maio");
			break;
		}
		case 6: {
			JOptionPane.showInternalMessageDialog(null, "Mês escolhido - Junho");
			break;
		}
		case 7: {
			JOptionPane.showInternalMessageDialog(null, "Mês escolhido - Julho");
			break;
		}
		case 8: {
			JOptionPane.showInternalMessageDialog(null, "Mês escolhido - Agosto");
			break;
		}
		case 9: {
			JOptionPane.showInternalMessageDialog(null, "Mês escolhido - Setembro");
			break;
		}
		case 10: {
			JOptionPane.showInternalMessageDialog(null, "Mês escolhido - Outubro");
			break;
		}
		case 11: {
			JOptionPane.showInternalMessageDialog(null, "Mês escolhido - Novembro");
			break;
		}
		case 12: {
			JOptionPane.showInternalMessageDialog(null, "Mês escolhido - Dezembro");
			break;
		}
		default:
			JOptionPane.showInternalMessageDialog(null, "Mês não corresponde");
		}

	}

}
