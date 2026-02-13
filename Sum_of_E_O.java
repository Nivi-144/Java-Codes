import java.util.Scanner;
public class Sum_of_E_O {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n,m;
        int eSum=0;
        int oSum=0;
        System.out.println("Enter the number of digits:");
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println("Enter number"+i+":");
            n=sc.nextInt();
            if (num % 2==0){
                eSum+=num;
            }else{
                oddSum+=num;
            }
        }
    System.out.println("Sum of Even="+eSum);
    System.out.println("Sum of Odd="+oSum);
    sc.close();
    }

    
}
