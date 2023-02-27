import java.util.Scanner;

//to check the number is perfect number or not
public class Assignment1
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int number=sc.nextInt();
        sc.close();
        if(isPerfect(number))
        {
            System.out.println("the number is perfect number");
        }
        else
        {
            System.out.println("the nubmer is not a perfect number");
        }

    }
    public static boolean isPerfect(int number)
    { 
        int sum=0;
        for(int i=1;i<number;i++)
        {
            if(number%i==0)
            {
                sum+=i;
            }
        }
        if(sum==number)
        {
            return true;
        }
        else{
            return false;
        }
    }
}