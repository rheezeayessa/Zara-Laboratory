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
            System.out.print("--Person Information--\n");
            Person person = new Person("Azi Doe", 12345);
            person.displayInfo();
           
            System.out.print("--Student Information--\n");
            Student student = new Student ("Riz Ayessa A. Zara", 2024, "1st Year");
            student.displayInfo();

            System.out.print("--Staff Information--\n");
            Staff staff = new Staff ("Jean Margatet", 2023, "HR Department");
            staff.displayInfo();

        }
    }
}