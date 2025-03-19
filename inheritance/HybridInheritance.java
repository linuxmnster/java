package inheritance;

// Parent Interface 1
interface Animal {
    void sound();
}

// Parent Interface 2
interface Pet {
    void friendly();
}

// Child Class inheriting from both interfaces (Hybrid Inheritance)
class Dog implements Animal, Pet {
    public void sound() {
        System.out.println("Dog barks");
    }
    
    public void friendly() {
        System.out.println("Dog is a loyal pet");
    }
}

public class HybridInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();    // From Animal interface
        d.friendly(); // From Pet interface
    }
}

