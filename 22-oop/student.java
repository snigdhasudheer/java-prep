class Student {
    String name;
    int age;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {

        // creating object
        Student s1 = new Student();

        s1.name = "Chinnu";
        s1.age = 20;

        s1.display();
    }
}
