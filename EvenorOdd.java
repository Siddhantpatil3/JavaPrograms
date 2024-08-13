import java.lang.*;
import java.util.*;
public class EvenorOdd
{
    public static void main(String[] args)
    {
        int No =0;
        System.out.print("\n Enter a number:");
        Scanner s =new Scanner (System.in);

        No=s.nextInt();
        if(No % 2 == 0)
        {
            System.out.print("\n Number is Even");
        }
        else{
            System.out.print("\n Number is Odd");
        }
    }
}
