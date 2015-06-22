package banco;

public class ContaElite extends Conta {

	public ContaElite(String nome, double renda, double juros) {
		super(nome, renda, juros);
	}

	@Override
	public double emprestimo() {
		return getRendaTitular() + 0.01 * projLucros(5);
	}
}
