//write  number table of a integer
public class Assignment2 {
    public static void main(String[] args) {
        printTable(2);
    }
    //to print table of a number
    public static void printTable(int number)
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(number+" * "+i+" = "+number*i);
        }
    }
}
