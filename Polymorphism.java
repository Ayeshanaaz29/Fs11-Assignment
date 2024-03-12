// Base class
class Animal {
    public void makeSound() {
        System.out.println("Some sound");
    }
}

// Derived class Dog
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}

// Derived class Cat
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating objects of both derived classes
        Animal dog = new Dog();
        Animal cat = new Cat();

        // Illustrating runtime polymorphism
        dog.makeSound(); // Output: Woof
        cat.makeSound(); // Output: Meow
    }
}
