package exemplo06;

/**
 * Classe para demonstrar a utilização do objeto pessoa
 *
 * @author Israel Oliveira Rodrigues
 * @since 17 de fev. de 2021
 * 
 */
public class TestaPessoa {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		
		// Declarando o objeto pessoa joao
		Pessoa joao;
		
		// Inicializando o objeto pessoa (Instancia de objeto)
		joao = new Pessoa();

		// Atribuindo os valores ao objeto joao
		joao.nome = "João Almeida de Souza";
		joao.dataNascimento = "23/05/1986";
		joao.altura = 1.89;
		joao.peso = 85;
		joao.sexo = "Masculino";
		
		// Declarando o objeto pessoa maria
		Pessoa maria;
		
		// Inicializando o objeto maria (instancia do objeto)
		maria = new Pessoa();
		
		// Atribuindo os valores ao objeto maria
		maria.nome = "Maria da Silva de Souza";
		maria.dataNascimento = "12/08/1985";
		maria.altura = 1.52;
		maria.peso = 65;
		maria.sexo = "Feminino";
		
		// Exibindo os dados do objeto joão
		System.out.println("Nome: " + joao.nome);
		System.out.println("Data de nascimento: " + joao.dataNascimento);
		System.out.println("Altura: " + joao.altura);
		System.out.println("Peso: " + joao.peso);
		System.out.println("Sexo: " + joao.sexo);
		
		// Pulando uma linha
		System.out.println("");
		
		// Exibindo os dados do objeto maria
		System.out.println("Nome: " + maria.nome);
		System.out.println("Data de nascimento: " + maria.dataNascimento);
		System.out.println("Altura: " + maria.altura);
		System.out.println("Peso: " + maria.peso);
		System.out.println("Sexo: " + maria.sexo);
		
		// Pulando uma linha 
		System.out.println("");
		
		// Exibindo os dados do objeto joao
		joao.exibirDados();
		
		// Pulando uma linha 
		System.out.println("");
		
		// Exibindo os dados do objeto maria
		maria.exibirDados();
	}

}
