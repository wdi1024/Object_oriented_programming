package game;

import java.util.Scanner;

public class Day2 {
	static int hero_level, hero_power, hero_hp, hero_defense, hero_mp, hero_experience, hero_money;
	static int monster_hp, monster_defense, monster_power, monster_mp, monster_level, monster_experience, monster_money;
	static String hero_name, monster_name;

	static int hero_attack() {
		int damage;
		Scanner sc = new Scanner(System.in);
		System.out.println(hero_name + "의 공격입니다.\n");
		System.out.println("------  스킬목록  -----");
		System.out.println("1. 쓰러스트\n");
		System.out.printf("공격 번호를 입력하세요 : ");
		int sk = sc.nextInt();
		while (sk != 1) {
			System.out.println("스킬 목록에서 스킬을 선택해주세요.\n");
			System.out.println("------  스킬목록  -----");
			System.out.println("1. 쓰러스트\n");
			System.out.printf("공격 번호를 입력하세요 : ");
			sk = sc.nextInt();
		}
		if (sk == 1)
			damage = hero_level * 10 + hero_power * 30;
		else
			damage = hero_level * 10 + hero_power * 30;
		return damage;
	}

	static void hero_attacked(int sum) {
		int a = sum - hero_defense;
		if (a > 0) {
			System.out.println(monster_name + "의 공격이 모험가에게 " + a + "의 데미지를 입혔습니다.\n");
			hero_hp -= a;
		} else {
			System.out.println(monster_name + "의 공격이 데미지를 주지 못했습니다.\n");
		}

	}

	static int monster_attack() {
		System.out.println(monster_name + "이(가) 공격입니다.\n");
		return monster_power;
	}

	static void monster_attacked(int sum) {
		int a = sum - monster_defense;
		if (a > 0) {
			System.out.println(hero_name + "의 공격이 " + monster_name + "에게 " + a + "의 데미지를 입혔습니다.\n");
			monster_hp -= a;
		} else {
			System.out.println(hero_name + "의 공격이 데미지를 주지 못했습니다.\n");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("**********RPG GAME**********");
		System.out.println("1. 전사\n2. 궁수(미구현)");
		System.out.printf("직업의 번호를 입력하세요. : ");
		int num = sc.nextInt();
		while (num != 1) {
			System.out.println("미구현된 직업입니다. 구현된 직업을 선택해주세요.");
			System.out.println("1. 전사\n2. 궁수(미구현)");
			System.out.printf("직업의 번호를 입력하세요. : ");
			num = sc.nextInt();
		}
		if (num == 1) {
			System.out.println("전사가 선택되었습니다.");
			hero_hp = 80;
			hero_level = 1;
			hero_power = 15;
			hero_defense = 25;
			hero_money = 0;
			hero_experience = 0;
		}
		System.out.printf("영웅의 이름을 입력하세요. : ");
		hero_name = sc.next();
		System.out.println("이름이 입력되었습니다.\n");
		System.out.println("게임에 입장하였습니다.\n");
		while (true) {
			System.out.println("****************************\n");
			System.out.println("현재 Hero 의 이름 : " + hero_name);
			System.out.println("현재 " + hero_name + "의 레벨 : " + hero_level);
			System.out.println("현재 " + hero_name + "의 힘 : " + hero_power);
			System.out.println("현재 " + hero_name + "의 방어력 : " + hero_defense);
			System.out.println("현재 " + hero_name + "의 HP : " + hero_hp);
			System.out.println("현재 " + hero_name + "의 경험치 : " + hero_experience);
			System.out.println("현재 " + hero_name + "의 돈 : " + hero_money + "원\n");
			System.out.println("****************************\n");
			System.out.println("1. 사냥터\n2. 물약상점\n3. 게임종료\n");
			System.out.printf("입장할 장소를 입력하세요. : ");
			int place = sc.nextInt();
			if (place == 3) {
				System.out.println("게임을 종료합니다. ");
				break;
			}
			if (place != 1 && place != 2 && place != 3)
				continue;
			while (place == 1) {
				System.out.println("사냥터에 입장하였습니다.\n");
				System.out.println("-----  몬스터 선택  -----");
				System.out.println("1. 너구리\n2. 살쾡이\n3. 뒤로가기\n");
				System.out.printf("전투 상대를 입력하세요. : ");
				int k = sc.nextInt();
				if (k == 1) {
					monster_name = "너구리";
					monster_hp = 100;
					monster_level = 1;
					monster_power = 20;
					monster_defense = 5;
					monster_money = 10;
					monster_experience = 10;
				} else if (k == 2) {
					monster_name = "살쾡이";
					monster_hp = 2000;
					monster_level = 5;
					monster_power = 100;
					monster_defense = 20;
					monster_money = 30;
					monster_experience = 50;
				} else
					break;
				System.out.println(monster_name + "와(과) 전투를 시작합니다.\n");
				while (monster_hp > 0 & hero_hp > 0) {
					monster_attacked(hero_attack());
					if (monster_hp <= 0) {
						System.out.println(monster_name + "을(를) 처치했습니다.\n");
						hero_money += monster_money;
						hero_experience += monster_experience;
						break;
					}
					hero_attacked(monster_attack());
					if (hero_hp <= 0) {
						hero_hp = 1;
						System.out.println(hero_name + "이 죽었습니다.\n");
						System.out.println(hero_name + "이 체력 1로 부활했습니다.\n");
						break;
					}
				}
				break;
			}

			while (place == 2) {
				System.out.println("포션 상점에 입장하였습니다.\n");
				System.out.println("-----  구매가능 물건 목록  -----\n");
				System.out.println("1. 힘 증강 포션 (30원)");
				System.out.println("2. 방어력 증강 포션 (30원)");
				System.out.println("3. 경험치 증강 포션 (100원)");
				System.out.println("4. HP 증강 포션 (10원)");
				System.out.println("5. MP 증강 포션 (10원)");
				System.out.println("6. 뒤로 가기\n");
				System.out.printf("원하시는 물건을 입력하세요. : ");
				int b = sc.nextInt();
				if (b != 1 && b != 2 && b != 3 && b != 4 && b != 5 && b != 6) {
					System.out.println("1 ~ 6번 사이의 물건을 선택해주십시오.");
					continue;
				}
				System.out.println("포션 상점에서 원하시는 물건을 구매 시도하는 중입니다.");
				switch (b) {
				case 1: {
					if (hero_money < 30) {
						System.out.println("돈이 모자랍니다.");
						break;
					}
					hero_money -= 30;
					hero_power += 10;
					System.out.println("구입이 완료되었습니다.");
					System.out.println(hero_money + "원 남았습니다.");
					break;
				}
				case 2: {
					if (hero_money < 30) {
						System.out.println("돈이 모자랍니다.");
						break;
					}
					hero_money -= 30;
					hero_defense += 10;
					System.out.println("구입이 완료되었습니다.");
					System.out.println(hero_money + "원 남았습니다.");
					break;
				}
				case 3: {
					if (hero_money < 100) {
						System.out.println("돈이 모자랍니다.");
						break;
					}
					hero_money -= 100;
					hero_experience += 50;
					System.out.println("구입이 완료되었습니다.");
					System.out.println(hero_money + "원 남았습니다.");
					break;
				}
				case 4: {
					if (hero_money < 10) {
						System.out.println("돈이 모자랍니다.");
						break;
					}
					hero_money -= 10;
					hero_hp += 30;
					System.out.println("구입이 완료되었습니다.");
					System.out.println(hero_money + "원 남았습니다.");
					break;
				}
				case 5: {
					if (hero_money < 10) {
						System.out.println("돈이 모자랍니다.");
						break;
					}
					hero_money -= 10;
					hero_mp += 30;
					System.out.println("구입이 완료되었습니다.");
					System.out.println(hero_money + "원 남았습니다.");
					break;
				}
				}
				if (b == 6)
					break;
			}
			while (hero_experience >= 80 * hero_level) {
				hero_experience -= 80 * hero_level;
				hero_level += 1;
				System.out.println(hero_name + "이(가) " + hero_level + "로 레벨업했습니다.");
				hero_money += hero_level * 50;
				System.out.println("레벨업 기념으로 돈이 " + (hero_level * 50) + "원 증가하여 " + hero_money + "가 되었습니다.");
			}
		}
	}

}
