public class instancemethod {
    public void display(String name){
        System.out.println("Name:"+name);
    }
    public static int square (int num){
        return num*num;
            
    }
    public static void main(String[] args) {
        instancemethod obj=new instancemethod();
        obj.display("vivek");
        
        System.out.println("the Square is "+square(7));
        
    }
    
}
