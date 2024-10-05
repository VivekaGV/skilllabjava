import java.util.Scanner;
public class mul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your first Number:");
        float a=sc.nextFloat();

        System.out.print("Enter your second Number:");
        float b=sc.nextFloat();

        double sum=a*b;
        System.out.println(sum);   
}    
}
