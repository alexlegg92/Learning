/** I learnt that the fields of a class represent the object's state, and the methods define its interaction with the outside world.
 *  So objects define their interaction with the outside world through the methods they expose.
 *  <p>
 *  Methods FORM the object's INTERFACE with the outside world.
 *  An interface is a GROUP of RELATED methods without bodies. */

// A car could inherit the behaviours/states or methods/fields, or object; of a vehicle using "extend".
// I could have an interface of volume control (a group of related methods).

interface VolumeControl {
    void volumeUp(int u);
    void volumeDown(int d);
}

public class Car extends Vehicle implements VolumeControl {
    boolean isComfort;
    int volume;

    @Override
    public void volumeUp(int u) {
        volume += u;
    }

    @Override
    public void volumeDown(int d) {
        volume -= d;
    }

    void printCarAttributes() {
        System.out.println("Is this car comfortable, "
                + isComfort
                + ". Current volume is "
                + volume);
    }

    Car(int numOfWheels, double sizeOfEngine, boolean comfort) {
        super(numOfWheels, sizeOfEngine);
        isComfort = comfort;
    }

    public static void main(String[] args) {
        Car astonMartin = new Car(4, 3.5, true);
        astonMartin.volumeUp(10);
        System.out.println("Aston Martin attributes: ");
        astonMartin.printVehicleAttributes();
        astonMartin.printCarAttributes();

        Car oldJeep = new Car(5, 3, false);
        oldJeep.volumeDown(5);
        System.out.println("Jeep attributes: ");
        oldJeep.printVehicleAttributes();
        oldJeep.printCarAttributes();
    }
}