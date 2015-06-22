package rpg;

public class Papel {
	private int poder;
	private int defesa;

	public Papel(int poder, int defesa) {
		this.poder = poder;
		this.defesa = defesa;
	}

	public int ataca() {
		return -this.poder;
	}

	public int defende() {
		return this.defesa;
	}

	public int cura() {
		return this.poder;
	}
}
