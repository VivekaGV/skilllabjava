import java.util.ArrayList;
import java.util.HashSet;
public class list {
    public static void main(String[] args) {
        ArrayList<String> fruits=new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Orange");  
        fruits.add("Mango");      
                
        System.out.println("First fruit:"+fruits.get(0));  

        for(String fruit:fruits)
        System.out.println(fruit);
           
        fruits.remove("Mango") ;
        System.out.println("After removing fruit:"+fruits);    

        HashSet<Integer> set =new HashSet<>();
        set.add(2);
        set.add(3);  
        set.add(4);      

        for(int num:set)
        System.out.println(num);
    }
    
}
