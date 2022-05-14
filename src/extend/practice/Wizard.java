package extend.practice;

public class Wizard extends Human {
	
	public Wizard(String name, int hp, int offensive, String weapon) {
		super(name, hp, offensive);
		this.weapon = weapon;
	}
}
