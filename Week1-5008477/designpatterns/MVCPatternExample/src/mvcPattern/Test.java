package mvcPattern;

public class Test {
    public static void main(String[] args) {
        // Create a new student record
        Student student = new Student("1", "John Doe", "A");

        // Create a view to show student details
        StudentView view = new StudentView();

        // Create a controller to manage the student data
        StudentController controller = new StudentController(student, view);

        // Display the initial student details
        controller.updateView();

        // Update the student details
        controller.setStudentName("Jane Doe");
        controller.setStudentGrade("B");

        // Display the updated student details
        controller.updateView();
    }
}
