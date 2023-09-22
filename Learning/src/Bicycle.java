public class Bicycle {
    // Include fields for "states".
    private int topSpeed;
    private int rigidity;

    //Metals object
    //Metals metal = new Metals();

    // Include methods for "behaviours".
    void setTopSpeed(int i) {
        topSpeed = i;
    }

    void frame(String f) {
        Metals metal = new Metals();
        rigidity = metal.rigidity(f);
    }

    void printState() {
        System.out.println("Top speed is: " + topSpeed);
        System.out.println("Rigidity: " + rigidity);
    }
}