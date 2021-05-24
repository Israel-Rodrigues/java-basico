package exemplo06;

/**
 * Classe para demonstrar a utilização de objetos Responsável por armazenar seus
 * atributos e métodos
 *
 * @author Israel Oliveira Rodrigues
 * @since 17 de fev. de 2021
 * 
 */
public class Pessoa {

	// Atributos ou caracteristicas do objeto
	String nome;
	String dataNascimento;
	double altura;
	double peso;
	String sexo;

	// Método para exibir os dados do objeto
	public void exibirDados() {// Inicio do metodo
		System.out.println("Nome: " + nome);
		System.out.println("Data de nascimento: " + dataNascimento);
		System.out.println("Altura: " + altura);
		System.out.println("Peso: " + peso);
		System.out.println("Sexo: " + sexo);
		System.out.println("Idade: " + calcularIdade());
		System.out.println(faixaEtaria());

	}// fim do metodo

	// Método para retornar a idade da pessoa
	public int calcularIdade() {
		// Declarando a variável de retorno do método
		int idade = 0;

		// Variavel para armazenar o ano de nascimento
		int anoNascimento = 0;
		int anoAtual = 2021;

		// Quebrando a data do tipo string
		String dataQuebrada[] = dataNascimento.split("/");
		anoNascimento = Integer.parseInt(dataQuebrada[2]);

		// Calculando a idade do objeto
		idade = anoAtual - anoNascimento;

		// Retornando a idade calculada
		return idade;

	}

	// Método para retornar se é maior de idade ou não
	public String faixaEtaria() {
		if (calcularIdade() >= 18) {
			return "Maior de idade";
		} else {
			return "Menor de idade";
		}

	}
}
