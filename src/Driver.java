public class Driver {

    private String name;
    private String licenseNumber;

    // Constructor
    public Driver(String name, String licenseNumber) {
        this.name = name;
        this.licenseNumber = licenseNumber;
    }

    // Method
    public void displayDriverInfo() {
        System.out.println("Driver Name: " + name);
        System.out.println("License Number: " + licenseNumber);
    }
}
