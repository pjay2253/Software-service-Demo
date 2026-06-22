/**
 * Concrete class Dog implementing the Mammal interface.
 */
public class Dog implements Mammal {
    private String name;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void printInformation() {
        System.out.println("Dog Information:");
        System.out.println("Name: " + name);
        System.out.println("Dogs are loyal animals known as man's best friend.");
    }
}
