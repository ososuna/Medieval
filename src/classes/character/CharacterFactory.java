package classes.character;

public class CharacterFactory {
    
    public Archer createArcher(String name) {
        return new Archer(name);
    }
    
    public Assassin createAssassin(String name) {
        return new Assassin(name);
    }
    
    public Tank createTank(String name) {
        return new Tank(name);
    }
    
    public Warrior createWarrior(String name) {
        return new Warrior(name);
    }
    
    public Wizard createWizard(String name) {
        return new Wizard(name);
    }

}
