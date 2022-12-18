/**
 * @author Mac Lawson
 * @date 11/11/22
 * Calculate class
 */
public class calculate {
    /**
     * Constructutor for calculate()
     */
    public calculate(){

    }
    public Double average(Double grade1, Double grade2) {
        return ((grade1 + grade2)/2);
    }

    public Double differance(Double grade1, Double grade2) {
        return Math.abs(grade1 - grade2);
    }
}