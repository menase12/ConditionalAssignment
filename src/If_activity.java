import java.util.Scanner;
public class If_activity{
    public static void main(String[]args)
    {
        int num1,num2,sum,prod,avg;
        Scanner keyboard= new Scanner(System.in);
        System.out.print("Please enter your first number");
        num1=keyboard.nextInt();
        System.out.print("Please enter your second number");
        num2=keyboard.nextInt();
        if(num2>3000)
        {
            System.out.print("Wow, you choose a big number." +num2);
        }
          sum=num1+num2;
          prod=num1*num2;
          avg=sum/2;
        System.out.print("The sum of your number "+sum+" the product of your number is " +prod+", and the average of your number is "+avg);

        if (sum>1000)
        {
            System.out.print("~");
         if (sum>=200)
         {
             System.out.print("*");
         }

        }

    }
}