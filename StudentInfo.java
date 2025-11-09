class Student {
    String name = "Student 1";
    int age = 18;
}

public class StudentInfo {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name);
        System.out.println(s.age);
    }
}
