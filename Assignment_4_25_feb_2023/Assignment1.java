package Assignment_4_25_feb_2023;
import java.util.Scanner;
//program to count the number of digit in a number
 public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int number=sc.nextInt();
        sc.close();
        System.out.println("Number of digits:"+countDigits(number));
    }
    //to count number digits in a number
    public static int countDigits(int number)
    {
        int count=0;
        while(number>0)
        {
            number=number/10;
            count++;
        }
        return count;
    }
}
