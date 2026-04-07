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
class Student{
    String name;
    int age;
    public void StudentInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(String name , int age){
        this.name=name;
        this.age=age;
    }
}
public class Practice02{
    public static void main(String args[]){
       Student stu1=new Student("Nivi",19);
       stu1.StudentInfo();
     
    }
    
}
