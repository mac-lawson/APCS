/**
 * A program to allow students to try out different
 * String methods.
 *
 * Code adapted from work by Laurie White for the College Board.
 *
 * @author Mac Lawson
 * @version 12/9/22
 */
public class StringExplorer
{

    public static void main(String[] args)
    {
        String sample = "The quick brown fox jumped over the lazy dog.";
        System.out.println("sample = " + sample);
        System.out.println();

        //  Demonstrate the indexOf method.
        int position = sample.indexOf("quick");
        System.out.println("sample.indexOf(\"quick\") = " + position);

        int notFoundPos  = sample.indexOf("slow");
        System.out.println("sample.indexOf(\"slow\") = " + notFoundPos);

        position = sample.indexOf("o");
        System.out.println("sample.indexOf(\"o\") = "+ position);
        position = sample.indexOf("o", position + 1);
        System.out.println("sample.indexOf(\"o\", position + 1) = " + position);

        System.out.println();

        //  Demonstrate the toLowerCase method.
        String lowerCase = sample.toLowerCase();
        System.out.println("sample.toLowerCase() = " + lowerCase);
        System.out.println("After toLowerCase(), sample = " + sample);
        System.out.println();

        boolean isEqual = sample.equals(sample.toLowerCase());
        System.out.println("sample.equals(sample.toLowerCase() = "+ isEqual);

        // Assign a new value to sample. Use a phrase of your choosing.
        // Pad the beginning and end of the string literal with spaces.
        sample = "      The cow jumped    ";

        //  Add examples below for the following methods:
        //    trim()
        String trimmed = sample.trim();
        System.out.println("sample.trim() = " + trimmed);
        System.out.println("After trim(), sample = " + trimmed);
        System.out.println();

        //    length()
                int len = sample.length();
                System.out.println("sample.length() = " + len);
                System.out.println();
        //    indexOf with one and two parameters
                int indexof = sample.indexOf("c");
                System.out.println("sample.indexOf('c') = " + indexof);
                System.out.println();
        //    substring() with one and two parameters
                String substr = sample.substring(1);
                System.out.println("sample.substring(1) = " + substr);
                System.out.println();
        //    compareTo()
                int compr = sample.compareTo("The cow jumped");
                System.out.println("sample.compareTo('The cow jumped') = " + compr);
                System.out.println();
        //    any other String methods you'd like to try

    }

}
