package map;

import java.util.Scanner;

import character.Hero;

public class WeaponStore extends Map {
	static Scanner sc = new Scanner(System.in);
	static int wep1 = 0, wep2 = 0, wep3 = 0, wep4 = 0, wep5 = 0;

	static public void startWeaponStore() {
		while (true) {
			System.out.println("무기 상점에 입장하였습니다.");
			System.out.println("1. 도둑의 단검 (50원)");
			System.out.println("2. 기사의 양날검 (150원)");
			System.out.println("3. 군인의 조총 (500원)");
			System.out.println("4. 장교의 권총 (1000원)");
			System.out.println("5. 장군의 기관총 (10000원)");
			System.out.println("6. 돌아가기");
			System.out.printf("원하시는 물건을 입력하세요. : ");
			int num = sc.nextInt();
			if (num == 6)
				break;
			int temp = Hero.hero_money;
			if ((temp = WeaponStore_show(temp, num)) != -1) {
				System.out.println("구입이 완료되었습니다.");
				if (num == 1) {
					Hero.hero_power += 5;
					check_another_wep();
					wep1 = 1;
				}
				if (num == 2) {
					Hero.hero_power += 20;
					check_another_wep();
					wep2 = 1;
				}
				if (num == 3) {
					Hero.hero_power += 80;
					check_another_wep();
					wep3 = 1;
				}
				if (num == 4) {
					Hero.hero_power += 320;
					check_another_wep();
					wep4 = 1;
				}
				if (num == 5) {
					Hero.hero_power += 3000;
					check_another_wep();
					wep5 = 1;
				}
				Hero.hero_money = temp;
				System.out.println(Hero.hero_money + "원 남았습니다.");
			} else {
				System.out.println("돈이 부족합니다.");
				System.out.println(Hero.hero_money + "원 남았습니다.");
			}
		}
	}

	static void check_another_wep() {
		if (wep1 == 1) {
			wep1 = 0;
			Hero.hero_power -= 5;
		}
		if (wep2 == 1) {
			wep2 = 0;
			Hero.hero_power -= 20;
		}
		if (wep3 == 1) {
			wep3 = 0;
			Hero.hero_power -= 80;
		}
		if (wep4 == 1) {
			wep4 = 0;
			Hero.hero_power -= 320;
		}
		if (wep5 == 1) {
			wep5 = 0;
			Hero.hero_power -= 3000;
		}
	}

	static int WeaponStore_show(int money, int num) {
		String name = "무기 상점";
		System.out.println(name + "에서 물건을 구매 시도하는 중입니다.");
		if (num == 1) {
			if (50 <= money)
				return money - 50;
			else
				return -1;
		}
		if (num == 2) {
			if (150 <= money)
				return money - 150;
			else
				return -1;
		}
		if (num == 3) {
			if (500 <= money)
				return money - 500;
			else
				return -1;
		}
		if (num == 4) {
			if (1000 <= money)
				return money - 1000;
			else
				return -1;
		}
		if (num == 5) {
			if (10000 <= money)
				return money - 10000;
			else
				return -1;
		}
		return money;
	}
}
