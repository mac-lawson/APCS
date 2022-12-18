
/**
 * Calculates grades
 *
 * @author Mac Lawson
 * @version 11/10/22
 */
public class V8Tester
{
    public static void main(String[] args) {
        V8 calc = new V8(0, "Billy");
        V8 calc2 = new V8(0, "John");
        V8 calc3 = new V8(0, "Susan");

        System.out.println("Student \t Grade 1 \t Grade 2 \t Average");
        System.out.println("------------------------------------------------------------");
        System.out.println("Billy \t \t 98 \t \t89 \t\t " + calc.average(98, 89));
        System.out.println("John \t \t 67 \t \t 91 \t\t " + calc2.average(67, 91));
        System.out.println("Susan \t \t 75 \t \t 89 \t\t " + calc3.average(75, 89));

        

    }
}

