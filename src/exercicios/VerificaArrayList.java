package exercicios;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;

/**
 * Classe responsavel por controlar o sistema de verifica��o do Array
 *
 * @author Israel Oliveira Rodrigues
 * @since 26 de fev. de 2021
 * 
 */
public class VerificaArrayList {

	// Declarar e instanciar uma lista de String
	private ArrayList<String> listaNomes;

	private ArrayList<String> ordenarLista;

	public VerificaArrayList() {

		listaNomes = new ArrayList<String>();

		menuPrincipal();

	}

	public void menuPrincipal() {

		String menu = "INFORME A OP��O DESEJADA\n\n"

				+ "1 - Cadastrar nome\n" 
				+ "2 - Excluir nome\n" 
				+ "3 - Listar nomes cadastrados\n"
				+ "4 - Listar nomes em ordem alfab�tica\n" 
				+ "5 - Listar nomes iguais\n"
				+ "6 - Listar nomes por letra inicial\n" 
				+ "7 - Pesquisar nome\n" 
				+ "8 - Sair do sistema\n";

		// Verificando se o usu�rio digitou uma op��o v�lida ou inv�lida, caso seja inv�lida ser� apresentada uma mensagem de erro
		while (true) {
			try {
				int opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
				processamentoPrincipal(opcao);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Op��o inv�lida", "VERIFICA ARRAYLIST", 0);
			}
		}
	}

	// M�todo principal para processamento do programa
	public void processamentoPrincipal(int opcao) {

		switch (opcao) {
		case 1: {
			cadastrarNome();
			break;
		}
		case 2: {
			excluirNome();
			break;
		}
		case 3: {
			listarNomesCadastrados();
			break;
		}
		case 4: {
			listarNomesOrdemAlfabetica();
			break;
		}
		case 5: {
			listarNomesIguais();
			break;
		}
		case 6: {
			listarNomesLetraInicial();
			break;
		}
		case 7: {
			pesquisarNome();
			break;
		}
		case 8: {
			sair();
			break;
		}

		default:
			JOptionPane.showMessageDialog(null, "Op��o inv�lida", "Verifica ArrayList", 0);
			break;
		}
	}

	// 1. M�todo para cadastrar nome
	public void cadastrarNome() {
		// Limitando a 10 o cadastro de nomes
		while (listaNomes.size() < 10) {
			String nome = JOptionPane.showInputDialog("Informe o nome a ser cadastrado");
			// Valida��o para n�o aceitar vazio ou menos de duas letras
			if (nome.trim().isEmpty() || (nome.length() < 2)) {
				JOptionPane.showMessageDialog(null, "Informe um nome v�lido", RotuloString.cadastroNome, 2);
				menuPrincipal();
			}
			// Valida��o para n�o aceitar caractere diferente de letras
			if (!nome.matches("[a-z A-Z]*")) {
				JOptionPane.showMessageDialog(null, "Informe um nome v�lido", RotuloString.cadastroNome, 2);
				menuPrincipal();
			} else {
				// Mensagem de sucesso no cadastro
				JOptionPane.showMessageDialog(null, "Usu�rio cadastrado", RotuloString.cadastroNome, 1);
				listaNomes.add(nome);
				menuPrincipal();
			}

		}
		// Erro caso o limite de cadastro tenha sido atingido
		while (listaNomes.size() >= 10) {
			JOptionPane.showMessageDialog(null, "Limite de usu�rios atingidos", RotuloString.cadastroNome, 0);
			menuPrincipal();
		}
	}

	// 2. M�todo para excluir nome
	public void excluirNome() {
		String nome = "";
		String mensagem = "";
		// Varrendo o vetor para ver se existe usuario cadastrado
		for (int i = 0; i < listaNomes.size(); i++) {
			if (listaNomes.get(i) != null) {
				mensagem += "\n" + listaNomes.get(i);
			}
		} 
		// Usu�rio informa o nome a ser exclu�do
		nome = JOptionPane.showInputDialog(null, "Informe o nome a ser exclu�do" + mensagem, RotuloString.excluirNome, 1);
		for (int j = 0; j < 1; j++) {
			if (listaNomes.get(j).equals(nome)) {
				JOptionPane.showMessageDialog(null, "Nome excluido", RotuloString.excluirNome, 1);
				listaNomes.remove(nome);
			} else {
				// Erro caso o nome informado n�o esteja cadastrado
				JOptionPane.showMessageDialog(null, "Nome n�o enocntrado", RotuloString.excluirNome, 0);
			}

		}
	}

	// 3. M�todo para listar nomes cadastrados
	public void listarNomesCadastrados() {
		String mensagem = "";

		// Varrendo o array para verificar se existem nomes cadastrados
		for (int i = 0; i < listaNomes.size(); i++) {
			if (listaNomes.get(i) != null) {

				// Concatenando a mensagem a ser exibida ao usu�rio
				mensagem += "\n " + listaNomes.get(i);
			}
		}
		JOptionPane.showMessageDialog(null, "Nomes cadastrados\n" + mensagem, RotuloString.listarNomesCadastrados, 1);
	}

	// 4. M�todo para lstar nomes em ordem alfab�tica
	public void listarNomesOrdemAlfabetica() {

		// Instanciando o array secund�rio com os valores do array inicial
		ordenarLista = new ArrayList<String>(listaNomes);

		// Ordenando o array
		Collections.sort(ordenarLista);

		// Exibindo o resultado ao usu�rio
		JOptionPane.showMessageDialog(null, "Nomes em ordem alfab�tica: " + ordenarLista);
	}

	// 5. M�todo para listar nomes iguais
	public void listarNomesIguais() {
		boolean existe = false;
		String mensagem = "";
		
		// Varrendo o array para verificar se existem nomes iguais
		for (int i = 0; i < listaNomes.size(); i++) {
			int quantidade = Collections.frequency(listaNomes, listaNomes.get(i));
			if (quantidade > 1) {
				existe = true;
				// Concatenando a mensagem para apresentar ao usu�rio
				mensagem += "O nome repetido � : " + listaNomes.get(i) + "  \n";
				mensagem += "Com um total de : " + quantidade + " repeti��es  \n\n";
				i += (quantidade - 1);
				existe = true;
			}
		}
		if (existe) {
			// Exibindo o resultado ao usu�rio
			JOptionPane.showMessageDialog(null, mensagem, RotuloString.listarNomesIguais, 1);
		} else {
			JOptionPane.showMessageDialog(null, "N�o existem nomes iguais cadastrados", RotuloString.listarNomesIguais, 0);
		}
	}

	// 6. M�todo para listar nomes pela letra inicial
	public void listarNomesLetraInicial() {

		String mensagem = "";
		// Usu�rio informa a letra inicial para pesquisa
		String pesquisaLetra = JOptionPane.showInputDialog("Informe a letra inical para a pesquisa");

		boolean existe = false;

		// Varrendo o array para verificar se existem nomes iniciados na letra informada
		for (int i = 0; i < listaNomes.size(); i++) {
			if (listaNomes.get(i) != null && listaNomes.get(i).substring(0, 1).equals(pesquisaLetra)) {
				// Concatenando a mensagem
				mensagem += listaNomes.get(i) + "\n";
				existe = true;
			}
		}
		if (existe) {
			// Exibindo o resultado ao usu�rio
			JOptionPane.showMessageDialog(null, mensagem, RotuloString.pesquisaLetra, 1);
		} else {
			JOptionPane.showMessageDialog(null, "N�o existem nomes cadastrados com a letra informada", RotuloString.pesquisaLetra, 0);
		}
	}

	// 7. M�todo para pesquisar nome
	public void pesquisarNome() {
		String auxiliar = "";
		// Usu�rio informa o nome a ser pesquisado
		auxiliar = JOptionPane.showInputDialog(null, "Informe o nome ", RotuloString.pesquisaNome, 1);
		if (listaNomes.contains(auxiliar)) {
			// Retorno caso o nome seja encontrado
			JOptionPane.showMessageDialog(null, "Nome : " + auxiliar + " encontrado", RotuloString.pesquisaNome, 1);
		} else {
			// Mensagem ao usu�rio caso o nome n�o seja encontrado
			JOptionPane.showMessageDialog(null, "Nome n�o cadastrado", RotuloString.pesquisaNome, 0);
		}
	}

	// 8. M�odo para sair
	public void sair() {

		// Mensagem para o usu�rio para confirmar se deseja sair do sistema ou n�o
		int opcao = JOptionPane.showConfirmDialog(null, "Encerrar sistema?", "Aten��o", JOptionPane.YES_OPTION,
				JOptionPane.CANCEL_OPTION);

		if (opcao == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		new VerificaArrayList();
	}

}
