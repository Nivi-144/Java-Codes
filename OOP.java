class Pen{
    String type;
    String color;
    public void write(){
        System.out.println("Writting");
    }
}
public class OOP {
    public static void main(String args[]){
        Pen pen1 =new Pen();
        pen1.color="Blue";
        pen1.type="Ball";
        pen1.write();
    }
}
