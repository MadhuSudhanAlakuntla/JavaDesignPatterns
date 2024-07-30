package StructuralDesignPatterns.AdapterDesign.example1;

import java.util.List;

public class AdapterExample {
    public static void main(String[] args) {

        StudentClient studentClient=new StudentClient();
        List<Student> studentList=studentClient.getStudentList();
        System.out.println(studentList);

    }
}
