import java.util.ArrayList;
import java.util.List;

public class StudentClass {
    private int number;
    private List<Student> students;
    private Student leader;
    private Teacher teacher;

    public StudentClass(int number) {
        this.number = number;
        this.students = new ArrayList<Student>();
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Student getLeader() {
        return leader;
    }

    public void setLeader(Student leader) {
        this.leader = leader;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void assignTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public boolean isTeacherOfThisClass(Teacher teacher) {
        return this.teacher == teacher;
    }

    public void appendMember(Student student){
        if(teacher!=null) {
            teacher.notifyTeacher(student, this);
            student.notifyStudent(student, this);
        }
    }

    public boolean contains(Student student) {
        return students.contains(student);
    }

    public void assignLeader(Student student) {
        if(student.getStudentClass() == this.number && getLeader() == null){
            this.leader = student;
        }else{
            leader = new Student();
        }
    }

    public String classLeader(Student student) {
        return String.format("My name is %s. I am %s years old. Teaching for the future of world. %s is the leader of Class %d.",
                teacher.getName(),teacher.getAge(),student.getName(),student.getStudentClass());
    }

    public String tellClassLeaderByOtherStudent(Student student) {
        return String.format("%s is the leader of Class %d.", student.getName(),student.getStudentClass());
    }
}


