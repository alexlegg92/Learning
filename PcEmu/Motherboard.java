interface PowerSwitch{
    public void powerOn(int on);
    public void powerOff(int off);
}

public class Motherboard implements PowerSwitch {
    static boolean power;

    @Override
    public void powerOn(int on) {
        if (on == 1) {
            power = true;
        }
    }

    @Override
    public void powerOff(int off) {
        if (off == 0) {
            power = false;
        }
    }
}
