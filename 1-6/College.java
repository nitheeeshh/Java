
package college;
public class College {
    
    static final String collegeName = "XYZ Engineering College";

    final int registrationFee;

    static int totalStudents = 0;

    public College(int registrationFee) {
        this.registrationFee = registrationFee;
        
        totalStudents++; 
    }

    public static void displayCollegeDetails() {
        System.out.println("College Name: " + collegeName);
        System.out.println("Total Students: " + totalStudents);
    }

    public void displayStudentFee() {
        System.out.println("Student Registration Fee: " + registrationFee);
    }

    public static void main(String[] args) {
        College student1 = new College(25000);
        College student2 = new College(30000);

        College.displayCollegeDetails();

        student1.displayStudentFee();
        student2.displayStudentFee();
    }
}