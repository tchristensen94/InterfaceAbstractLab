package lab2;

import java.util.LinkedList;

/**
 * Created by Timothy on 9/3/2014.
 */
public class User {
    private String name;
    private double credits;
    private LinkedList<Course> enrolled = new LinkedList<Course>();
    private LinkedList<Course> previouslyEnrolled = new LinkedList<Course>();


    public User(String name, double credits) {
        this.name = name;
        this.credits = credits;
    }

    public void enroll(Course course) {
        enrolled.add(course);
    }

    public boolean hasEnrolledPreviously(Course course) {
        return previouslyEnrolled.contains(course);
    }
    public LinkedList<Course> currentlyEnrolled() {
        return enrolled;
    }
    public void addPreviousEnrolled(Course course) {
        previouslyEnrolled.add(course);
    }
    public String getName() {
        return name;
    }
}
