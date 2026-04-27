class car{
    String brand;
    int speed;
    void display(){
        System.out.println("Brand:"+brand+",Speed:"+speed);
    }
}
public class Main{
    public static void main(String [] args){
        car c1=new car();
        c1.brand="Maruti";
        c1.speed=140;
        c1.display();
    }
}