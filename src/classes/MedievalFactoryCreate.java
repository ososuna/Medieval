package classes;

import classes.character.CharacterFactory;
import classes.structure.StructureFactory;

public class MedievalFactoryCreate {
    
    public CharacterFactory makeCharacterFactory() {
        return new CharacterFactory();
    }
    
    public StructureFactory makeStructureFactory() {
        return new StructureFactory();
    }

}
