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
}
public class Practice01{
    public static void main(String args[]){
       Student stu1=new Student();
       stu1.name="Nivedita";
       stu1.age=21;
       Student  stu2=new Student();
       stu2.name="Mili";
       stu2.age=20;
       stu1.StudentInfo();
       stu2.StudentInfo();
    }
    
}
