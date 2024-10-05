public class exec {
  public static void main(String[] args) {
    try {
        int a=10/0;// code that cause Exception
        System.out.println("Result:"+a);
       
        
    } catch (ArithmeticException e) {
        System.out.println("Error division by Zero");
        // TODO: handle exception
    }
    finally{
        System.out.println("This is division");
    }
  }
}

