public class Student {
    Student(){
        System.out.println("default!!!");
    }
    Student(String Name, int rollNo){
        this.Name=Name;
        this.rollNo=rollNo;
    }
    void display(){
        System.out.println("Name : "+Name);
        System.out.println("Roll No : "+rollNo);
    }
    import java.util.Scanner;
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the name: ");
        String Name=nextLine();
        Syetem.out.println("Enter the roll: ");
        int rollNo=nextInt();
        Student s=new Student(Name,rollNo);
        s.display();
    }
    
}
