package extend.practice;

public abstract class Human extends Living {
	
	public String weapon;
	
	public Human(String name, int hp, int offensive) {
		this.name = name;
		this.hp = hp;
		this.offensive = offensive;
	}
	
	@Override
	public void attack(Living target) {
		int damage = this.offensive * Rand.get(10);
		System.out.println(name + "が" + weapon + "で攻撃!" + target.name + "に" + damage + "のダメージ！");
		target.hp = target.hp - damage;
		if (target.hp <= 0) {
			System.out.println(target.name + "は倒れた。");
		}
	}
	
	
}
