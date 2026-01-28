public class Overloading {
    void sum(int a,int b){
        int c = a+b;
        System.out.println("Sum:"+c);
    }
    void product(int x, int y){
        int z = x*y;
        System.out.println("Product:"+z);
    }
    void subtract(int d,int e){
        int f = d-e;
        System.out.println("Difference:"+f);
    }
    void sum(int i,int j,int k){
        int l = i+j+k;
        System.out.println("Sum:"+l);
    }
    
}
class Main{
    public static void main(String args[]){
        Overloading obj=new Overloading();
        obj.sum(10,20,30);
        obj.subtract(90,60);
        obj.product(76,52);
    }
}
