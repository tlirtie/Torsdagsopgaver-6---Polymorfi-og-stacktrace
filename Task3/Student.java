package Task3;



import java.util.*;

public class Student extends Person {
    private ArrayList<String> passedCourses;
    private ArrayList<String> currentCourses;

    public Student(String name, ArrayList<String> passedCourses){
        super(name);
        this.passedCourses = passedCourses;
        this.currentCourses = new ArrayList<>();
    }

    @Override
    public boolean addCourse(String course){
        if (!passedCourses.contains(course)){
            currentCourses.add(course);
            return true;
        }
        return false;
    }
}
