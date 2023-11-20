package character;

public class Monster extends Character {

	public Monster(String name, int hp, int maxhp, int def, int pow, int mp, int maxmp, int lev, int exp, int money) {
		super("monster", name, hp, maxhp, def, pow, 0, mp, maxmp, lev, exp, money);
	}

	public String getMonsterName() {
		return monster_name;
	}
}
