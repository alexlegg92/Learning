public class Vehicle {
    int wheels;
    double engine;

    public Vehicle(int numOfWheels, double sizeOfEngine) {
        wheels = numOfWheels;
        engine = sizeOfEngine;
    }

    public void printVehicleAttributes() {
        System.out.println("This vehicle has "
                + wheels
                + " wheels"
                + " and an engine size of "
                + engine);
    }
}
