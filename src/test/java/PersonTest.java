import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

    @Test
    public void should_display_name_and_age() {
        Person person = new Person();
        person.setName("Tom");
        person.setAge(21);

        Assert.assertEquals("My name is Tom. I am 21 years old.", person.introduce());
    }

}