class Person {
    String name;
    int age;

    // Constructor to initialize the object
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    Person(Person person) {
        this.name = person.name;
        this.age = person.age;
    }

    // Method to display person details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class CopyConstructor {
    public static void main(String[] args) {
        // Creating an object using the parameterized constructor
        Person person1 = new Person("Srishti", 19);

        // Creating a copy using the copy constructor
        Person person2 = new Person(person1);

        // Displaying CopyConstructor details of both objects
        person1.display();
        person2.display();
    }
}
