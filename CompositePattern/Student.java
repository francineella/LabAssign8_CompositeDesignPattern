package CompositePattern;

public class Student implements EducationalUnit {
    private String name;
    private String studentId;
    private double tuitionFee;

    public Student(String name, String studentId, double tuitionFee) {
        this.name = name;
        this.studentId = studentId;
        this.tuitionFee = tuitionFee;
    }

    @Override
    public void displayDetails(String indent) {
        System.out.println(indent + "Student: " + name + ", Subject: " 
        + studentId + ", Tuition Fee: P" + tuitionFee);
    }

    @Override
    public int getStudentCount() {
        return 1;
    }

    @Override
    public double getBudget() {
        return -tuitionFee;
    }


}
