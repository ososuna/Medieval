package classes.structure;

public class StructureFactory {
    
    public Armory createArmory(int id, int level) {
        return new Armory(id, level);
    }
    
    public Barn createBarn(int id, int level) {
        return new Barn(id, level);
    }
    
    public Castle createCastle(int id, int level) {
        return new Castle(id, level);
    }
    
    public Smithy createSmithy(int id, int level) {
        return new Smithy(id, level);
    }

}
