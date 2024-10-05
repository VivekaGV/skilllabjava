public class car {
    String brand;
    int year;
    public car(String brand,int year){
        this.brand=brand;
        this.year=year;
    }
    public void dispaly(){
        System.out.println("Brand is "+brand);
        System.out.println("Model is "+year);
    }
    public static void main(String[] args) {
        car obj=new car("Swift", 2009);
        obj.dispaly();
    }
}
