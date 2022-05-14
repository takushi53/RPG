package extend.practice;

public abstract class Monster extends Living {

	public String skill;
	
	public Monster(String name, int hp, int offensive) {
		this.name = name;
		this.hp = hp;
		this.offensive = offensive;
	}
	
	@Override
	public void attack(Living target) {
		int damage = this.offensive * Rand.get(10);
		System.out.println(name + "が" + skill + "で攻撃!" + target.name + "に" +  damage + "のダメージ！");
		target.hp = target.hp - damage;
	}
}
