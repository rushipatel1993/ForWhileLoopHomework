 import java.util.Scanner;

    public class PublicClassFactorialNumber___1 {

        public static void main(String[]args) {               //  scanner method add
            Scanner scanner = new Scanner(System.in);
            System.out.println(" Enter the number:");
            int num = scanner.nextInt();
            int i = 1, fact = 1;                    // for loop method
            while (i <= num) {
                fact = fact * i;
                i++;
            }
            System.out.println(" Factorial of the number:" + fact);    // print the main output

        }

}
