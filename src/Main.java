//Skapa en metod som returnerar om ett tal är jämnt eller inte.
import java.util.Scanner;
public class ReturnIfValueEvenOrNot
{
    public boolean CompareNum()
    {
        boolean even = true;
        boolean odd = false;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ange heltal här: ");
        int TalJamnt = scanner.nextInt();
        if(TalJamnt % 2 == 0)
            return even;
        else
            return odd;
    }

    public static void main(String ar[])
    {
        ReturnIfValueEvenOrNot obj = new ReturnIfValueEvenOrNot();
        boolean result = obj.CompareNum();
        System.out.println("Talet är jämnt: " + result);
    }
}
