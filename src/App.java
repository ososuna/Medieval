import java.util.Scanner;

import classes.MedievalFactoryCreate;
import classes.character.CharacterFactory;
import classes.structure.StructureFactory;

public class App {

    public static MedievalFactoryCreate factory = new MedievalFactoryCreate();

    public static CharacterFactory characterFactory = factory.makeCharacterFactory();
    public static StructureFactory structureFactory = factory.makeStructureFactory();
    
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
    
        int option;

        do {
            System.out.println("\nMEDIEVAL GAME");
            System.out.println("1. Create character");
            System.out.println("2. Create structure");
            System.out.println("3. My characters");
            System.out.println("4. My structures");
            System.out.println("5. Get out");
            System.out.print("Enter an option: ");
            option = scanner.nextInt();
            
            switch (option) {
                case 1:
                    menuCharacter();
                    break;
                case 2:
                    menuStructure();
                    break;
                case 3:
                    myCharacters();
                    break;
                case 4:
                    myStructures();
                    break;
                default:
                    System.out.println("\nSee you!\n");
                    return;
            }
        } while (option>= 1 && option <= 4);
    
    }

    public static void menuCharacter() {
        
        int option;
        String name;

        System.out.println("\nCREATE CHARACTER");
        System.out.println("1. Archer");
        System.out.println("2. Assassin");
        System.out.println("3. Tank");
        System.out.println("4. Warrior");
        System.out.println("5. Wizard");
        System.out.print("Enter an option: ");
        option = scanner.nextInt();

        if (option < 1 || option > 5) {
            System.out.println("Invalid option");
            return;
        }

        scanner.nextLine();

        System.out.print("Enter a name: ");
        name = scanner.nextLine();

        switch (option) {
            case 1:
                characterFactory.createArcher(name);
                break;
            case 2:
                characterFactory.createAssassin(name);
                break;
            case 3:
                characterFactory.createTank(name);
                break;
            case 4:
                characterFactory.createWarrior(name);
                break;
            case 5:
                characterFactory.createWizard(name);
                break;
            default:
                break;
        }

        System.out.println("\nCharacter created successfully :)");

    }
    
    public static void menuStructure() {

        int option;

        System.out.println("\nCREATE STRUCTURE");
        System.out.println("1. Armory");
        System.out.println("2. Barn");
        System.out.println("3. Castle");
        System.out.println("4. Smithy");
        System.out.print("Enter an option: ");
        option = scanner.nextInt();

        if (option < 1 || option > 4) {
            System.out.println("Invalid option");
            return;
        }

        switch (option) {
            case 1:
                structureFactory.createArmory();
                break;
            case 2:
                structureFactory.createBarn();
                break;
            case 3:
                structureFactory.createCastle();
                break;
            case 4:
                structureFactory.createSmithy();
                break;
            default:
                break;
        }

        System.out.println("\nStructure created successfully :)");

    }

    public static void myCharacters() {

        if (characterFactory.characters.isEmpty()) {
            System.out.println("\nYou have no characters yet");
            return;
        }

        characterFactory.characters.stream()
            .forEach(System.out::println);
    }
    
    public static void myStructures() {
        
        if (structureFactory.structures.isEmpty()) {
            System.out.println("\nYou have no structures yet");
            return;
        }
        
        structureFactory.structures.stream()
            .forEach(System.out::println);
    }
    
}
