
/**
 * OvalCylinder class extends Oval.
 * 
 * Mac Lawson
 * 3/2/2023
 */
public class OvalCylinder2 extends Oval2
{
    // instance variables 
    private int height;

    /**
     * Constructor for objects of class ovalCylinder
     */
    public OvalCylinder2(int x, int y, int rad1, int rad2, int h)
    {
        super(x, y, rad1, rad2);
        // initialise instance variables
        height = h;
    }

    
    public int getHeight()
    {
        
        return height;
    }

    public String getName() {
        return "OvalCylinder";
    }
}
