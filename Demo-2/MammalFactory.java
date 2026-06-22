/**
 * MammalFactory class
 * Generates objects of Human, Dog, and Cat based on the given type string.
 */
public class MammalFactory {

    /**
     * Returns a Mammal object based on the type provided.
     * @param mammalType - a String specifying which mammal to create
     * @return Mammal object or null if type is unrecognized
     */
    public Mammal getMammal(String mammalType) {
        if (mammalType == null) {
            return null;
        }
        if (mammalType.equalsIgnoreCase("HUMAN")) {
            return new Human();
        } else if (mammalType.equalsIgnoreCase("DOG")) {
            return new Dog();
        } else if (mammalType.equalsIgnoreCase("CAT")) {
            return new Cat();
        }
        return null;
    }
}
