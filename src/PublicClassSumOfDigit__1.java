    import java.util.Scanner;

    public class PublicClassSumOfDigit__1 {
        public static void main(String arg[]) {                // scanner method add
            int n, sum;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number ");
            n = sc.nextInt();
            for (sum = 0; n != 0; n /= 10) {                  // for loop method
                sum += n % 10;
            }
            System.out.println("Sum of digits " + sum);      // print the main output
        }
    }






