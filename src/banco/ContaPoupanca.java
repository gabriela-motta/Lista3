package banco;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(String nome, double renda, double juros) {
		super(nome, renda, juros);
	}

	@Override
	public double emprestimo() {
		return 0;
	}
}
