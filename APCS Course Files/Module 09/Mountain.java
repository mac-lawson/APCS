/**
 * Extends Terrain Class to create mountain terrain.
 *
 * @author Mac Lawson
 * @version 2/27/23
 */
public class Mountain extends Terrain {

    private int mountains;

    /**
     * Constructor for objects of class terrain.
     */
    public Mountain(int l, int w, int mountains) {
        super(l, w);
        this.mountains = mountains;
    }

    /**
     * @return the mountains.
     */
    public int getMountains() {
        return mountains;
    }
}