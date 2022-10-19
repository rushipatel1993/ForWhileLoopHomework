    import java.util.Scanner;

    public class PublicClassPalindromeNumber___1 {

         public static void main(String[] args)       // scanner method add
          {
               Scanner sc = new Scanner(System.in);
               System.out.println("Enter the number: ");
               String reverse = "";
               String num = sc.nextLine();
               int length = num.length();
               for ( int i = length - 1; i >= 0; i-- )              // for loop method
                    reverse = reverse + num.charAt(i);
               if (num.equals(reverse))
                    System.out.println("The entered string " +num +" is a palindrome.");   // print the main output
               else
                    System.out.println("The entered string " +num +"  isn't a palindrome.");
          }
    }















