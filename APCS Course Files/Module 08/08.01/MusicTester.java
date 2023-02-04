
/**
 * Tester class for Music.javas
 *
 * @author Mac Lawson
 * @version 1/26/23
 */
public class MusicTester
{
    // search the title
   public static void searchTitle(Music[] array, String value) {
        for(int i =0; i < array.length; i++) {
            if((array[i].getTitle()).contains(value)) {
                System.out.println(array[i]);
            }
            else {
                continue;
            }
        }
   }

    // search the year
    public static void searchYear(Music[] array, Integer year) {
        for(int i =0; i < array.length; i++) {
            if((array[i].getYear()) == (year)) {
                System.out.println(array[i]);
            }
            else {
                continue;
            }
        }
   }
    // search the artist
   public static void searchArtist(Music[] array, String value) {
        for(int i =0; i < array.length; i++) {
            if((array[i].getArtist()).contains(value)) {
                System.out.println(array[i]);
            }
            else {
                continue;
            }
        }
   }
    // print the entire array
    public static void printArray(Music[] array) {
        for(int i =0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public static void main (String[] args) {
    Music[] myMusic = new Music[10];
    myMusic[0] = new Music("Pieces of You",1994, "Jewel");
    myMusic[1] = new Music("Jagged Little Pill",1995,"Alanis Morissette");
    myMusic[2] = new Music("What If It's You", 1995,"Reba McEntired");
    myMusic[3] = new Music("Misunderstood",2001,"Pink");
    myMusic[4] = new Music("Laundry Service",2001,"Shakira");
    myMusic[5] = new Music("Taking the Long Way",2006,"Dixie Chicks");
    myMusic[6] = new Music("Under My Skin",2004,"Avril Lavigne");
    myMusic[7] = new Music("Let Go",2002,"Avril Lavigne");
    myMusic[8] = new Music("Let It Go",2007,"Tim McGraw");
    myMusic[9] = new Music("White Flag",2004,"Dido"); 
        System.out.println("Printing entire array...\n");
        printArray(myMusic);
        System.out.println("\n");
        System.out.println("Printing music the title `Let Go`...\n");
        searchTitle(myMusic, "Let Go");
        System.out.println("\n");
        System.out.println("Printing music from the year 1994...\n");
        searchYear(myMusic, 1994);
        System.out.println("\n");
        System.out.println("Printing music from the artist Avril Lavigne...\n");
        searchArtist(myMusic, "Avril Lavigne");

    }
}
