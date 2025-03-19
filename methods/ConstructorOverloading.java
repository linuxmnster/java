package methods;

class Student {
    String name;
    int age;

    // Constructor 1: No parameters
    Student() {
        name = "Unknown";
        age = 0;
    }

    // Constructor 2: One parameter
    Student(String n) {
        name = n;
        age = 0;
    }

    // Constructor 3: Two parameters
    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Student s1 = new Student();           // Calls Constructor 1
        Student s2 = new Student("Alice");    // Calls Constructor 2
        Student s3 = new Student("Bob", 20);  // Calls Constructor 3

        s1.display();
        s2.display();
        s3.display();
    }
}

// same name as class name with methods having different behaviours