
public class Main
{
    public static void main(String[] args) {
        int a = 2;
        int b = 0;
        while (a < 10)
        {
            b = 6;
            while (b > a)
            {
                b--;
            }
            a += b;
        }
        
        System.out.println(b);
    }
}
