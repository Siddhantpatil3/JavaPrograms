
import java.util.*;

public class Day_of_Week
{
    public static void main(String[] args)
    {
        int Day=0;
        Scanner S = new Scanner(System.in);

        System.out.print("\nEnter Day Number(1-7):");
        Day = S.nextInt();

        if (Day<=0 || Day>=8)
        {
            System.out.print("\n Invalid Day Number.");
        }
        else if (Day == 1)
        {
            System.out.println("\n Monday");
        }
        else if (Day == 2)
        {
            System.out.println("\n Tuesday");
        }
        else if (Day == 3)
        {
            System.out.println("\n Wednesday");
        }
        else if (Day == 4)
        {
            System.out.println("\n Thursday");
        }
        else if (Day == 5)
        {
            System.out.println("\n Friday");
        }
        else if (Day == 6)
        {
            System.out.println("\n saturday");
        }
        else if (Day == 7)
        {
            System.out.println("\n Sunday");
        }
        
    }
}       