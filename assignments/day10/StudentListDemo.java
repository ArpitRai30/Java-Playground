package day10;

import java.util.*;

class Student {
    int roll; String name, address, phone, email;
    Student(int r,String n,String a,String p,String e){roll=r;name=n;address=a;phone=p;email=e;}
    public String toString(){return roll+":"+name+","+address+","+phone+","+email;}
}

public class StudentListDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"John","Addr1","123","j@x"));
        students.add(new Student(2,"Jane","Addr2","456","j2@x"));
        processStudents(students);
    }
    static void processStudents(List<Student> list) {
        list.forEach(System.out::println);
    }
}
