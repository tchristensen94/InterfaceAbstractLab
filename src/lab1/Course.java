package lab1;

import javax.swing.*;

/**
 * Created by Timothy on 9/2/2014.
 */
public abstract class Course {
    private String courseName;
    private String courseNumber;
    private double credits;
    private String prereqs;

    public Course(String courseName, String courseNumber, double credits, String prereqs) {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
        this.credits = credits;
        this.prereqs = prereqs;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public double getCredits() {
        return credits;
    }

    public void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null, "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }

        this.credits = credits;
    }

    public String getPrereqs() {
        return prereqs;
    }

    public void setPrereqs(String prereqs) {
        if(prereqs == null || prereqs.length() == 0) {
            JOptionPane.showMessageDialog(null,"Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
        this.prereqs = prereqs;
    }
}
