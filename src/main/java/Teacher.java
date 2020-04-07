import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {
    private ArrayList<String> welcomeMessages = new ArrayList<String>();
    private List<StudentClass> classes;

    @Override
    public String introduce() {
        return String.format("My name is %s. I am %d years old. Teaching for the future of world.", this.getName(), this.getAge());
    }

    public List<String> getWelcomeMessage() {
        return welcomeMessages;
    }

    public void notifyTeacher(Student student, StudentClass studentClass) {
        String welcomeMessage = introduce() + String.format(" Welcome %s join Class %d. ", student.getName(), studentClass.getNumber());
        welcomeMessages.add(welcomeMessage);
    }

    public String teacherWithClassInfo(List<StudentClass> classes) {
        this.classes = classes;
        for(StudentClass studentClass:classes){
            studentClass.setTeacher(this);
        }
        Integer count = 1;
        for(int index = 0; index < classes.size(); index++){
            if(index !=0) {
                count += 1;
            }
        }
        if(count > 5) {
            return String.format("Tom should not teach more than 5 classes");
        }else {
            return String.format("My name is %s. I am teaching %d class(es).", this.getName(), count);
        }
    }

    public String teachingHowManyClass(){
        if (classes == null || classes.size()==0) {
            return super.introduce()+" I am a Teacher. I teach No Class.";
        }
        String c="";
        for(int i=0;i<classes.size();i++){
            if(i!=0){
                c+=", ";
            }
            c+=classes.get(i).getNumber();
        }
        return super.introduce()+" I am a Teacher. I teach Class "+c+".";
    }
}

