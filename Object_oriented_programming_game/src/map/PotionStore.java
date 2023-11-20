package map;

import java.util.Scanner;

import character.Hero;

public class PotionStore extends Map {
	static Scanner sc = new Scanner(System.in);

	public static void startPotionStore() {
		while (true) {
			System.out.println("포션 상점에 입장하였습니다.");
			System.out.println("1. 힘 증강 포션 (30원)");
			System.out.println("2. 방어력 증강 포션 (30원)");
			System.out.println("3. 경험치 증강 포션 (100원)");
			System.out.println("4. HP 증강 포션 (10원)");
			System.out.println("5. MP 증강 포션 (10원)");
			System.out.println("6. 돌아가기.");
			System.out.printf("원하시는 물건을 입력하세요. : ");
			int num = sc.nextInt();
			if (num == 6)
				break;
			int temp = Hero.hero_money;
			if ((temp = potionStore_show(temp, num)) != -1) {
				System.out.println("구입이 완료되었습니다.");
				if (num == 1)
					Hero.hero_power += 3;
				if (num == 2)
					Hero.hero_defense += 3;
				if (num == 3)
					Hero.hero_experience += 50;
				if (num == 4)
					Hero.hero_hp += 50;
				if (num == 5)
					Hero.hero_mp += 50;
				Hero.hero_money = temp;
				System.out.println(Hero.hero_money + "원 남았습니다.");
			} else {
				System.out.println("돈이 부족합니다.");
				System.out.println(Hero.hero_money + "원 남았습니다.");
			}
		}
	}

	static int potionStore_show(int money, int num) {
		int powerPotion = 30;
		int defensePotion = 30;
		int experiencePotion = 100;
		int hpPotion = 10;
		int mpPotion = 10;
		String name = "포션 상점";
		System.out.println(name + "에서 물건을 구매 시도하는 중입니다.");
		if (num == 1) {
			if (powerPotion <= money)
				return money - powerPotion;
			else
				return -1;
		}
		if (num == 2) {
			if (defensePotion <= money)
				return money - defensePotion;
			else
				return -1;
		}
		if (num == 3) {
			if (experiencePotion <= money)
				return money - experiencePotion;
			else
				return -1;
		}
		if (num == 4) {
			if (hpPotion <= money)
				return money - hpPotion;
			else
				return -1;
		}
		if (num == 5) {
			if (mpPotion <= money)
				return money - mpPotion;
			else
				return -1;
		}
		return money;
	}
}
