import java.util.Scanner;
public class Point{
    Point(int x){
        System.out.println("Integer Value:"+x);
    }
    Point(double y){
        System.out.println("Double Value:"+y);
    }       
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");    
        String input = sc.nextLine();
        if(input.contains(".")){
            double d= Double.parseDouble(input);
            new Point(d);
        }else{
            int i= Integer.parseInt(input);
            new Point(i);
        }
    }
}