package exemplo10;

/**
 * Classe responsavel por armazenar os métodos de validação de dados
 *
 * @author Israel Oliveira Rodrigues
 * @since 23 de fev. de 2021
 * 
 */
public class Valida {
	
	// Método para verificar String vazia
	public static boolean isStringVazio(String args) {
		// COMANDO TRIM = tira os espaços da variável String
		if (args.trim().equals("")) {
			return true;
		} else {
			return false;
		}
	}
	
	// Método para veificar String válida
	public static boolean isStringValida(String args) {
		if (!args.matches("[0-9]*")) {
			return true;
		} else {
			return false;
		}
	}
	
	// Método para verificar se é número
	public static boolean isNumber(String args) {
		try {
			int numero = Integer.parseInt(args);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}
