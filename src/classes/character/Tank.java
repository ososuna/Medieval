package classes.character;

public class Tank extends Character {

    public Tank(String name) {
        super(name);
        this.abilityPower = 10;
        this.armor = 500;
        this.attackDamage = 100;
        this.health = 800;
        this.level = 1;
        this.mana = 20;
        this.name = name;
        this.type = "Tank";
    }

}
