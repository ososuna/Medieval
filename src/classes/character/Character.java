package classes.character;

public abstract class Character {
    
    protected double abilityPower;
    protected double armor;
    protected double attackDamage;
    protected double health;
    protected int level;
    protected double mana;
    protected String name;
    protected String type;
    
    public Character(String name) {
        this.name = name;
    }

    public double getAbilityPower() {
        return abilityPower;
    }

    public void setAbilityPower(double abilityPower) {
        this.abilityPower = abilityPower;
    }

    public double getArmor() {
        return armor;
    }

    public void setArmor(double armor) {
        this.armor = armor;
    }

    public double getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(double attackDamage) {
        this.attackDamage = attackDamage;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public double getMana() {
        return mana;
    }

    public void setMana(double mana) {
        this.mana = mana;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "\nCharacter [abilityPower=" + abilityPower + ", armor=" + armor + ", attackDamage=" + attackDamage
                + ", health=" + health + ", level=" + level + ", mana=" + mana + ", name=" + name + ", type=" + type
                + "]";
    }

}
