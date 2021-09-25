package classes.character;

public class Warrior extends Character {

    public Warrior(String name) {
        super(name);
        this.abilityPower = 20;
        this.armor = 300;
        this.attackDamage = 400;
        this.health = 250;
        this.level = 1;
        this.mana = 50;
        this.name = name;
        this.type = "Warrior";
    }

}
