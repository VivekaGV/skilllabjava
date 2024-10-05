
public class Mulcatch {
    public static void main(String[] args) throws Exception {
     try {
        int arr[]=new int[5];
        arr[1]=30/1;
        throw new Exception("Vivek");
 
     } catch (ArithmeticException e) {
        // TODO: handle exception
        System.out.println("ArithmeticException division by zero");
     } catch(ArrayIndexOutOfBoundsException e){
        System.out.println("ArrayIndexOutOfBoundsException array out of range");
     }finally{
        System.out.println("Other Some Exceptions");
    }
}
}



