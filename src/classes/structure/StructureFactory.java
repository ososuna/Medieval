package classes.structure;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StructureFactory {
    
    public ArrayList<Structure> structures = new ArrayList<Structure>();

    public Armory createArmory() {
        int id = getNextId("Armory");
        Armory armory = new Armory(id);
        structures.add(armory);
        return armory;
    }
    
    public Barn createBarn() {
        int id = getNextId("Barn");
        Barn barn = new Barn(id);
        structures.add(barn);
        return barn;
    }
    
    public Castle createCastle() {
        int id = getNextId("Castle");
        Castle castle = new Castle(id);
        structures.add(castle);
        return castle;
    }
    
    public Smithy createSmithy() {
        int id = getNextId("Smithy");
        Smithy smithy = new Smithy(id);
        structures.add(smithy);
        return smithy;
    }

    private int getNextId(String type) {
        
        int id;

        List<Structure> filter = structures.stream()
            .filter(structure -> structure.getType().equals(type))
            .collect(Collectors.toList());

        if (filter.isEmpty()) {
            return 1;
        }

        id = filter.get(filter.size()-1).getId() + 1;

        return id;
    }

}
