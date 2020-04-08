import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private Integer studentClass;
    private ArrayList<String> welcomeMessages = new ArrayList<String>();

    public Integer getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(Integer studentClass) {
        this.studentClass = studentClass;
    }

    @Override
    public String introduce() {
        return String.format("My name is %s. I am %d years old. I am a student of class %d. Coding for the glory of OOCL. ", this.getName(), this.getAge(), this.studentClass);
    }

    public List<String> getWelcomeMessages() {
        return this.welcomeMessages;
    }

    public void notifyStudent(Student student, StudentClass studentClass) {
        String welcomeMessage = String.format(" Welcome %s join Class %d. ", student.getName(), studentClass.getNumber());
        welcomeMessages.add(welcomeMessage);
    }
}
