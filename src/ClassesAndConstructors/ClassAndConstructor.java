package ClassesAndConstructors;

class Student {
    String name;
    int rollNo;
    char grade;

    // Constructor to initialize the object
    Student(String name, int rollNo, char grade) {
        this.name = name;
        this.rollNo = rollNo;
        this.grade = grade;
    }

    // Method to display student details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Grade: " + grade);
    }
}

public class ClassAndConstructor {
    public static void main(String[] args) {
        // Creating object using the constructor
        Student s1 = new Student("Srishti", 17, 'A');
        s1.display();
    }
}
