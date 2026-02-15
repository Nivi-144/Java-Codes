import java.util.Scanner;
public class SumofArray {
    public static void main(String[] args){
        
        Scanner sc= new Scanner(System.in);
        int[]arr= new int[5];
        int sum =0;
        System.out.println("Enter 5 values:");
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }

        System.out.println("Sum of 5 numbers="+sum);

        sc.close();
    }    
}
