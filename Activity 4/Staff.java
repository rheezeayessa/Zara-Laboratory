//package Activity 4;

public class Staff extends Person {
    private String department;

    public Staff(String name, int id, String department){
        super(name, id);
        this.department = department;
    }
    @Override 
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department:" + department);
    }
    public String getDepartment() {
        return department;
        }
    } 
