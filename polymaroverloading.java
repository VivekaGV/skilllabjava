 class poly {
    public int add( int d,int e){
        return d+e;
    }
    public int add( int a,int b,int c){
        return a+b+c;
    }
    public double add( double a,double b,double c){
        return a+b+c;
    }
}
public class polymaroverloading{
    public static void main(String[] args) {
    poly obj=new poly();
    System.out.println("The sum of two numbers: "+obj.add(2,3));
    System.out.println("The sum of three numbers: "+obj.add(2,3,7));
    System.out.println("The sum of three double numbers: "+obj.add(10.5,8.6,8.9));
    }
}

