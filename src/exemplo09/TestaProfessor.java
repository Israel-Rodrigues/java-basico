package exemplo09;

/**
 * Classe responsável por instanciar o objeto professor e exibir os seus dados
 *
 * @author Israel Oliveira Rodrigues
 * @since 23 de fev. de 2021
 * 
 */
public class TestaProfessor {

	/*
	 * Método principal para execução da classe
	 */
	public static void main(String[] args) {
		
		// Criando um objeto do tipo professor e instanciando
		Professor jose = new Professor();
		jose.setNome("José Aparecido da Silva");
		jose.setCpf("123.123.123-12");
		jose.setSalario(1500.00);
		jose.setMateria("Matemática");
		
		jose.mostrarDados();

	}

}
