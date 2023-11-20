package character;

public class Hero extends Character {

	Hero(int def, int pow, int lev, int hp, int maxhp, int mp, int maxmp, int magic) {
		super("hero", " ", hp, maxhp, def, pow, magic, mp, maxmp, lev, 0, 0);
	}

}
