import java.util.Scanner;
import java.util.Arrays;
import java.lang.String;
class Student{
    int usn;
    String name;

    void accept(){
        System.out.println("Enter the USN : ");
        Scanner s = new Scanner(System.in);
        usn = s.nextInt();
        s.nextLine();
        System.out.println("Enter the name : ");
        name = s.nextLine();
    }
    void display(){
        System.out.println("USN : "+ usn);
        System.out.println("Name : "+ name);
    }


public static void main(String args[]){
    Student s[] = new Student[3];
    for (int i=0;i<3;i++){
        s[i] = new Student();
        s[i].accept();
    }
    for (int i=0; i<3; i++){
        s[i].display();
    }
    Student s1 = new Student();
    s1.accept();
    s1.display();
    Student s2 = new Student();
    s2.accept();
    s2.display();
    Student s3 = new Student();
    s3.accept();
    s3.display();
}
}