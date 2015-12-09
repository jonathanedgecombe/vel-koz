package at.lolst.api.model.data;

public final class BasicDataStats {
	private final double FlatArmorMod;
	private final double FlatAttackSpeedMod;
	private final double FlatBlockMod;
	private final double FlatCritChanceMod;
	private final double FlatCritDamageMod;
	private final double FlatEXPBonus;
	private final double FlatEnergyPoolMod;
	private final double FlatEnergyRegenMod;
	private final double FlatHPPoolMod;
	private final double FlatHPRegenMod;
	private final double FlatMPPoolMod;
	private final double FlatMPRegenMod;
	private final double FlatMagicDamageMod;
	private final double FlatMovementSpeedMod;
	private final double FlatPhysicalDamageMod;
	private final double FlatSpellBlockMod;
	private final double PercentArmorMod;
	private final double PercentAttackSpeedMod;
	private final double PercentBlockMod;
	private final double PercentCritChanceMod;
	private final double PercentCritDamageMod;
	private final double PercentDodgeMod;
	private final double PercentEXPBonus;
	private final double PercentHPPoolMod;
	private final double PercentHPRegenMod;
	private final double PercentLifeStealMod;
	private final double PercentMPPoolMod;
	private final double PercentMPRegenMod;
	private final double PercentMagicDamageMod;
	private final double PercentMovementSpeedMod;
	private final double PercentPhysicalDamageMod;
	private final double PercentSpellBlockMod;
	private final double PercentSpellVampMod;
	private final double rFlatArmorModPerLevel;
	private final double rFlatArmorPenetrationMod;
	private final double rFlatArmorPenetrationModPerLevel;
	private final double rFlatCritChanceModPerLevel;
	private final double rFlatCritDamageModPerLevel;
	private final double rFlatDodgeMod;
	private final double rFlatDodgeModPerLevel;
	private final double rFlatEnergyModPerLevel;
	private final double rFlatEnergyRegenModPerLevel;
	private final double rFlatGoldPer10Mod;
	private final double rFlatHPModPerLevel;
	private final double rFlatHPRegenModPerLevel;
	private final double rFlatMPModPerLevel;
	private final double rFlatMPRegenModPerLevel;
	private final double rFlatMagicDamageModPerLevel;
	private final double rFlatMagicPenetrationMod;
	private final double rFlatMagicPenetrationModPerLevel;
	private final double rFlatMovementSpeedModPerLevel;
	private final double rFlatPhysicalDamageModPerLevel;
	private final double rFlatSpellBlockModPerLevel;
	private final double rFlatTimeDeadMod;
	private final double rFlatTimeDeadModPerLevel;
	private final double rPercentArmorPenetrationMod;
	private final double rPercentArmorPenetrationModPerLevel;
	private final double rPercentAttackSpeedModPerLevel;
	private final double rPercentCooldownMod;
	private final double rPercentCooldownModPerLevel;
	private final double rPercentMagicPenetrationMod;
	private final double rPercentMagicPenetrationModPerLevel;
	private final double rPercentMovementSpeedModPerLevel;
	private final double rPercentTimeDeadMod;
	private final double rPercentTimeDeadModPerLevel;

	public BasicDataStats(double flatArmorMod, double flatAttackSpeedMod,
			double flatBlockMod, double flatCritChanceMod,
			double flatCritDamageMod, double flatEXPBonus,
			double flatEnergyPoolMod, double flatEnergyRegenMod,
			double flatHPPoolMod, double flatHPRegenMod, double flatMPPoolMod,
			double flatMPRegenMod, double flatMagicDamageMod,
			double flatMovementSpeedMod, double flatPhysicalDamageMod,
			double flatSpellBlockMod, double percentArmorMod,
			double percentAttackSpeedMod, double percentBlockMod,
			double percentCritChanceMod, double percentCritDamageMod,
			double percentDodgeMod, double percentEXPBonus,
			double percentHPPoolMod, double percentHPRegenMod,
			double percentLifeStealMod, double percentMPPoolMod,
			double percentMPRegenMod, double percentMagicDamageMod,
			double percentMovementSpeedMod, double percentPhysicalDamageMod,
			double percentSpellBlockMod, double percentSpellVampMod,
			double rFlatArmorModPerLevel, double rFlatArmorPenetrationMod,
			double rFlatArmorPenetrationModPerLevel,
			double rFlatCritChanceModPerLevel,
			double rFlatCritDamageModPerLevel, double rFlatDodgeMod,
			double rFlatDodgeModPerLevel, double rFlatEnergyModPerLevel,
			double rFlatEnergyRegenModPerLevel, double rFlatGoldPer10Mod,
			double rFlatHPModPerLevel, double rFlatHPRegenModPerLevel,
			double rFlatMPModPerLevel, double rFlatMPRegenModPerLevel,
			double rFlatMagicDamageModPerLevel,
			double rFlatMagicPenetrationMod,
			double rFlatMagicPenetrationModPerLevel,
			double rFlatMovementSpeedModPerLevel,
			double rFlatPhysicalDamageModPerLevel,
			double rFlatSpellBlockModPerLevel, double rFlatTimeDeadMod,
			double rFlatTimeDeadModPerLevel,
			double rPercentArmorPenetrationMod,
			double rPercentArmorPenetrationModPerLevel,
			double rPercentAttackSpeedModPerLevel, double rPercentCooldownMod,
			double rPercentCooldownModPerLevel,
			double rPercentMagicPenetrationMod,
			double rPercentMagicPenetrationModPerLevel,
			double rPercentMovementSpeedModPerLevel,
			double rPercentTimeDeadMod, double rPercentTimeDeadModPerLevel) {
		FlatArmorMod = flatArmorMod;
		FlatAttackSpeedMod = flatAttackSpeedMod;
		FlatBlockMod = flatBlockMod;
		FlatCritChanceMod = flatCritChanceMod;
		FlatCritDamageMod = flatCritDamageMod;
		FlatEXPBonus = flatEXPBonus;
		FlatEnergyPoolMod = flatEnergyPoolMod;
		FlatEnergyRegenMod = flatEnergyRegenMod;
		FlatHPPoolMod = flatHPPoolMod;
		FlatHPRegenMod = flatHPRegenMod;
		FlatMPPoolMod = flatMPPoolMod;
		FlatMPRegenMod = flatMPRegenMod;
		FlatMagicDamageMod = flatMagicDamageMod;
		FlatMovementSpeedMod = flatMovementSpeedMod;
		FlatPhysicalDamageMod = flatPhysicalDamageMod;
		FlatSpellBlockMod = flatSpellBlockMod;
		PercentArmorMod = percentArmorMod;
		PercentAttackSpeedMod = percentAttackSpeedMod;
		PercentBlockMod = percentBlockMod;
		PercentCritChanceMod = percentCritChanceMod;
		PercentCritDamageMod = percentCritDamageMod;
		PercentDodgeMod = percentDodgeMod;
		PercentEXPBonus = percentEXPBonus;
		PercentHPPoolMod = percentHPPoolMod;
		PercentHPRegenMod = percentHPRegenMod;
		PercentLifeStealMod = percentLifeStealMod;
		PercentMPPoolMod = percentMPPoolMod;
		PercentMPRegenMod = percentMPRegenMod;
		PercentMagicDamageMod = percentMagicDamageMod;
		PercentMovementSpeedMod = percentMovementSpeedMod;
		PercentPhysicalDamageMod = percentPhysicalDamageMod;
		PercentSpellBlockMod = percentSpellBlockMod;
		PercentSpellVampMod = percentSpellVampMod;
		this.rFlatArmorModPerLevel = rFlatArmorModPerLevel;
		this.rFlatArmorPenetrationMod = rFlatArmorPenetrationMod;
		this.rFlatArmorPenetrationModPerLevel = rFlatArmorPenetrationModPerLevel;
		this.rFlatCritChanceModPerLevel = rFlatCritChanceModPerLevel;
		this.rFlatCritDamageModPerLevel = rFlatCritDamageModPerLevel;
		this.rFlatDodgeMod = rFlatDodgeMod;
		this.rFlatDodgeModPerLevel = rFlatDodgeModPerLevel;
		this.rFlatEnergyModPerLevel = rFlatEnergyModPerLevel;
		this.rFlatEnergyRegenModPerLevel = rFlatEnergyRegenModPerLevel;
		this.rFlatGoldPer10Mod = rFlatGoldPer10Mod;
		this.rFlatHPModPerLevel = rFlatHPModPerLevel;
		this.rFlatHPRegenModPerLevel = rFlatHPRegenModPerLevel;
		this.rFlatMPModPerLevel = rFlatMPModPerLevel;
		this.rFlatMPRegenModPerLevel = rFlatMPRegenModPerLevel;
		this.rFlatMagicDamageModPerLevel = rFlatMagicDamageModPerLevel;
		this.rFlatMagicPenetrationMod = rFlatMagicPenetrationMod;
		this.rFlatMagicPenetrationModPerLevel = rFlatMagicPenetrationModPerLevel;
		this.rFlatMovementSpeedModPerLevel = rFlatMovementSpeedModPerLevel;
		this.rFlatPhysicalDamageModPerLevel = rFlatPhysicalDamageModPerLevel;
		this.rFlatSpellBlockModPerLevel = rFlatSpellBlockModPerLevel;
		this.rFlatTimeDeadMod = rFlatTimeDeadMod;
		this.rFlatTimeDeadModPerLevel = rFlatTimeDeadModPerLevel;
		this.rPercentArmorPenetrationMod = rPercentArmorPenetrationMod;
		this.rPercentArmorPenetrationModPerLevel = rPercentArmorPenetrationModPerLevel;
		this.rPercentAttackSpeedModPerLevel = rPercentAttackSpeedModPerLevel;
		this.rPercentCooldownMod = rPercentCooldownMod;
		this.rPercentCooldownModPerLevel = rPercentCooldownModPerLevel;
		this.rPercentMagicPenetrationMod = rPercentMagicPenetrationMod;
		this.rPercentMagicPenetrationModPerLevel = rPercentMagicPenetrationModPerLevel;
		this.rPercentMovementSpeedModPerLevel = rPercentMovementSpeedModPerLevel;
		this.rPercentTimeDeadMod = rPercentTimeDeadMod;
		this.rPercentTimeDeadModPerLevel = rPercentTimeDeadModPerLevel;
	}

	public double getFlatArmorMod() {
		return FlatArmorMod;
	}

	public double getFlatAttackSpeedMod() {
		return FlatAttackSpeedMod;
	}

	public double getFlatBlockMod() {
		return FlatBlockMod;
	}

	public double getFlatCritChanceMod() {
		return FlatCritChanceMod;
	}

	public double getFlatCritDamageMod() {
		return FlatCritDamageMod;
	}

	public double getFlatEXPBonus() {
		return FlatEXPBonus;
	}

	public double getFlatEnergyPoolMod() {
		return FlatEnergyPoolMod;
	}

	public double getFlatEnergyRegenMod() {
		return FlatEnergyRegenMod;
	}

	public double getFlatHPPoolMod() {
		return FlatHPPoolMod;
	}

	public double getFlatHPRegenMod() {
		return FlatHPRegenMod;
	}

	public double getFlatMPPoolMod() {
		return FlatMPPoolMod;
	}

	public double getFlatMPRegenMod() {
		return FlatMPRegenMod;
	}

	public double getFlatMagicDamageMod() {
		return FlatMagicDamageMod;
	}

	public double getFlatMovementSpeedMod() {
		return FlatMovementSpeedMod;
	}

	public double getFlatPhysicalDamageMod() {
		return FlatPhysicalDamageMod;
	}

	public double getFlatSpellBlockMod() {
		return FlatSpellBlockMod;
	}

	public double getPercentArmorMod() {
		return PercentArmorMod;
	}

	public double getPercentAttackSpeedMod() {
		return PercentAttackSpeedMod;
	}

	public double getPercentBlockMod() {
		return PercentBlockMod;
	}

	public double getPercentCritChanceMod() {
		return PercentCritChanceMod;
	}

	public double getPercentCritDamageMod() {
		return PercentCritDamageMod;
	}

	public double getPercentDodgeMod() {
		return PercentDodgeMod;
	}

	public double getPercentEXPBonus() {
		return PercentEXPBonus;
	}

	public double getPercentHPPoolMod() {
		return PercentHPPoolMod;
	}

	public double getPercentHPRegenMod() {
		return PercentHPRegenMod;
	}

	public double getPercentLifeStealMod() {
		return PercentLifeStealMod;
	}

	public double getPercentMPPoolMod() {
		return PercentMPPoolMod;
	}

	public double getPercentMPRegenMod() {
		return PercentMPRegenMod;
	}

	public double getPercentMagicDamageMod() {
		return PercentMagicDamageMod;
	}

	public double getPercentMovementSpeedMod() {
		return PercentMovementSpeedMod;
	}

	public double getPercentPhysicalDamageMod() {
		return PercentPhysicalDamageMod;
	}

	public double getPercentSpellBlockMod() {
		return PercentSpellBlockMod;
	}

	public double getPercentSpellVampMod() {
		return PercentSpellVampMod;
	}

	public double getrFlatArmorModPerLevel() {
		return rFlatArmorModPerLevel;
	}

	public double getrFlatArmorPenetrationMod() {
		return rFlatArmorPenetrationMod;
	}

	public double getrFlatArmorPenetrationModPerLevel() {
		return rFlatArmorPenetrationModPerLevel;
	}

	public double getrFlatCritChanceModPerLevel() {
		return rFlatCritChanceModPerLevel;
	}

	public double getrFlatCritDamageModPerLevel() {
		return rFlatCritDamageModPerLevel;
	}

	public double getrFlatDodgeMod() {
		return rFlatDodgeMod;
	}

	public double getrFlatDodgeModPerLevel() {
		return rFlatDodgeModPerLevel;
	}

	public double getrFlatEnergyModPerLevel() {
		return rFlatEnergyModPerLevel;
	}

	public double getrFlatEnergyRegenModPerLevel() {
		return rFlatEnergyRegenModPerLevel;
	}

	public double getrFlatGoldPer10Mod() {
		return rFlatGoldPer10Mod;
	}

	public double getrFlatHPModPerLevel() {
		return rFlatHPModPerLevel;
	}

	public double getrFlatHPRegenModPerLevel() {
		return rFlatHPRegenModPerLevel;
	}

	public double getrFlatMPModPerLevel() {
		return rFlatMPModPerLevel;
	}

	public double getrFlatMPRegenModPerLevel() {
		return rFlatMPRegenModPerLevel;
	}

	public double getrFlatMagicDamageModPerLevel() {
		return rFlatMagicDamageModPerLevel;
	}

	public double getrFlatMagicPenetrationMod() {
		return rFlatMagicPenetrationMod;
	}

	public double getrFlatMagicPenetrationModPerLevel() {
		return rFlatMagicPenetrationModPerLevel;
	}

	public double getrFlatMovementSpeedModPerLevel() {
		return rFlatMovementSpeedModPerLevel;
	}

	public double getrFlatPhysicalDamageModPerLevel() {
		return rFlatPhysicalDamageModPerLevel;
	}

	public double getrFlatSpellBlockModPerLevel() {
		return rFlatSpellBlockModPerLevel;
	}

	public double getrFlatTimeDeadMod() {
		return rFlatTimeDeadMod;
	}

	public double getrFlatTimeDeadModPerLevel() {
		return rFlatTimeDeadModPerLevel;
	}

	public double getrPercentArmorPenetrationMod() {
		return rPercentArmorPenetrationMod;
	}

	public double getrPercentArmorPenetrationModPerLevel() {
		return rPercentArmorPenetrationModPerLevel;
	}

	public double getrPercentAttackSpeedModPerLevel() {
		return rPercentAttackSpeedModPerLevel;
	}

	public double getrPercentCooldownMod() {
		return rPercentCooldownMod;
	}

	public double getrPercentCooldownModPerLevel() {
		return rPercentCooldownModPerLevel;
	}

	public double getrPercentMagicPenetrationMod() {
		return rPercentMagicPenetrationMod;
	}

	public double getrPercentMagicPenetrationModPerLevel() {
		return rPercentMagicPenetrationModPerLevel;
	}

	public double getrPercentMovementSpeedModPerLevel() {
		return rPercentMovementSpeedModPerLevel;
	}

	public double getrPercentTimeDeadMod() {
		return rPercentTimeDeadMod;
	}

	public double getrPercentTimeDeadModPerLevel() {
		return rPercentTimeDeadModPerLevel;
	}
}
