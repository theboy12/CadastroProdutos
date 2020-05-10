package produtos;

public class Produto {

	private String nomeProd;
	private int codigo;
	private int preco;
	private int quantProd;
	private int precoTotal;

	public Produto() {
		super();
	}

	public String getNomeProd() {
		return nomeProd;
	}

	public void setNomeProd(String nomeProd) {
		this.nomeProd = nomeProd;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}

	public int getQuantProd() {
		return quantProd;
	}

	public void setQuantProd(int quantProd) {
		this.quantProd = quantProd;
	}
	
	
	
	public int getPrecoTotal() {
		return precoTotal;
	}

	public void setPrecoTotal(int precoTotal) {
		this.precoTotal = precoTotal;
	}

	@Override
	public String toString() {
		return "[ ID=" + codigo + ", Nome=" + nomeProd + ", Preço=" + preco + ", Quantidade=" + quantProd + ", Preço Total=" + precoTotal + "]";
	}

}
