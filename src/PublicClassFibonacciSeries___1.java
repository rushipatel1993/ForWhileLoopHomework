import java.util.Scanner;

public class PublicClassFibonacciSeries___1 {

    public static void main(String args[]) {    // scanner method add

        int n, first=0,next=1;

        System.out.println("Enter how many fibonacci numbers to print  ");
        Scanner scanner =new Scanner(System.in);
        n=scanner.nextInt();
        System.out.println(" First" + n + " Fibonacci numbers are:" );
        System.out.println(first + " " + next );
        for (int i =1 ; i<=n-2; ++i  )            // for loop method
        {
            int sum = first + next;
            first = next;
            next = sum;
            System.out.print("" + sum );             //  print the main output
        }


    }


}