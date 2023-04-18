import java.util.ArrayList;
/**
 *  test
 * 
 * Mac Lawson
 * 3/2/2023
 */
public class Test
{
    

    //main method
    public static void main(String[] args)
    {
        //list of objects
        ArrayList<Circle2> list = new ArrayList();
        list.add(new Circle2(2, 4, 6));
        list.add(new Cylinder2(10, 15, 20, 25));
        list.add(new Oval2(25, 10, 5, 10));
        list.add(new OvalCylinder2(40, 10, 10, 10, 10));
        
        //loop over list and print out centers
        for(Circle2 object : list)
        {
            showCenter(object);
        }
        
    }
    
    //show center
    public static void showCenter(Circle2 object)
    {
        String output = "For " + object.toString() + " " + object.center() + "\n";
        System.out.println(output);
    }


}
