package lab2;

import java.util.LinkedList;

/**
 * Created by Timothy on 9/3/2014.
 */
public class Main {

    public static void main(String[] args) {
        User john = new User("John Doe", 0.0);
        LinkedList<Course> courses = new LinkedList<Course>();
        courses.add(new IntroJavaCourse("Intro to Java", "123asd", 4, "Intro to Programming"));
        courses.add(new IntroToProgrammingCourse("Intro to Programming", "123456", 3, "None"));
        courses.add(new AdvancedJavaCourse("Advanced Java", "qwerty", 4, "Intro to Java"));

        john.addPreviousEnrolled(courses.get(1));

        for(Course c: courses) {
            if(!john.hasEnrolledPreviously(c)) {
                john.enroll(c);
            }
        }

        for(Course c: john.currentlyEnrolled()) {
            System.out.println(john.getName() + " is currently enrolled in: " + c.getCourseName());
        }




    }
}

