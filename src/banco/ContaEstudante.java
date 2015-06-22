package banco;

public class ContaEstudante extends Conta {

	public ContaEstudante(String nome, double renda, double juros) {
		super(nome, renda, juros);
	}

	@Override
	public double emprestimo() {
		return (getRendaTitular() / 2);
	}

}
