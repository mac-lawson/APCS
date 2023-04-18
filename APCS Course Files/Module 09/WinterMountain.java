/**
 * Extends the Mountain Class to create a Winter Mountain.
 *
 * @author Mac Lawson
 * @version 2/27/23
 */
public class WinterMountain extends Mountain {

    private double temperature;

    /**
     * Constructor for WinterMountain Class.
     */
    public WinterMountain(int l, int w, int mountains, double temperature) {
        super(l, w, mountains);
        this.temperature = temperature;
    }

    /**
     * @return the temperature
     */
    public double getTemperature() {
        return temperature;
    }
}