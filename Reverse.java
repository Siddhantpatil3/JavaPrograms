import java.lang.*;
import java.util.*;

public class Reverse
{
    public static void main(String[] args)
    {
        int No = 0, i = 0;
        Scanner sc =  new Scanner(System.in);

        System.out.print("\n Enter the Number : ");
        No = sc.nextInt();

        i = 10;
        while(i > 0)
        {
            System.out.println( No + " * " + i + " = " + No * i );
            i--;
        }
    }
}