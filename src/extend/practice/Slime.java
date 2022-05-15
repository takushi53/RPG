package extend.practice;

public class Slime extends Monster {
	
	public Slime(String name, int hp, int offensive) {
		super(name, hp, offensive);
	}
	@Override
	public void attack(Living target) {
		int damage = this.offensive * Rand.get(10);
		System.out.println(name + "が体当たりで攻撃!" + target.name + "に" +  damage + "のダメージ！");
		target.hp = target.hp - damage;
		if (target.hp <= 0) {
			System.out.println(target.name + "は倒れた。");
		}
	}
}
