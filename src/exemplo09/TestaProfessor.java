package exemplo09;

/**
 * Classe respons�vel por instanciar o objeto professor e exibir os seus dados
 *
 * @author Israel Oliveira Rodrigues
 * @since 23 de fev. de 2021
 * 
 */
public class TestaProfessor {

	/*
	 * M�todo principal para execu��o da classe
	 */
	public static void main(String[] args) {
		
		// Criando um objeto do tipo professor e instanciando
		Professor jose = new Professor();
		jose.setNome("Jos� Aparecido da Silva");
		jose.setCpf("123.123.123-12");
		jose.setSalario(1500.00);
		jose.setMateria("Matem�tica");
		
		jose.mostrarDados();

	}

}
