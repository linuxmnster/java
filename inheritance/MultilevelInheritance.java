package inheritance;

// Parent class (Super Class)
class Animal {
    void sound() {
        System.out.println("Animals make sounds");
    }
}

// Child class (inherits Animal)
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

// Grandchild class (inherits Dog)
class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy weeps");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.sound(); // Inherited from Animal
        p.bark();  // Inherited from Dog
        p.weep();  // Own method
    }
}
