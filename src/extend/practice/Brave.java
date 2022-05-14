package extend.practice;

public class Brave extends Human {
	
	public Brave(String name, int hp, int offensive, String weapon) {
		super(name, hp, offensive);
		this.weapon = weapon;
	}
}
