package exemplo07;

/**
 * Classe para armazenar os atributos e m�todos do objeto pessoa
 *
 * @author Israel Oliveira Rodrigues
 * @since 17 de fev. de 2021
 * 
 */
public class Pessoa {
	
	// Declarando os atribustos da pessoa
	private String nome;
	private Data dataNascimento;
	private double salarioJoao;
	
	// M�todo para acessar os atributos
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Data getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Data dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public double getSalarioJoao() {
		return salarioJoao;
	}
	public void setSalarioJoao(double salarioJoao) {
		this.salarioJoao = salarioJoao;
	}
	public String getVerificaSalario() {
		if (salarioJoao < 1163.55) {
			return "Acima do sal�rio m�nimo.";
		} else
			return "Abaixo do sal�rio m�nimo.";
	}
}
