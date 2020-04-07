import org.junit.Assert;
import org.junit.Test;

public class StudentTest {

    @Test
    public void should_display_student_name_and_age() {
        Student student = new Student();
        student.setName("Tom");
        student.setAge(18);

        Assert.assertEquals("My name is Tom. I am 18 years old. Coding for the glory of OOCL.", student.introduce());
    }
}