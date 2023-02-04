/**
 * AP Computer Science
 * 11/1/22
 * @author Mac Lawson
 *
 * This class tests the V8 class by constructing multiple V8 objects and
 * invoking their methods.
 */
public class V8Tester {
    public static void main(String[] args) {
        V8 calc1 = new V8(98, 89);
        V8 calc2 = new V8(67, 91);
        V8 calc3 = new V8(75, 89);

        System.out.println("Student \t Grade 1 \t Grade 2 \t Average");
        System.out.println("------------------------------------------------------------");
        System.out.println("Billy \t \t 98 \t \t 89 \t\t " + calc1.average(98, 89));
        System.out.println("John \t \t 67 \t \t 91 \t\t " + calc2.average(67, 91));
        System.out.println("Susan \t \t 75 \t \t 89 \t\t " + calc3.average(75, 89));
    }
}
