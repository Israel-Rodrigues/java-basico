package exemplo09;

/**
 * Classe para armazenar os atributos e métodos do objeto secretária e herdar de Funcionario
 *
 * @author Israel Oliveira Rodrigues
 * @since 23 de fev. de 2021
 */
public class Secretaria extends Funcionario {

	// Atributos de secretária
	private int ramal;

	// Método para acessar o atributo
	public int getRamal() {
		return ramal;
	}

	public void setRamal(int ramal) {
		this.ramal = ramal;
	}
	
	// Método para exibir dados
	public void mostrarDados() {
		super.mostrarDados();
		System.out.println("Ramal: " + ramal);
	}
	
}
