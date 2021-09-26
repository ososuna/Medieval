import classes.MedievalFactoryCreate;
import classes.character.CharacterFactory;
import classes.structure.StructureFactory;

public class App {
    public static void main(String[] args) throws Exception {
    
        MedievalFactoryCreate factory = new MedievalFactoryCreate();

        CharacterFactory characterFactory = factory.makeCharacterFactory();
        StructureFactory structureFactory = factory.makeStructureFactory();
    
    }
}
