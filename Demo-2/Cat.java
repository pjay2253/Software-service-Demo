/**
 * Concrete class Cat implementing the Mammal interface.
 */
public class Cat implements Mammal {
    private String name;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void printInformation() {
        System.out.println("Cat Information:");
        System.out.println("Name: " + name);
        System.out.println("Cats are independent animals known for their agility.");
    }
}
