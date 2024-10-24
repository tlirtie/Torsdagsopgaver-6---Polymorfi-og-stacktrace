package Task3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();

        // Studerende instantieres
        ArrayList<String> studentPassedCourses1 = new ArrayList<>();
        studentPassedCourses1.add("Math 101");
        Student student1 = new Student("Bent", studentPassedCourses1);

        ArrayList<String> studentPassedCourses2 = new ArrayList<>();
        studentPassedCourses2.add("Java 1.0");
        Student student2 = new Student("Bob", studentPassedCourses2);

        persons.add(student1);
        persons.add(student2);

        // Teacher instantieres
        ArrayList<String> teacherCanTeach1 = new ArrayList<>();
        teacherCanTeach1.add("Java 1.0");
        Teacher teacher1 = new Teacher("Tess", teacherCanTeach1);

        ArrayList<String> teacherCanTeach2 = new ArrayList<>();
        Teacher teacher2 = new Teacher("Jesper", teacherCanTeach2);

        persons.add(teacher1);
        persons.add(teacher2);

        // Tilføje kurser
        for (Person person : persons){
            boolean result = person.addCourse("Java 1.0");
            if (!result) {
                if (person instanceof Student){
                    System.out.println(person.getName() + " har allerede bestået dette kursus.");
                } else if (person instanceof Teacher){
                    System.out.println(person.getName() + " kan ikke undervise i dette fag.");
                }
            }
        }
    }
}
