package classes.character;

public class Assassin extends Character {

    public Assassin(String name) {
        super(name);
        this.abilityPower = 20;
        this.armor = 30;
        this.attackDamage = 800;
        this.health = 60;
        this.level = 1;
        this.mana = 50;
        this.name = name;
        this.type = "Assassin";
    }
    
}
