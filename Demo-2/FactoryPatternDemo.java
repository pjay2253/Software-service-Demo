/**
 * FactoryPatternDemo class
 * Demonstrates the Factory Pattern by using MammalFactory
 * to retrieve and interact with Mammal objects.
 */
public class FactoryPatternDemo {

    public static void main(String[] args) {

        MammalFactory mammalFactory = new MammalFactory();

        // Get a Human object and call its methods
        Mammal mammal1 = mammalFactory.getMammal("HUMAN");
        mammal1.setName("John");
        mammal1.printInformation();

        System.out.println("----------------------------");

        // Get a Dog object and call its methods
        Mammal mammal2 = mammalFactory.getMammal("DOG");
        mammal2.setName("Buddy");
        mammal2.printInformation();

        System.out.println("----------------------------");

        // Get a Cat object and call its methods
        Mammal mammal3 = mammalFactory.getMammal("CAT");
        mammal3.setName("Whiskers");
        mammal3.printInformation();
    }
}
