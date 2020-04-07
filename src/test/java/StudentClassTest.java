import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class StudentClassTest {
    @Test
    public void should_display_student_info_with_class() {
        Student student = new Student();
        student.setName("Tom");
        student.setAge(18);
        student.setStudentClass(2);

        Assert.assertEquals("My name is Tom. I am 18 years old. I am a student of class 2. Coding for the glory of OOCL.", student.introduce());
    }

    @Test
    public void should_class_assign_a_member_student_as_leader() throws Exception {
        StudentClass studentClass = new StudentClass(2);
        Teacher teacher = new Teacher();
        teacher.setName("Woody");
        teacher.setAge(30);
        studentClass.assignTeacher(teacher);

        Student tom = new Student();
        tom.setName("Tom");
        tom.setAge(18);
        tom.setStudentClass(2);
        studentClass.appendMember(tom);
        studentClass.assignLeader(tom);
        Assert.assertEquals("My name is Woody. I am 30 years old. Teaching for the future of world. Tom is the leader of Class 2.", studentClass.classLeader(tom));
    }

    @Test
    public void should_notify_teacher_when_student_join_class() {
        StudentClass studentClass = new StudentClass(2);
        Teacher teacher = new Teacher();
        teacher.setName("Woody");
        teacher.setAge(30);
        studentClass.assignTeacher(teacher);

        Student tom = new Student();
        tom.setName("Tom");
        tom.setAge(18);
        tom.setStudentClass(2);
        studentClass.appendMember(tom);

        Student jim = new Student();
        jim.setName("Jim");
        jim.setAge(18);
        jim.setStudentClass(2);
        studentClass.appendMember(jim);

        Assert.assertEquals("My name is Woody. I am 30 years old. Teaching for the future of world. Welcome Tom join Class 2. " +
                "My name is Woody. I am 30 years old. Teaching for the future of world. Welcome Jim join Class 2.",
                teacher.getWelcomeMessage().toString().replace("[","").replace("]","").replace(" ,", "").trim());
    }

    @Test
    public void should_notify_other_students_when_new_student_join() {
        StudentClass studentClass = new StudentClass(2);
        Teacher teacher = new Teacher();
        teacher.setName("Woody");
        teacher.setAge(30);
        studentClass.assignTeacher(teacher);

        Student tom = new Student();
        tom.setName("Tom");
        tom.setAge(18);
        tom.setStudentClass(2);

        Student jim = new Student();
        jim.setName("Jim");
        jim.setAge(18);
        jim.setStudentClass(2);
        studentClass.appendMember(jim);

        Assert.assertEquals("My name is Tom. I am 18 years old. I am a student of class 2. Coding for the glory of OOCL. Welcome Jim join Class 2.",
                tom.introduce() +
                jim.getWelcomeMessages().toString().replace("[","").replace("]","").replace(" ,", "").trim());
    }

    @Test
    public void should_tell_leader_of_class() {
        StudentClass studentClass = new StudentClass(2);

        Student tom = new Student();
        tom.setName("Tom");
        tom.setAge(18);
        tom.setStudentClass(2);

        Student jim = new Student();
        jim.setName("Jim");
        jim.setAge(18);
        jim.setStudentClass(2);
        studentClass.appendMember(jim);
        studentClass.assignLeader(jim);

        Assert.assertEquals("My name is Tom. I am 18 years old. I am a student of class 2. Coding for the glory of OOCL. Jim is the leader of Class 2.",
                tom.introduce() + studentClass.tellClassLeaderByOtherStudent(jim));
    }


}