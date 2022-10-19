import java.util.Scanner;

  public class PublicClassNaturalNumber___1 {

      public static void main(String []args)      // scanner method add
      {
          Scanner sc=new Scanner(System.in);
          int num;
          System.out.println("Enter the number");
          num=sc.nextInt();
          int sum=0;
          for(int i=1; i<=num;i++)                      // for loop method
          {
              sum=sum+i;
          }
          System.out.println("The sum of natural numbers is "+sum);       // print the main output

      }
}
