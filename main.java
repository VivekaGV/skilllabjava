class bird {
    void fly() {
        System.out.println("Bird can fly");
    }
}

class Parrot extends bird { 
    void color() {
        System.out.println("I am green in color");
    }
}

class Peacock extends bird { 
    void role() {
        System.out.println("peacock is natinal bird");
    }
    
}
public class main {  
    public static void main(String[] args) {
        Parrot p = new Parrot();  
        Peacock pt = new Peacock();  
        p.fly();
        p.color();
        pt.role();
    }
}

