package exemplo10;

/**
 * Classe responsavel por armazenar os m�todos de valida��o de dados
 *
 * @author Israel Oliveira Rodrigues
 * @since 23 de fev. de 2021
 * 
 */
public class Valida {
	
	// M�todo para verificar String vazia
	public static boolean isStringVazio(String args) {
		// COMANDO TRIM = tira os espa�os da vari�vel String
		if (args.trim().equals("")) {
			return true;
		} else {
			return false;
		}
	}
	
	// M�todo para veificar String v�lida
	public static boolean isStringValida(String args) {
		if (!args.matches("[0-9]*")) {
			return true;
		} else {
			return false;
		}
	}
	
	// M�todo para verificar se � n�mero
	public static boolean isNumber(String args) {
		try {
			int numero = Integer.parseInt(args);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}
