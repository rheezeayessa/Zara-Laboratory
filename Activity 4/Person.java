public class Person {
    private String name;
    private int id;


    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }
    
    public int getId() {
        return id;
    }
    
    public void displayInfo() {
        System.out.println("\nName: " + name);
        System.out.println("ID: "+ id);
    }
    
    public class SchoolTest {
        public static void main(String[] args) {
           
            System.out.print("--Student Information--");
            Student student = new Student ("Riz Ayessa A. Zara", 2024, "1st Year");
            student.displayInfo();
            System.out.println("");

            System.out.print("--Student Information--");
            Teacher teacher = new Teacher ("Pablito Aguirre", 2024, "Computer Science");
            teacher.displayInfo();
            System.out.println("");

            System.out.print("--Staff Information--");
            Staff staff = new Staff ("Jean Margatet", 2023, "HR Department");
            staff.displayInfo();
            System.out.println("");

        }
    }
}