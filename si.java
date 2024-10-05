import java.util.Scanner;
public class si {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your principle Amount:");
        int p=sc.nextInt();
        System.out.print("Enter your interset:");
        int r=sc.nextInt();
        System.out.print("Enter duration in months:");
        int t=sc.nextInt();
        float si=(p*t*r)/100;
        System.out.println("Simple Interset:"+si);   
}
}