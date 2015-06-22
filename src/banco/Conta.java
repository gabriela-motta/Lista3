package banco;

public class Conta {
	private double saldo;
	private String nomeTitular;
	private double rendaTitular;
	private double juros;

	public Conta(String nome, double renda, double juros) {
		this.saldo = 0.0;
		this.nomeTitular = nome;
		this.rendaTitular = renda;
		this.juros = juros;
	}

	public void depositar(double valor) {
		this.saldo = this.saldo + valor;
	}

	public void sacar(double valor) {
		this.saldo = this.saldo - valor;
	}

	public double projLucros(int meses) {
		double proj = this.saldo;
		for (int i = 0; i < meses; i++) {
			proj = proj + (this.saldo * this.juros);
		}
		return proj;
	}

	public double emprestimo() {
		return this.rendaTitular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public double getRendaTitular() {
		return rendaTitular;
	}

	public void setRendaTitular(double rendaTitular) {
		this.rendaTitular = rendaTitular;
	}

	public double getJuros() {
		return juros;
	}

	public void setJuros(double juros) {
		this.juros = juros;
	}

}
