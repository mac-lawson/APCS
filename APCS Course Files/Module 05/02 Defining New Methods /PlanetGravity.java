
/**
 * Mac Lawson
 * AP Computer Science
 * 10/12/22
 * A program to calculate planetary information
 */
public class PlanetGravity {
        static double UGC_c = (6.67 * Math.pow(10, -11));
        public static void main(String[] args) {
            title();
            finalDisp("Neptune", "49,532", "1.0247e26", String.valueOf(UGC(UGC_c, 1.0247, radius(49532))));
                        
        } 
        // Creates the output field
        public static void title() {

            System.out.println("\t\tPlanetary Data");

            System.out.println("Planet \t\t Diameter (km) \t\t Mass (kg) \t\t g (m/s^2)");
            
            System.out.println("----------------------------------------------------------------------------------------------");

            

        }
        // Outputs final data
        public static void finalDisp(String n, String d, String m, String g) {
            System.out.println(n + "\t\t\t" + d + "\t\t\t" + m + "\t\t" + g);
        }

        //Outputs radius
        public static double radius(Integer x) {

            return ((.5 * (x)) * 1000);

        }

        public static double UGC(double G, double M, double r){
            return (((G * M))/(Math.pow(r, 2)));
            
            
        }


}
