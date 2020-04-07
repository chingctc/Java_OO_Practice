import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

    @Test
    public void should_display_name_and_age() {
        Person person = new Person();
        String name = "Tom";
        Integer age = 21;

        Assert.assertEquals("My name is Tom. I am 21 years old.", person.introduce(name, age));
    }

}