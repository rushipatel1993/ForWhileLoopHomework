  import java.util.Scanner;

     public class PublicClassReverseNumber___1 {

         public static void main(String args[])        // scanner method add
         {
             int num=0;
             int reversenum=0;
             System.out.println(" Input your number");
             Scanner scanner =new Scanner(System.in);
             num =scanner.nextInt();
             while( num != 0)                  // for loop method

             {
                 reversenum = reversenum * 10;
                 reversenum = reversenum + num%10;
                 num = num/10;
             }
             System.out.println("Reverse of input number is: "+reversenum);     // print the main output

         }
}
