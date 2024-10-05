import java.util.Scanner;

public class vote{
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter your Age:");
        int a=sc.nextInt();

        if (a>=18)
          System.out.println("You are eligible for marrige");
        else
          System.out.println("You are not eligible for marrige");
    }
    
}
