package banco;

public class MainBanco {

	public static void main(String[] args) {
		Conta c1 = new Conta("Joao", 1000, 0.1);
		Conta c2 = new ContaEstudante("Maria", 400, 0.02);
		Conta c3 = new ContaPoupanca("Jose", 700, 0.3);
		Conta c4 = new ContaElite("Ana", 4000, 0.15);

		c1.depositar(100);
		c2.depositar(100);
		c3.depositar(100);
		c4.depositar(100);

		System.out.println("Proj");
		System.out.println(c1.projLucros(5));
		System.out.println(c2.projLucros(5));
		System.out.println(c3.projLucros(5));
		System.out.println(c4.projLucros(5));

		System.out.println("Emprestimos");
		System.out.println(c1.emprestimo());
		System.out.println(c2.emprestimo());
		System.out.println(c3.emprestimo());
		System.out.println(c4.emprestimo());
	}

}
