package arraye;

import java.util.ArrayList;

class Student {
    private String name;
    private int age;
    private String grade;

    public Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGrade() {
        return grade;
    }

    public void displayStudentDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println();
    }
}

class Classroom {
    private ArrayList<Student> students;

    public Classroom() {
        students = new ArrayList<Student>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayAllStudents() {
        for (Student student : students) {
            student.displayStudentDetails();
        }
    }
}

public class main {
    public static void main(String[] args) {
        Classroom classroom = new Classroom();

        // Adding students to the classroom
        Student student1 = new Student("Pihu", 23, "10th Grade");
        Student student2 = new Student("Sahil", 24, "11th Grade");
        Student student3 = new Student("Rohit", 23, "9th Grade");

        classroom.addStudent(student1);
        classroom.addStudent(student2);
        classroom.addStudent(student3);

        classroom.displayAllStudents();
    }
}
