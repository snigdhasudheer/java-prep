class Student {
    private String name;

    // Setter
    void setName(String n) {
        name = n;
    }

    // Getter
    String getName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();

        s1.setName("Chinnu");

        System.out.println(s1.getName());
    }
}
