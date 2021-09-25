package classes.character;

public class Wizard extends Character {

    public Wizard(String name) {
        super(name);
        this.abilityPower = 800;
        this.armor = 50;
        this.attackDamage = 50;
        this.health = 150;
        this.level = 1;
        this.mana = 200;
        this.name = name;
        this.type = "Wizard";
    }
    
}
