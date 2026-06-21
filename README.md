# Java Factory Pattern - Mammal Example

## Description
This project demonstrates the **Factory Design Pattern** in Java using a Mammal example.
The Factory Pattern is a creational design pattern that provides an interface for creating objects 
without specifying the exact class to instantiate. Instead of calling `new` directly, a factory 
method handles object creation based on input provided at runtime.

---

## Project Structure

```
├── Mammal.java             # Interface defining the Mammal contract
├── Human.java              # Concrete class implementing Mammal
├── Dog.java                # Concrete class implementing Mammal
├── Cat.java                # Concrete class implementing Mammal
├── MammalFactory.java      # Factory class that generates Mammal objects
└── FactoryPatternDemo.java # Demo class that runs the program
```

---

## Class Diagram

| Component            | Type       | Description                                      |
|----------------------|------------|--------------------------------------------------|
| `Mammal`             | Interface  | Defines `eat()`, `speak()`, and `getType()`      |
| `Human`              | Class      | Implements Mammal — human behaviors              |
| `Dog`                | Class      | Implements Mammal — dog behaviors                |
| `Cat`                | Class      | Implements Mammal — cat behaviors                |
| `MammalFactory`      | Class      | Returns the correct Mammal object by type string |
| `FactoryPatternDemo` | Class      | Entry point — demonstrates the factory in action |

---

## How It Works

1. `FactoryPatternDemo` creates a `MammalFactory` instance
2. It calls `getMammal("HUMAN")`, `getMammal("DOG")`, and `getMammal("CAT")`
3. The factory returns the appropriate object without the caller needing to use `new`
4. Each object's `eat()`, `speak()`, and `getType()` methods are called

---

## Sample Output

```
Type: Human
Human is eating with utensils.
Human says: Hello!
----------------------------
Type: Dog
Dog is eating from a bowl.
Dog says: Woof!
----------------------------
Type: Cat
Cat is eating from a dish.
Cat says: Meow!
```

---

## How to Run

### Requirements
- Java JDK 17 or higher
- Any Java IDE (VS Code, IntelliJ IDEA, Eclipse) or terminal

### Steps
```bash
# Compile all files
javac *.java

# Run the demo
java FactoryPatternDemo
```

---

## References
- Krishnakumar. (2017). *Implement design patterns using Java*. Eduonix.
- Kumar, P. (2022). *Java design patterns - Example tutorial*. JournalDev.
- Tutorialspoint. (2021). *Design pattern – Factory pattern*.
