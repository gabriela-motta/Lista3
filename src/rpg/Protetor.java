package rpg;

public class Protetor extends Papel {

	public Protetor(int poder, int defesa) {
		super(poder, defesa);
	}

	@Override
	public int defende() {
		return (int) (super.defende() + super.defende() * 0.5);
	}

}
