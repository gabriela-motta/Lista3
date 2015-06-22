package rpg;

public class Curandeiro extends Papel {

	public Curandeiro(int poder, int defesa) {
		super(poder, defesa);
	}

	@Override
	public int cura() {
		return (int) (super.cura() + super.cura() * 0.4);
	}

	@Override
	public int ataca() {
		return (int) (super.ataca() - super.ataca() * 0.5);
	}

}
