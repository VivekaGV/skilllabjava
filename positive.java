import java.util.Scanner;

public class positive{
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter your Number:");
        int a=sc.nextInt();

        if (a>0)
          System.out.println("Number is positive");
        else
          System.out.println("Number is Negative");
    }
    
}

