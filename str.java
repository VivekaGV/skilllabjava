import java.util.Scanner;

public class str {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string:");
        String n=sc.nextLine();
        int len=n.length();
        String rev="";
        for(int i=0;i<len;i++){
            rev=n.charAt(i)+rev;
        }
        System.out.println("The reversre String:"+rev);
}
}

