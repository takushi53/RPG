package extend.practice;

import java.util.List;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
			Brave brave = new Brave("勇者", 300, 50);
			Fighter fighter = new Fighter("戦士", 500, 60);
			Wizard wizard = new Wizard("魔法使い", 200, 50);

			Slime slime = new Slime("スライム", 100, 30);
			Oak oak = new Oak("オーク", 400, 40);
			Dragon dragon = new Dragon("ドラゴン", 500, 80);
		
		List<Human> HumanList = new ArrayList<>();
		List<Monster> MonsterList = new ArrayList<>();
		
		HumanList.add(brave);
		HumanList.add(fighter);
		HumanList.add(wizard);
		
		MonsterList.add(slime);
		MonsterList.add(oak);
		MonsterList.add(dragon);
		
		while(HumanList.size() > 0 && MonsterList.size() > 0) {
			Human human = HumanList.get(Rand.get(HumanList.size()));
			Monster monster = MonsterList.get(Rand.get(MonsterList.size()));
			
			System.out.println("人間のターン！");
			human.attack(monster);
			if(monster.hp <= 0) {
				MonsterList.remove(monster);
				if (MonsterList.size() > 0) {
					monster = MonsterList.get(Rand.get(MonsterList.size()));
				}
			}
			
			if (MonsterList.size() > 0){
				System.out.println("モンスターのターン！");
				monster.attack(human);
				if(human.hp <= 0) {
					HumanList.remove(human);
				}
			}
		}
		
		if(HumanList.size() > 0) {
			System.out.println("勇者達は勝利した！");
		} else {
			System.out.println("勇者達は敗北した");
		}
	}
}
