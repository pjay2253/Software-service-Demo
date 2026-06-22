/**
 * Concrete class Cat implementing the Mammal interface.
 */
public class Cat implements Mammal {

    @Override
    public void eat() {
        System.out.println("Cat is eating from a dish.");
    }

    @Override
    public void speak() {
        System.out.println("Cat says: Meow!");
    }

    @Override
    public String getType() {
        return "Cat";
    }
}
