package service;

import com.company.Group;
import com.company.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GroupService {

    public List<Student> displayStudentNames(Group group) {
        List<Student> students = group.getStudents();
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });
        return students;
    }

    public List<Student> filterByJavaKnowledge(Group group) {
        List<Student> students = group.getStudents();

        // TODO keep only students that have java knolodges
        List<Student> studentsWithJava = new ArrayList<>();
        for(Student student : students){
            if(student.isHasPreviousJavaExperience()){
                studentsWithJava.add(student);
            }
        }
        // TODO keep only students that have java knolodges
        return studentsWithJava;
    }
}

