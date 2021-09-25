package classes.character;

public class Archer extends Character {

    public Archer(String name) {
        super(name);
        this.abilityPower = 20;
        this.armor = 100;
        this.attackDamage = 500;
        this.health = 100;
        this.level = 1;
        this.mana = 50;
        this.name = name;
        this.type = "Archer";
    }

}
