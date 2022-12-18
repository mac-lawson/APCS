
/**
 * Calculates grades
 *
 * @author Mac Lawson
 * @version 11/10/22
 */
public class V8
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class V8
     */
    public V8(Integer x, String y)
    {
        
        x = 0;
        
    }
    
    public static double average(Integer gradeOne, Integer gradeTwo) {
        
        return Math.abs((Double.valueOf(gradeOne)+(Double.valueOf(gradeTwo)))/ 2);
        
    }
}  

