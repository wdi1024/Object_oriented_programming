package character;

import java.util.Scanner;

public class Character {
	public static int hero_level, hero_power, hero_hp, hero_defense, hero_mp, hero_magic, hero_maxHp, hero_maxMp,
			hero_experience, hero_money;
	public static String hero_name;
	public String monster_name;
	public int monster_hp, monster_maxHp, monster_defense, monster_power, monster_mp, monster_maxMp, monster_level,
			monster_experience, monster_money;
	static Scanner sc = new Scanner(System.in);

	public Character(String species, String name, int hp, int maxhp, int def, int pow, int magic, int mp, int maxmp,
			int lev, int exp, int money) {
		if (species == "hero") {
			hero_defense = def;
			hero_power = pow;
			hero_level = lev;
			hero_hp = hp;
			hero_maxHp = maxhp;
			hero_mp = mp;
			hero_maxMp = maxmp;
			hero_magic = magic;
			hero_experience = exp;
			hero_money = money;
		}
		if (species == "monster") {
			monster_name = name;
			monster_hp = hp;
			monster_maxHp = maxhp;
			monster_defense = def;
			monster_power = pow;
			monster_mp = mp;
			monster_maxMp = maxmp;
			monster_level = lev;
			monster_experience = exp;
			monster_money = money;
		}
	}

	public String getMonsterName() {
		return monster_name;
	}
}
