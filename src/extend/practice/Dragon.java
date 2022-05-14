package extend.practice;

public class Dragon extends Monster {
	public Dragon(String name, int hp, int offensive, String skill) {
		super(name, hp, offensive);
		this.skill = skill;
	}
}
