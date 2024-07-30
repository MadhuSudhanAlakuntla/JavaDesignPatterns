package StructuralDesignPatterns.AdapterDesign.example1;

import java.util.ArrayList;
import java.util.List;

//Client use
public class StudentClient {

    public List<Student> getStudentList() {
        List<Student> studentList = new ArrayList<>();
        CollegeStudent collegeStudent = new CollegeStudent("1", "Demo1", "demo1@gmail");
        SchoolStudent schoolStudent = new SchoolStudent("2", "demo2", "demo2@gmail");


        studentList.add(collegeStudent);
        studentList.add( new SchoolStudentAdapter(schoolStudent));
        return studentList;

    }
}


