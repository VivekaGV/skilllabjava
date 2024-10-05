import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your  first number:");
        int a=sc.nextInt();
        System.out.print("Enter your second number:");
        int b=sc.nextInt();
        System.out.print("Enter your third number:");
        int c=sc.nextInt();

        if (a > b && a > c)
           System.out.println(a+" is greater"); 
           
        else if (b > a && b > c)
           System.out.println(b+" is greater");

        else
           System.out.println(c+" is greater");
           
    }
  }


