package sistema.com;

import java.util.Scanner;

import produtos.ListaProdutos;

public class Main {

	public static void main(String[] args) {

		int opcoes = 0;

		String nomeProd = "";
		int codigo = 0;
		int preco = 0;
		int quantProd = 0;

		Scanner scn = new Scanner(System.in);

		ListaProdutos listaProd = new ListaProdutos();

		while (opcoes != 5) {

			System.out.println("Escolha uma opção digitando seu número: ");
			System.out.println("1 - Adiciona Produto ");
			System.out.println("2 - Lista Produtos ");
			System.out.println("3 - Encontrar Produto por Código");
			System.out.println("4 - Remover Item da Lista");
			System.out.println("5 - Sair");

			opcoes = scn.nextInt();

			switch (opcoes) {

			case 1:

				listaProd.adicionarProduto(codigo, nomeProd, preco, quantProd);
				codigo++;

				break;

			case 2:

				listaProd.RetornaLista();
				break;

			case 3:

				listaProd.ProcurarProduto(codigo);

				break;

			case 4:

				listaProd.removerItem(codigo);

				break;

			case 5:
				System.out.println("Voce decidiu sair da aplicação, até logo!");
				break;

			default:
				System.out.println("Favor digitar um valor válido!");
				listaProd.cortaString();

			}
		}

		scn.close();
	}

}
