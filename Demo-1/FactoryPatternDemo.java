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
        System.out.println("Type: " + mammal1.getType());
        mammal1.eat();
        mammal1.speak();

        System.out.println("----------------------------");

        // Get a Dog object and call its methods
        Mammal mammal2 = mammalFactory.getMammal("DOG");
        System.out.println("Type: " + mammal2.getType());
        mammal2.eat();
        mammal2.speak();

        System.out.println("----------------------------");

        // Get a Cat object and call its methods
        Mammal mammal3 = mammalFactory.getMammal("CAT");
        System.out.println("Type: " + mammal3.getType());
        mammal3.eat();
        mammal3.speak();
    }
}
