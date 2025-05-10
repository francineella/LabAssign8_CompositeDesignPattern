package CompositePattern;

public class Main {
    public static void main(String[] args) {
        College university = new College("New Era University");

        College cicsCollege = new College("College of Informatics and Computing Studies");
        Department csDept = new Department("Department of Computer Science");
        Department itDept = new Department("Department of Information Technology");

        Teacher t1 = new Teacher("Prof. Garcia", "Introduction to Programming", 90000);
        Teacher t2 = new Teacher("Prof. Joseph", "Data Structure & Algorithm", 85000);
        Student s1 = new Student("Elle", "30-12345-678", 30000);
        Student s2 = new Student("Titus", "31-12345-678", 35000);
        Student s3 = new Student("Charlie", "30-90123-456", 30000);
        
        csDept.addUnit(t1);
        csDept.addUnit(s1);
        csDept.addUnit(s2);

        itDept.addUnit(t2);
        itDept.addUnit(s3);

        cicsCollege.addUnit(csDept);
        cicsCollege.addUnit(itDept);

        university.addUnit(cicsCollege);

        university.displayDetails("");
        System.out.println("\nTotal Students: " + university.getStudentCount());
        System.out.println("Total Budget: P" + university.getBudget());
    }

}
