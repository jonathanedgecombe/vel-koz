package at.lolst.api.model.data.champion;

/**
 * 
 * @author jonathan
 *
 */
public final class Info {
	private final int attack, defense, difficulty, magic;

	public Info(int attack, int defense, int difficulty, int magic) {
		this.attack = attack;
		this.defense = defense;
		this.difficulty = difficulty;
		this.magic = magic;
	}

	public int getAttack() {
		return attack;
	}

	public int getDefense() {
		return defense;
	}

	public int getDifficulty() {
		return difficulty;
	}

	public int getMagic() {
		return magic;
	}
}
