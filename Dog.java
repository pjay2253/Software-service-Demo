/**
 * Concrete class Dog implementing the Mammal interface.
 */
public class Dog implements Mammal {

    @Override
    public void eat() {
        System.out.println("Dog is eating from a bowl.");
    }

    @Override
    public void speak() {
        System.out.println("Dog says: Woof!");
    }

    @Override
    public String getType() {
        return "Dog";
    }
}
