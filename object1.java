class object1 {
    private String ModelName;
    private String owner;
    private int regNumber;
     
     public object1 (String ModelName,String owner,int regNumber){
         this.ModelName=ModelName;
         this.owner=owner;
         this.regNumber=regNumber;
     }
         public void startcar(){
               System.out.println("Car can be start by key..");
         }
         public void accelerate(){
             System.out.println("Car will be accelerate.. ");
         }
         public void stop(){
              System.out.println("Car will be stop..");
         }
         public void showcarinfo(){
             System.out.println("The car is owned by "+ owner);
             System.out.println("The car model is "+ ModelName);
             System.out.println("The regnumber is " + regNumber);
         }
         public static void main(String[] args) {
             object1 mycar= new object1("Swift","vivek",2577);
             mycar.startcar();
             mycar.accelerate();
             mycar.stop();
             mycar.showcarinfo();
         }
 }
