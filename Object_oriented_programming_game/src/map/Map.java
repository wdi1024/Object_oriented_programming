package map;

import java.util.Scanner;

import character.Character;
import character.Racoon;
import character.Tiger;
import character.Wildcat;
import character.Wilddog;

public class Map {
	static int mapnum;
	static Scanner sc = new Scanner(System.in);

	public static void startFight() {
		Character mons;
		System.out.println("사냥터에 입장하였습니다.");
		System.out.println("1. 너구리");
		System.out.println("2. 살쾡이");
		System.out.println("3. 들개");
		System.out.println("4. 호랑이");
		System.out.printf("전투할 상대를 입력하세요. : ");
		int num = sc.nextInt();

		if (num == 1) {
			mons = new Racoon();
		} else if (num == 2) {
			mons = new Wildcat();
		} else if (num == 3) {
			mons = new Wilddog();
		} else if (num == 4) {
			mons = new Tiger();
		} else
			mons = new Racoon();

		System.out.printf("%s과 전투를 시작합니다.", mons.getMonsterName());
		while (true) {

			System.out.println(Character.hero_name + "의 공격입니다.");
			monster_attacked(hero_attack(), mons);

			if (mons.monster_hp <= 0) {

				System.out.println(mons.monster_name + "가 죽었습니다.");
				Character.hero_experience += mons.monster_experience;
				Character.hero_money += mons.monster_money;
				break;
			}

			System.out.println(mons.monster_name + "의 공격입니다.");
			hero_attacked(monster_attack(mons));

			if (Character.hero_hp <= 0) {

				System.out.println(Character.hero_name + "이 죽었습니다.");
				Character.hero_hp = 1;
				System.out.println(Character.hero_name + "이 체력" + Character.hero_hp + "으로 부활했습니다.");
				break;
			}
		}
		if (Character.hero_experience >= Character.hero_level * 80) {
			Character.hero_level += 1;
			System.out.println(Character.hero_name + "의 레벨이" + Character.hero_level + "이 되었습니다.");
			Character.hero_money += Character.hero_level * 50;
			System.out.println("레밸업 기념으로 돈이 " + Character.hero_level * 50 + "원 증가하여 ");
			System.out.println(Character.hero_money + "원이 되었습니다.");
			Character.hero_experience = 0;
		}
	}

	static int hero_attack() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 쓰러스트");
		System.out.printf("공격 번호를 입력하세요 : ");
		int num = sc.nextInt();

		int sum = 0;

		if (num == 1) {

			sum += Character.hero_level * 10;
			sum += Character.hero_power * 30;
		}
		System.out.println("데미지는 " + sum + " 입니다.");
		return sum;
	}

	static void hero_attacked(int sum) {

		if (Character.hero_defense >= sum) {
			Character.hero_hp = Character.hero_hp - 0;
		} else {
			Character.hero_hp = Character.hero_hp + Character.hero_defense - sum;
		}
	}

	static int monster_attack(Character mons) {
		System.out.println("데미지는 " + mons.monster_power + " 입니다.");
		return mons.monster_power;

	}

	static void monster_attacked(int sum, Character mons) {

		if (mons.monster_defense >= sum) {
			mons.monster_hp = mons.monster_hp - 0;
		} else {
			mons.monster_hp = mons.monster_hp + mons.monster_defense - sum;
		}
	}

}
