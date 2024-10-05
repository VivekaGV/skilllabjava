abstract class animal{
    public abstract void sound();
    public void sleep(){
        System.out.println("Animal's are sleep");
    }

}
class dog extends animal{
    public void sound(){
        System.out.println("Dog doing bark");
        
    }
} 
class cat extends animal{
    public void sound(){
        System.out.println("cat meow");
    }
} 

public class abs{
    public static void main(String[] args) {
        animal mydog = new dog();
        animal mycat = new cat();

        mydog.sound();
        mycat.sound();

        mydog.sleep();
        mycat.sleep();
    }
}
    
