import java.util.Scanner;

public class door {
    public static void main(String[] args) {
        int a =123;
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter your code:");
        int code=sc.nextInt();

        if (code == a)
          System.out.println("Door is Opened");
        else
          System.out.println("Door is closed");
    }
    
}
