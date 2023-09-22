public class Bike {
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
        //System.out.println(carrera.metal.rigidity("Carbon"));
    }
}