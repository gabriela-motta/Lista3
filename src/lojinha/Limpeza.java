package lojinha;

public class Limpeza extends Produto {

	public Limpeza(String nome, int quantidade, double precoBase) {
		super(nome, quantidade, precoBase);
	}

	@Override
	public double calculaPreco() {
		double preco = getQuantidade() * getPrecoBase();
		if (getQuantidade() > 4) {
			preco = preco - 0.1 * (getQuantidade() - 4) * getPrecoBase();
		}
		return preco;
	}

}
