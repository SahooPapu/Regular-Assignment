//to check a number is palidrome or not
package Assignment_4_25_feb_2023;

import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int number=sc.nextInt();
        sc.close();
        if(isPalidrome(number))
         {
            System.out.println("number is palidrome");
         }
         else
         {
            System.out.println("Not a palidrome");
         }
    }
    //to check it is palidrome or not
    public static boolean isPalidrome(int number)
    {
        int sum=0,temp=number;
        while(number>0)
        {
            sum=sum*10+(number%10);
            number=number/10;
        }
        if(temp==sum)
        {
            return true;
        }
        else{
            return false;
        }
    }
}
