class Car{
    String name;
    int model_num;

    Car(String n,int a){
        name=n;
        model_num= 3;
    }
    void display(){
        System.out.println(name + "" + model_num);
    }
} 
public class Main{
    public static void main(String[] args){
        Car c1= new Car("Audi_S",4);
        c1.display();
    }
    
}
