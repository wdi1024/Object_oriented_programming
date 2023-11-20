package main;

import java.util.Scanner;

import character.Archer;
import character.Character;
import character.Daein;
import character.Magician;
import character.Warrior;
import map.Map;
import map.PotionStore;
import map.WeaponStore;

public class GameMain {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("*******RPG GAME*******");
		System.out.printf("영웅의 이름을 입력하세요. : ");
		Character.hero_name = sc.next();
		heroSelect();
		System.out.println("게임에 입장하였습니다.");

		while (true) {
			System.out.println("*********************");
			System.out.println("현재  Hero 의 이름 : " + Character.hero_name);
			System.out.println("현재 " + Character.hero_name + "의 레벨 : " + Character.hero_level);
			System.out.println("현재 " + Character.hero_name + "의 힘 : " + Character.hero_power);
			System.out.println("현재 " + Character.hero_name + "의 방어력 : " + Character.hero_defense);
			System.out.println("현재 " + Character.hero_name + "의 HP : " + Character.hero_hp);
			System.out.println("현재 " + Character.hero_name + "의 MP : " + Character.hero_mp);
			System.out.println("현재 " + Character.hero_name + "의 경험치 : " + Character.hero_experience);
			System.out.println("현재 " + Character.hero_name + "의 돈 : " + Character.hero_money + "원");
			System.out.println("*********************");

			System.out.println("1. 사냥터");
			System.out.println("2. 포션 상점");
			System.out.println("3. 무기 상점");
			System.out.printf("입장할 장소를 입력하세요. : ");
			int mapnum = sc.nextInt();
			if (mapnum == 1) {
				Map.startFight();
			} else if (mapnum == 2) {
				PotionStore.startPotionStore();
			} else if (mapnum == 3)
				WeaponStore.startWeaponStore();
			else {
				System.out.println("목록 내의 번호를 입력하세요.");
			}
		}
	}

	public static void heroSelect() {
		System.out.println("1. 전사");
		System.out.println("2. 궁수");
		System.out.println("3. 마법사");
		System.out.println("4. Daein");
		System.out.printf("직업의 번호를 입력하세요. : ");
		int num = sc.nextInt();
		if (num == 1) {
			Character P = new Warrior();
		} else if (num == 2) {
			Character P = new Archer();
		} else if (num == 3) {
			Character P = new Magician();
		} else if (num == 4) {
			Character P = new Daein();
		}
	}
}
