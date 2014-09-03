package lab2;

/**
 * Created by Timothy on 9/3/2014.
 */
public interface Course {

    public abstract String getCourseName();
    public abstract void setCourseName(String courseName);
    public abstract String getCourseNumber();
    public abstract void setCourseNumber(String courseNumber);
    public abstract double getCredits();
    public abstract String getPrerequisites();
    public abstract void setPrerequisites(String prerequisites);
}
