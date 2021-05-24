package exemplo08;

import javax.swing.JOptionPane;

/**
 * Classe para demonstrar a utiliza��o do componente JOptionPane acessando
 * atributos est�ticos
 * 
 * @author Israel Oliveira Rodrigues
 * @since 23 de fev. de 2021
 * 
 */
public class TestaJoptionPane {

	/*
	 * M�todo principal para execu��o da classe
	 */
	public static void main(String[] args) {
		
		

		// Utilizando o JoptionPane com o construtor para exebi��o de mensagem de erro
//		JOptionPane.showMessageDialog(null, "Conte�do", "T�tulo", 0); // 0 - c�digo do �cone de erro
		
		// Utilizando o JoptionPane com o construtor para exebi��o de mensagem de erro
		JOptionPane.showMessageDialog(null, Mensagem.sucessoIncluido, Titulo.cadastroUsuario, 1); // 1 - c�digo do �cone de informa��o
				
		// Utilizando o JoptionPane com o construtor para exebi��o de mensagem de erro
//		JOptionPane.showMessageDialog(null, "Conte�do", "T�tulo", 2); // 2 - c�digo do �cone de advert�ncia
				
		// Utilizando o JoptionPane com o construtor para exebi��o de mensagem de erro
//		JOptionPane.showMessageDialog(null, "Conte�do", "T�tulo", 3); // 3 - c�digo do �cone de interroga��o
	}

}
