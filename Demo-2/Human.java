/**
 * Concrete class Human implementing the Mammal interface.
 */
public class Human implements Mammal {
    private String name;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void printInformation() {
        System.out.println("Human Information:");
        System.out.println("Name: " + name);
        System.out.println("Humans are social beings who communicate through language.");
    }
}
