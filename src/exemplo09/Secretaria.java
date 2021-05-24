package exemplo09;

/**
 * Classe para armazenar os atributos e m�todos do objeto secret�ria e herdar de Funcionario
 *
 * @author Israel Oliveira Rodrigues
 * @since 23 de fev. de 2021
 */
public class Secretaria extends Funcionario {

	// Atributos de secret�ria
	private int ramal;

	// M�todo para acessar o atributo
	public int getRamal() {
		return ramal;
	}

	public void setRamal(int ramal) {
		this.ramal = ramal;
	}
	
	// M�todo para exibir dados
	public void mostrarDados() {
		super.mostrarDados();
		System.out.println("Ramal: " + ramal);
	}
	
}
