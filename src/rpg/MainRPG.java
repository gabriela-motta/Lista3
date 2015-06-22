package rpg;

public class MainRPG {

	public static void main(String[] args) {
		Sala sala1 = new CamaraGas();
		Sala sala2 = new Santuario();
		Sala normal = new Sala();
		
		System.out.println(sala1.entraNaSala());
		System.out.println(sala2.entraNaSala());
		System.out.println(normal.entraNaSala());
	}

}
