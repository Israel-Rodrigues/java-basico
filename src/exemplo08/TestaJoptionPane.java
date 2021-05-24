package exemplo08;

import javax.swing.JOptionPane;

/**
 * Classe para demonstrar a utilização do componente JOptionPane acessando
 * atributos estáticos
 * 
 * @author Israel Oliveira Rodrigues
 * @since 23 de fev. de 2021
 * 
 */
public class TestaJoptionPane {

	/*
	 * Método principal para execução da classe
	 */
	public static void main(String[] args) {
		
		

		// Utilizando o JoptionPane com o construtor para exebição de mensagem de erro
//		JOptionPane.showMessageDialog(null, "Conteúdo", "Título", 0); // 0 - código do ícone de erro
		
		// Utilizando o JoptionPane com o construtor para exebição de mensagem de erro
		JOptionPane.showMessageDialog(null, Mensagem.sucessoIncluido, Titulo.cadastroUsuario, 1); // 1 - código do ícone de informação
				
		// Utilizando o JoptionPane com o construtor para exebição de mensagem de erro
//		JOptionPane.showMessageDialog(null, "Conteúdo", "Título", 2); // 2 - código do ícone de advertência
				
		// Utilizando o JoptionPane com o construtor para exebição de mensagem de erro
//		JOptionPane.showMessageDialog(null, "Conteúdo", "Título", 3); // 3 - código do ícone de interrogação
	}

}
