package extend.practice;

public class Oak extends Monster {
	public Oak(String name, int hp, int offensive, String skill) {
		super(name, hp, offensive);
		this.skill = skill;
	}
}
