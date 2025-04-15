// Package: Activity 4
public class Student extends Person {
    private String gradeLevel;

    // constructor

    public Student(String name, int id, String gradeLevel) {
        super(name, id);
        this.gradeLevel = gradeLevel;
    }
@Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Grade level: " + gradeLevel);
    }
}
