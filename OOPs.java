class Pen{
    String color;
    String type;
    public void write(){
        System.out.println("Writing Something.");
    }
    public void printcolor(){
        System.out.println(this.color);
    }
}
public class OOPs{
    public static void main(String args[]){
        Pen pen1= new Pen();
        pen1.color="blue";
        pen1.type="ball";
        Pen pen2= new Pen();
        pen2.color="black";
        pen1.printcolor();
        pen2.printcolor();
        
    }
    
}
