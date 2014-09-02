package lab1;

/**
 * Created by Timothy on 9/2/2014.
 */
public abstract class Course {
    private String title;
    private String courseNumber;
    private double credits;
    private String prereqs;

    public Course(String title, String courseNumber, double credits, String prereqs) {
        this.title = title;
        this.courseNumber = courseNumber;
        this.credits = credits;
        this.prereqs = prereqs;
    }
}
