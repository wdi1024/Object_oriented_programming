package test;

import java.util.Scanner;

public class Information {

	public static void main(String[] args) {
		String hero_name;
		int hero_hp = 80, hero_level = 1, hero_power = 15, hero_defense = 25, hero_money = 0, hero_experience = 0;
		int k;
		String monster_name = "너구리";
		int monster_hp = 100, monster_level = 1, monster_power = 20, monster_defense = 5, monster_money = 10,
				monster_experience = 10;

		// String monster_name="살쾡이";
		// int monster_hp = 2000, monster_level=5, monster_power=100,
		// monster_defense=20, monster_money=30, monster_experience=50;

		Scanner sc = new Scanner(System.in);
		System.out.printf("영웅의 이름을 입력하세요. : ");
		hero_name = sc.next();
		System.out.println("이름이 입력되었습니다.");
		System.out.println("게임에 입장하였습니다.");
		System.out.println("****************************");
		System.out.println("현재 Hero 의 이름 : " + hero_name);
		System.out.println("현재 " + hero_name + "의 레벨 : " + hero_level);
		System.out.println("현재 " + hero_name + "의 힘 : " + hero_power);
		System.out.println("현재 " + hero_name + "의 방어력 : " + hero_defense);
		System.out.println("현재 " + hero_name + "의 HP : " + hero_hp);
		System.out.println("현재 " + hero_name + "의 경험치 : " + hero_experience);
		System.out.println("현재 " + hero_name + "의 돈 : " + hero_money + "원");
		System.out.println("****************************");
		System.out.println("사냥터에 입장하였습니다.");
		System.out.println("1. 너구리");
		System.out.printf("전투 상대를 입력하세요. : ");
		k = sc.nextInt();

		System.out.println(monster_name + "와(과) 전투를 시작합니다.");
		while (true) {
			// 히어로 공격, 몬스터 방어
			int sum = hero_level * 10 + hero_power * 30;
			if (monster_defense >= sum) {
				System.out.println(hero_name + "의 공격이 데미지를 주지 못했습니다.");
				continue;
			} else {
				monster_hp = monster_hp + monster_defense - sum;
				System.out.println("데미지는 " + sum + "입니다.");
			}

			if (monster_hp <= 0) {
				hero_experience += monster_experience;
				hero_money += monster_money;
				System.out.println(monster_name + "이(가) 죽었습니다.");
				break;
			}

			if (hero_defense >= monster_power) {
				System.out.println(monster_name + "의 공격이 데미지를 주지 못했습니다.");
				continue;
			} else {
				hero_hp = hero_hp + hero_defense - monster_power;
				System.out.println(monster_name + "의 공격이 " + monster_power + "의 데미지를 입혔습니다.");
			}
			if (hero_hp <= 0) {
				hero_hp = 1;
				System.out.println(hero_name + "이 죽었습니다.");
				System.out.println(hero_name + "이 체력 1로 부활했습니다.");
				break;
			}
		}
		System.out.println("********************");
		System.out.println("현재 Hero 의 이름 : " + hero_name);
		System.out.println("현재 " + hero_name + "의 레벨 : " + hero_level);
		System.out.println("현재 " + hero_name + "의 힘 : " + hero_power);
		System.out.println("현재 " + hero_name + "의 방어력 : " + hero_defense);
		System.out.println("현재 " + hero_name + "의 HP : " + hero_hp);
		System.out.println("현재 " + hero_name + "의 경험치 : " + hero_experience);
		System.out.println("현재 " + hero_name + "의 돈 : " + hero_money);
	}
}
