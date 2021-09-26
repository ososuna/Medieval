package classes.character;

import java.util.ArrayList;

public class CharacterFactory {
    
    public ArrayList<Character> characters = new ArrayList<Character>();

    public Archer createArcher(String name) {
        Archer archer = new Archer(name);
        characters.add(archer);
        return archer;
    }
    
    public Assassin createAssassin(String name) {
        Assassin assassin = new Assassin(name);
        characters.add(assassin);
        return assassin;
    }
    
    public Tank createTank(String name) {
        Tank tank = new Tank(name);
        characters.add(tank);
        return tank;
    }
    
    public Warrior createWarrior(String name) {
        Warrior warrior = new Warrior(name);
        characters.add(warrior);
        return warrior;
    }
    
    public Wizard createWizard(String name) {
        Wizard wizard = new Wizard(name);
        characters.add(wizard);
        return wizard;
    }

}
