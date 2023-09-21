public class Metals {
    private final int CARBON_RIGIDITY = 70;
    private final int ALUMINIUM_RIGIDITY = 30;

    public int rigidity(String m) {
        if (m.equals("Carbon")) {
            return CARBON_RIGIDITY;
        } else if (m.equals("Aluminium")) {
            return ALUMINIUM_RIGIDITY;
        } else {
            return 0;
        }
    }
}