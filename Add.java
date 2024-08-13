import java.lang.*;
import java.util.*;

public class Add
{
    public static void main(String[]args)
    {
        int N1 = 0,N2 = 0, Sum = 0;
        Scanner s = new Scanner(System.in);

        System.out.print("\n Enter 1st number : ");
        N1 = s.nextInt();        
        System.out.print("\n Enter 2nd number : ");
        N2 = s.nextInt();        

        Sum = N1 + N2;

        System.out.println("\n Addition of " + N1 + " & " + N2 + " is = " + Sum + ".");

        System.out.print("\n Thanks.");
    }

}
