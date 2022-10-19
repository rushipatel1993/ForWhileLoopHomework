import java.util.Scanner;

     public class PublicClassPrimeNumber__1 {

         public static void main(String args []) {         // scanner method add
             int num, b, c;
             Scanner scanner = new Scanner(System.in);
             System.out.println("Enter A number");
             num = scanner.nextInt();
             b = 1;
             c = 0;
             while (b <= num) {
                 if ((num % b) == 0)                   // for loop method
                     c = c + 1;
                 b++;
             }
             if (c == 2)

             System.out.println(num + " is a prime number");     // print the main output

              else
             System.out.println(num + " is not a prime number");

         }

}
