import org.junit.Assert;
import org.junit.Test;

public class TeacherTest {

    @Test
    public void should_display_teacher_name_and_age() {
        Teacher teacher = new Teacher();
        teacher.setName("Tom");
        teacher.setAge(18);

        Assert.assertEquals("My name is Tom. I am 18 years old. Teaching for the future of world.", teacher.introduce());
    }
}