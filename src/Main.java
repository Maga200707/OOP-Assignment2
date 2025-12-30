public class Main {

    public static void main(String[] args) {

        // 1. Create Driver objects
        Driver driver1 = new Driver("Magzhan Bakytzhan", "ASD1399");
        Driver driver2 = new Driver("Alisa Smirnova", "ABL228");

        // 2. Create Vehicle objects
        Vehicle car = new Car("Lexus", 2022, 4, "Gasoline", driver1);
        Vehicle motorcycle = new Motorcycle("Yamaha", 2021, false, driver2);
        Vehicle truck = new Truck("Ford", 2020, 15000.0, 4, driver1);

        // 3. Store vehicles in an array
        Vehicle[] vehicles = { car, motorcycle, truck };

        // 4. Loop through vehicles and call required methods
        for (Vehicle vehicle : vehicles) {
            vehicle.startEngine();
            vehicle.displayInfo();
            vehicle.stopEngine();
            System.out.println("---------------------------");
        }
    }
}
