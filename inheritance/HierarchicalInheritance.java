package inheritance;

// Parent class
class Animal {
    void sound() {
        System.out.println("Animals make sounds");
    }
}

// Child class 1
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

// Child class 2
class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound(); // Inherited from Animal
        d.bark();  // Dog-specific method

        Cat c = new Cat();
        c.sound(); // Inherited from Animal
        c.meow();  // Cat-specific method
    }
}

