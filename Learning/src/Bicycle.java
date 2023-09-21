public class Bicycle {
    // Include fields for "states".
    private int topSpeed;
    private int rigidity;

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

    public static void main(String[] args) {
        // Two different bicycle objects
        Bicycle cervelo = new Bicycle();
        Bicycle carrera = new Bicycle();

        cervelo.setTopSpeed(10);
        cervelo.frame("Carbon");
        cervelo.printState();

        carrera.setTopSpeed(2);
        carrera.frame("Aluminium");
        carrera.printState();

        carrera.setTopSpeed(4);
        carrera.frame("Carbon");
        carrera.printState();

        // The Bicycle object can contain the Metals object ...
        // However, referencing the rigidity of Metals through the Frame method of the Bicycle object
        // improves readability, and in this case is more appropriate.
        //System.out.println(carrera.metal.rigidity("Carbon"));
    }
}