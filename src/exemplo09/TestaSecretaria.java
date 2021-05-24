package exemplo09;

/**
 * Classe para instanciar o objeto secretária e exibir seus dados
 *
 * @author Israel Oliveira Rodrigues
 * @since 23 de fev. de 2021
 * 
 */
public class TestaSecretaria {

	/**
	 * Método principal para execução da classe
	 */
	public static void main(String[] args) {
		
		// Instanciando o objeto do tipo Secretaria
		Secretaria maria = new Secretaria();
		maria.setNome("Maria de Paula Souza");
		maria.setCpf("321.321.321-32");
		maria.setSalario(950.00);
		maria.setRamal(123);
		
		maria.mostrarDados();
	}

}
