import java.util.Scanner;

class Vehicle {  
    private String brand;
    private int speed;
    private String fuelType;

    
    public Vehicle(String brand, int speed, String fuelType) {
        this.brand = brand;
        this.speed = speed;
        this.fuelType = fuelType;
    }

    public String getBrand() {
        return brand;
    }

    public int getSpeed() {
        return speed;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void displayInfo() {
        System.out.println("Brand: " + getBrand());
        System.out.println("Speed: " + getSpeed() + " km/h");
        System.out.println("Fuel Type: " + getFuelType());
    }
}

class Car extends Vehicle {
    private int numDoors;

    public Car(String brand, int speed, String fuelType, int numDoors) {
        super(brand, speed, fuelType);
        this.numDoors = numDoors;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of doors: " + numDoors);
    }
}

class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String brand, int speed, String fuelType, boolean hasSidecar) {
        super(brand, speed, fuelType);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Has sidecar: " + (hasSidecar ? "Yes!" : "No!"));
    }

}

class Main {
    public static void main(String[] args) {
        Scanner dw = new Scanner(System.in);

      
        boolean runprogram = true;
        
        while (runprogram) {
            System.out.println("Select the type of vehicle! (1 for Car, 2 for Motorcycle, 3 to exit): ");
            int vehicleChoice = dw.nextInt();
            dw.nextLine();  

            switch (vehicleChoice) {
                case 1: 
                    System.out.println("Provide the brand of the Car: ");
                    String carBrand = dw.nextLine();
                    System.out.println("Input the speed of the Car: ");
                    int carSpeed = dw.nextInt();
                    dw.nextLine();  
                    System.out.println("Specify the fuel type of the Car: ");
                    String carFuelType = dw.nextLine();
                    System.out.println("Enter the number of doors on the car: ");
                    int carNumDoors = dw.nextInt();
                    dw.nextLine();  

                    Car car = new Car(carBrand, carSpeed, carFuelType, carNumDoors);
                    System.out.println("\n-- Car Information -- ");
                    car.displayInfo();
                    break;

                case 2:  
                    System.out.println("Provide the brand of the Motorcycle: ");
                    String motorcycleBrand = dw.nextLine();
                    System.out.println("Input the speed of the Motorcycle: ");
                    int motorcycleSpeed = dw.nextInt();
                    dw.nextLine();  
                    System.out.println("Specify the fuel type of the Motorcycle: ");
                    String motorcycleFuelType = dw.nextLine();
                    System.out.println("Does the motorcycle have a sidecar? (Yes/No): ");
                    String sidecarResponse = dw.nextLine();
                    boolean hasSidecar = sidecarResponse.equalsIgnoreCase("Yes");

                    Motorcycle motor = new Motorcycle(motorcycleBrand, motorcycleSpeed, motorcycleFuelType, hasSidecar);
                    System.out.println("\n-- Motorcycle Information --");
                    motor.displayInfo();
                    break;

                case 3:  
                    System.out.println("Exiting the program...");
                    runprogram = false;
                    break;

                default:
                    System.out.println("Invalid! Please select 1 for Car, 2 for Motorcycle, or 3 to exit.");
            }

            System.out.println(); 
        }

        dw.close();
    }
}
