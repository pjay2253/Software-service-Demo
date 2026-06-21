/**
 * Concrete class Human implementing the Mammal interface.
 */
public class Human implements Mammal {

    @Override
    public void eat() {
        System.out.println("Human is eating with utensils.");
    }

    @Override
    public void speak() {
        System.out.println("Human says: Hello!");
    }

    @Override
    public String getType() {
        return "Human";
    }
}
