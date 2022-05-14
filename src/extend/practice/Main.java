package extend.practice;

import java.util.List;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Human[] humans = new Human[] {
				new Brave("勇者", 300, 50, "剣"),
				new Fighter("戦士", 500, 60, "斧"),
				new Wizard("魔法使い", 200, 50, "魔法")
		};

		Monster[] monsters = new Monster[] {
				new Slime("スライム", 100, 30, "体当たり"),
				new Oak("オーク", 400, 40, "槍"),
				new Dragon("ドラゴン", 500, 80, "炎")
		};		
		
		List<Human> HumanList = new ArrayList<>();
		List<Monster> MonsterList = new ArrayList<>();
		
		for (Human human : humans) {
			HumanList.add(human);
		}
		
		for (Monster monster : monsters) {
			MonsterList.add(monster);
		}
		
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
