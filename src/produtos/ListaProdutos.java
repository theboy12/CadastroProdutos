package produtos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ListaProdutos {

	private Produto produto;
	private List<Produto> prodLista = new ArrayList<Produto>();
	private Scanner scn = new Scanner(System.in);

	// Metodo responsavel por adicionar produtos
	// ------------------------------------------
	public List<Produto> adicionarProduto(int codigo, String nomeProd, int preco, int quantProd) {
		
		produto = new Produto();

		System.out.println("Favor digite o nome do produto: ");
		nomeProd = scn.next();

		System.out.println("Favor digite o preço do produto: ");
		preco = scn.nextInt();

		System.out.println("Favor digite a quantidade de produtos: ");
		quantProd = scn.nextInt();

		produto.setCodigo(codigo);
		produto.setNomeProd(nomeProd);
		produto.setPreco(preco);
		produto.setQuantProd(quantProd);
		produto.setPrecoTotal(produto.getPreco() * produto.getQuantProd());

		prodLista.add(produto);

		System.out.println(produto);
		cortaString();
		return prodLista;
	}

	// Metodo responsavel por mostrar lista de produtos
	// ------------------------------------------
	public void RetornaLista() {
		prodLista.forEach(name -> System.out.println(name));
		cortaString();
	}

	// Metodo responsavel por procurar produtos utilizando o codigo
	// ------------------------------------------
	public void ProcurarProduto(int codigo) {

		boolean achei = false;

		if (prodLista.isEmpty()) {

			cortaString();
			System.out.println("A lista está vazia!");
			cortaString();

		} else {

			System.out.println("Favor digitar o código do produto que deseja encontrar: ");
			codigo = scn.nextInt();
			cortaString();

			Iterator<Produto> iterador = prodLista.iterator();

			while (iterador.hasNext()) {

				produto = iterador.next();

				if (produto.getCodigo() == codigo) {

					System.out.println(produto);
					cortaString();
					achei = true;
				}

			}

			if (!achei) {
				System.out.println("Nenhum produto encontrado!");
				cortaString();
			}

		}
	}

	// Metodo responsavel por remover produtos utilizando o codigo
	// ------------------------------------------
	public void removerItem(int codigo) {

		boolean achei = false;

		System.out.println("Digite o código do produto que deseja remover: ");
		codigo = scn.nextInt();
		cortaString();

		Iterator<Produto> iterador = prodLista.iterator();

		while (iterador.hasNext()) {

			produto = iterador.next();

			if (produto.getCodigo() == codigo) {

				iterador.remove();
				System.out.println("Produto removido com sucesso!");
				cortaString();
				achei = true;

			}

		}

		if (!achei) {

			System.out.println("Nenhum produto encontrado!");
			cortaString();

		}

	}

	public void cortaString() {

		System.out.println("/----------------------------------/");

	}

}
