package rpg;

public class Assassino extends Papel {

	public Assassino(int poder, int defesa) {
		super(poder, defesa);
	}

	@Override
	public int ataca() {
		return (int) (super.ataca() + super.ataca() * 0.45);
	}

	@Override
	public int defende() {
		return (int) (super.defende() - super.defende() * 0.5);
	}
}
