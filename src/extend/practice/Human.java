package extend.practice;

public abstract class Human extends Living {
		
	public Human(String name, int hp, int offensive) {
		this.name = name;
		this.hp = hp;
		this.offensive = offensive;
	}
	
	abstract void attack(Living target);
	
	
}
