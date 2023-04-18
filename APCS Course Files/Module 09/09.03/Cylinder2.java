/**
 * Cylinder class that extends circle
 *
 * Mac Lawson
 * 3/2/2023
 */
public class Cylinder2 extends Circle2 {

    // instance variables
    private int height;

    /**
     * Constructor for objects of class cylinder
     */
    public Cylinder2(int x, int y, int rad, int h) {
        super(x, y, rad);
        // initialise instance variables
        height = h;
    }

    public int getHeight() {

        return height;
    }

    public String getName() {
        return "Cylinder";
    }
}
