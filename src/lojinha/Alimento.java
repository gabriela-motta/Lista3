package lojinha;

public class Alimento extends Produto {
	private boolean gluten;

	public Alimento(String nome, int quantidade, double precoBase,
			boolean gluten) {
		super(nome, quantidade, precoBase);
		this.gluten = gluten;
	}

	@Override
	public double calculaPreco() {
		double preco = getQuantidade() * getPrecoBase();
		if (hasGluten()) {
			preco = 0.5 * getQuantidade() * getPrecoBase();
		}
		return preco;
	}

	public boolean hasGluten() {
		return gluten;
	}

	public void setGluten(boolean gluten) {
		this.gluten = gluten;
	}

}
