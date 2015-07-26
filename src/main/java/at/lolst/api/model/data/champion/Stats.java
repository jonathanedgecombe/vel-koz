package at.lolst.api.model.data.champion;

/**
 * 
 * @author jonathan
 *
 */
public final class Stats {
	private final double armor, armorperlevel, attackdamage, attackdamageperlevel, attackrange, attackspeedoffset, attackspeedperlevel, crit, critperlevel, hp, hpperlevel, hpregen, hpregenperlevel, movespeed, mp, mpperlevel, mpregen, mpregenperlevel, spellblock, spellblockperlevel;

	public Stats(double armor, double armorperlevel, double attackdamage, double attackdamageperlevel, double attackrange, double attackspeedoffset, double attackspeedperlevel, double crit, double critperlevel, double hp, double hpperlevel, double hpregen, double hpregenperlevel, double movespeed, double mp, double mpperlevel, double mpregen, double mpregenperlevel, double spellblock, double spellblockperlevel) {
		this.armor = armor;
		this.armorperlevel = armorperlevel;
		this.attackdamage = attackdamage;
		this.attackdamageperlevel = attackdamageperlevel;
		this.attackrange = attackrange;
		this.attackspeedoffset = attackspeedoffset;
		this.attackspeedperlevel = attackspeedperlevel;
		this.crit = crit;
		this.critperlevel = critperlevel;
		this.hp = hp;
		this.hpperlevel = hpperlevel;
		this.hpregen = hpregen;
		this.hpregenperlevel = hpregenperlevel;
		this.movespeed = movespeed;
		this.mp = mp;
		this.mpperlevel = mpperlevel;
		this.mpregen = mpregen;
		this.mpregenperlevel = mpregenperlevel;
		this.spellblock = spellblock;
		this.spellblockperlevel = spellblockperlevel;
	}

	public double getAttackdamage() {
		return attackdamage;
	}

	public double getAttackdamageperlevel() {
		return attackdamageperlevel;
	}

	public double getAttackrange() {
		return attackrange;
	}

	public double getAttackspeedoffset() {
		return attackspeedoffset;
	}

	public double getAttackspeedperlevel() {
		return attackspeedperlevel;
	}

	public double getCrit() {
		return crit;
	}

	public double getCritperlevel() {
		return critperlevel;
	}

	public double getHp() {
		return hp;
	}

	public double getHpperlevel() {
		return hpperlevel;
	}

	public double getHpregen() {
		return hpregen;
	}

	public double getHpregenperlevel() {
		return hpregenperlevel;
	}

	public double getMovespeed() {
		return movespeed;
	}

	public double getMp() {
		return mp;
	}

	public double getMpperlevel() {
		return mpperlevel;
	}

	public double getMpregen() {
		return mpregen;
	}

	public double getMpregenperlevel() {
		return mpregenperlevel;
	}

	public double getSpellblock() {
		return spellblock;
	}

	public double getSpellblockperlevel() {
		return spellblockperlevel;
	}

	public double getArmor() {
		return armor;
	}

	public double getArmorperlevel() {
		return armorperlevel;
	}
}
