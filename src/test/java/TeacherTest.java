import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TeacherTest {

    @Test
    public void should_display_teacher_name_and_age() {
        Teacher teacher = new Teacher();
        teacher.setName("Tom");
        teacher.setAge(18);

        Assert.assertEquals("My name is Tom. I am 18 years old. Teaching for the future of world.", teacher.introduce());
    }

    @Test
    public void should_teacher_introduce_itself_with_which_classes_it_teaches() throws Exception {
        List<StudentClass> studentClassList = new ArrayList<>();
        StudentClass studentClass1 = new StudentClass(1);
        StudentClass studentClass2 = new StudentClass(2);
        Teacher teacher = new Teacher();
        teacher.setName("Tom");
        teacher.setAge(21);

        studentClassList.add(studentClass1);
        studentClassList.add(studentClass2);

        Assert.assertEquals("My name is Tom. I am teaching 2 class(es).", teacher.teacherWithClassInfo(studentClassList));
    }

    @Test
    public void should_not_allow_teacher_teaching_more_than_5_classes() throws Exception {
        List<StudentClass> studentClassList = new ArrayList<>();
        StudentClass studentClass1 = new StudentClass(1);
        StudentClass studentClass2 = new StudentClass(2);
        StudentClass studentClass3 = new StudentClass(3);
        StudentClass studentClass4 = new StudentClass(4);
        StudentClass studentClass5 = new StudentClass(5);
        StudentClass studentClass6 = new StudentClass(6);

        Teacher teacher = new Teacher();
        teacher.setName("Tom");
        teacher.setAge(21);

        studentClassList.add(studentClass1);
        studentClassList.add(studentClass2);
        studentClassList.add(studentClass3);
        studentClassList.add(studentClass4);
        studentClassList.add(studentClass5);
        studentClassList.add(studentClass6);

        Assert.assertEquals("Tom should not teach more than 5 classes", teacher.teacherWithClassInfo(studentClassList));
    }
}