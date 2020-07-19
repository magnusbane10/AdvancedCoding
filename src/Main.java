import com.company.Group;
import com.company.Student;
import com.company.Trainer;
import service.GroupService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("start");

        // citim pe X
        // citim date de intrare

        // create group
        Group group1 = new Group();
        group1.setName("group 1");

        // create group
        Group group2 = new Group();
        group2.setName("group 2");

        // create trainer
        Trainer trainer1 = new Trainer();
        trainer1.setCnp(1);
        trainer1.setFirstName("first name trainer 1");
        trainer1.setLastName("last name trainer 1");
        trainer1.setAuthorised(true);

        // create trainer
        Trainer trainer2 = new Trainer();
        trainer2.setCnp(2);
        trainer2.setFirstName("first name trainer 2");
        trainer2.setLastName("last name trainer 2");
        trainer2.setAuthorised(false);

        // link group with trainer
        group1.setTrainer(trainer1);
        group2.setTrainer(trainer2);
        trainer1.setGroup(group1);
        trainer2.setGroup(group2);

        // create student
        Student student1 = new Student();
        student1.setCnp(3);
        student1.setFirstName("first name student1");
        student1.setLastName("ion");
        student1.setHasPreviousJavaExperience(true);

        // create student
        Student student2 = new Student();
        student2.setCnp(4);
        student2.setFirstName("first name student2");
        student2.setLastName("gheorghe");
        student2.setHasPreviousJavaExperience(false);

        // create student
        Student student3 = new Student();
        student3.setCnp(5);
        student3.setFirstName("first name student3");
        student3.setLastName("last name student3");
        student3.setHasPreviousJavaExperience(true);

        // create student
        Student student4 = new Student();
        student4.setCnp(6);
        student4.setFirstName("first name student4");
        student4.setLastName("last name student4");
        student4.setHasPreviousJavaExperience(false);

        // link group with student
        group1.setStudents(new ArrayList<>());
        group1.getStudents().add(student1);
        group1.getStudents().add(student2);
        student1.setGroup(group1);
        student2.setGroup(group1);

        // link group with student
        group2.setStudents(new ArrayList<>());
        group2.getStudents().add(student3);
        group2.getStudents().add(student4);
        student3.setGroup(group2);
        student4.setGroup(group2);

        System.out.println(group1.getStudents());

        // invocam functia cu date de intrare X si obtinem rezultatul Y
        GroupService groupService = new GroupService();
        List<Student> students = groupService.displayStudentNames(group1);

        // afisam rezultatul Y
        System.out.println(students);

        // TODO keep only students that have java knolodges
        List<Student> filterByJavaKnowledge = groupService.filterByJavaKnowledge(group1);
        System.out.println(filterByJavaKnowledge);
        // TODO keep only students that have java knolodges


        System.out.println("stop");
    }
}
