import java.util.Scanner;

public class UnsetIthBit {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number");
        int number=scanner.nextInt();
        System.out.println("enter index");
        int index=scanner.nextInt();
        System.out.println(findSingleNumber(number,index));
    }
    public static int findSingleNumber(int number,int index)
    {
        if((number & (1<<index)) ==0)
        {
            return number;
        }
        else
        {
            return number^(1<<index);
        }
    }
}
