package service;

import model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService {
    public static void main(String... args){

    }

    public void addStudent(){
        Student student =new Student();
        List<Student> studentList = new ArrayList<student>();
        student.setStudentId("002");
        student.setName("Name");
        student.setCourse("BCA");
        student.setStartDate("05/08/2023");
        student.setEndDate("08/01/2026");
        studentList.add(student)


    }

    public List<Student> getStudents(){

        return new ArrayList<Student>();

    }
}
