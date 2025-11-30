package lab2_12;
import java.util.Scanner;
class CourseUserrr {
    String courseId;
    String courseName;
    
    CourseUserrr(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }
    String getCourseInfooo() {
        return courseId + ": " + courseName;
    }
}
class Studenttwelvee {
    String studentName;
    CourseUserrr enrolledCourse;
    Studenttwelvee(String studentName, CourseUserrr enrolledCourse) {
        this.studentName = studentName;
        this.enrolledCourse = enrolledCourse;
    }
    void DisplayEnrollmenttti() {
        System.out.println("Student: " + studentName);
        System.out.println("Enrolled in: " + enrolledCourse.getCourseInfooo());
    }
}
public class lab2_12 {
    public static void main(String[] args) {
        Scanner Scanneronetemp = new Scanner(System.in);
        String courseIddx = Scanneronetemp.nextLine();
        String courseNameee = Scanneronetemp.nextLine();
        String studentNameee = Scanneronetemp.nextLine();
        CourseUserrr course = new CourseUserrr(courseIddx, courseNameee);
        Studenttwelvee student = new Studenttwelvee(studentNameee, course);
        student.DisplayEnrollmenttti();
        Scanneronetemp.close();
    }
}