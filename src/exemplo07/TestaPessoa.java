package exemplo07;

/**
 * Programa para testar o objeto pessoa
 *
 * @author Israel Oliveira Rodrigues
 * @since 17 de fev. de 2021
 * 
 */
public class TestaPessoa {

	/*
	 * Método principal para execução da classe
	 */
	public static void main(String[] args) {

		// Declarar e instanciar o objeto pesoa
		Pessoa joao = new Pessoa();
		
		// Atribuindo os valores ao objeto joao
		joao.setNome("João Almeida de Souza");
		
		// Criando o objeto de data
		Data dataNascimento = new Data();
		
		// Inicializando a data do objeto joao
		dataNascimento.setDia(10);
		dataNascimento.setMes(02);
		dataNascimento.setAno(1985);
		
		// Atribuindo os valores de data para o objeto joao
		joao.setDataNascimento(dataNascimento);
		
		// Inicializando o salario do objeto joao
		joao.setSalarioJoao(2.000);
		
		// Exibindo os dados do objeto joao
		System.out.println("Nome: " + joao.getNome());
		System.out.println("Data de Nascimento: " + joao.getDataNascimento());
		System.out.println(joao.getDataNascimento().faixaEtaria());
		System.out.println(joao.getVerificaSalario());
		

	}

}
