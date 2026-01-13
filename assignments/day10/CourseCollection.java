package day10;

import java.util.*;

public class CourseCollection {
    public static void main(String[] args) {
        Map<String,String> courses = new LinkedHashMap<>();
        courses.put("CIT","Computing and Information Technology");
        courses.put("CHI","Childcare and Early Education");
        courses.put("MVS","Motor Vehicle Systems");
        courses.put("BTH","Beauty Therapy");
        courses.put("GDE","Graphic Design");

        // a) print list
        courses.forEach((k,v) -> System.out.println(k + " -> " + v));

        // b) get by key
        System.out.println("Get CIT -> " + courses.get("CIT"));
    }
}
