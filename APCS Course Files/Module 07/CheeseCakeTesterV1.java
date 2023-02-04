/**
 * @Tester class for CheeseCake
 *
 * @author Mac Lawson
 * @version 12/18/22
 *
 */
import java.util.ArrayList;

public class CheeseCakeTesterV1
{
    public static void main(String[] args)
    {
        //initializing and declareing an ArrayList and adding in objects as elements
        ArrayList<CheeseCakeV1> cake = new ArrayList<CheeseCakeV1>();
            // create a CheeseCakeV1 object and add it to the ArrayList
            CheeseCakeV1 cake1 = new CheeseCakeV1("Strawberry", 8);
            cake.add(cake1);
            
            // create another CheeseCakeV1 object and add it to the ArrayList
            CheeseCakeV1 cake2 = new CheeseCakeV1("Chocolate", 12);
            cake.add(cake2);
            
            // create yet another CheeseCakeV1 object and add it to the ArrayList
            CheeseCakeV1 cake3 = new CheeseCakeV1("Blueberry", 6);
            cake.add(cake3);
                        // create a CheeseCakeV1 object and add it to the ArrayList
            CheeseCakeV1 cake4 = new CheeseCakeV1("Watermelon", 3);
            cake.add(cake4);
            
            // create another CheeseCakeV1 object and add it to the ArrayList
            CheeseCakeV1 cake5 = new CheeseCakeV1("Lemonaid", 4);
            cake.add(cake5);
            
            // create yet another CheeseCakeV1 object and add it to the ArrayList
            CheeseCakeV1 cake6 = new CheeseCakeV1("Coconut", 1);
            cake.add(cake6);
            
        //calls several method for each object to perform calculations
        for(CheeseCakeV1 dataRecord : cake)
        {
            dataRecord.calcCreamCheese();
            dataRecord.calcTotalServings();
            dataRecord.calcSugar();
            
            dataRecord.calcVanilla();

        }
        //printing the format of the table
        System.out.println("|       Cheese Cake Data           |             Ingredient Calculations             |");
        System.out.println(" | Index | Quantity |  Flavor       | Cream Cheese | Servings |   Sugar   |  Vanilla  |");
        System.out.println(" |-------|----------|---------------|--------------|----------|-----------|-----------|");

        
        
// using a for loop to print out the objects' data
for (int i = 0; i < cake.size(); i++) {
    
    CheeseCakeV1 dataRecord = cake.get(i);
    System.out.print("     "+(i));
    System.out.println(dataRecord.toString());
}

    }
}
