<<<<<<< HEAD
package inheritance;

// Parent class (Super Class)
class Animal {
    void sound() {
        System.out.println("Animals make sounds");
    }
}

// Child class (Sub Class) inherits Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Dog d = new Dog(); 
        d.sound();  // Inherited method
        d.bark();   // Own method
    }
}
=======
package inheritance;

// Parent class (Super Class)
class Animal {
    void sound() {
        System.out.println("Animals make sounds");
    }
}

// Child class (Sub Class) inherits Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Dog d = new Dog(); 
        d.sound();  // Inherited method
        d.bark();   // Own method
    }
}
>>>>>>> 77308f0c5c748b28b33a4723928c57b224b39788
