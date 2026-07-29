/**
 * Student Grade Adapter System
 * 
 * Demonstrates the Adapter Design Pattern in Java by converting legacy 
 * numerical marks into standard letter grades (A, B, C, D, F).
 */

// 1. Target Interface: Expected by the new student system
interface GradeSystem {
    String getGrade();
}

// 2. Adaptee: The legacy system providing only total numerical marks
class LegacyMarkSystem {
    private double totalMarks; // Total mark scored (e.g. out of 100)

    public LegacyMarkSystem(double totalMarks) {
        this.totalMarks = totalMarks;
    }

    public double getTotalMarks() {
        return totalMarks;
    }
}

// 3. Adapter: Adapts LegacyMarkSystem to GradeSystem interface
class MarkToGradeAdapter implements GradeSystem {
    private LegacyMarkSystem legacyMarkSystem;

    public MarkToGradeAdapter(LegacyMarkSystem legacyMarkSystem) {
        this.legacyMarkSystem = legacyMarkSystem;
    }

    @Override
    public String getGrade() {
        double marks = legacyMarkSystem.getTotalMarks();
        return convertMarksToGrade(marks);
    }

    // Grade conversion logic
    private String convertMarksToGrade(double marks) {
        if (marks >= 90) return "A";
        if (marks >= 80) return "B";
        if (marks >= 70) return "C";
        if (marks >= 60) return "D";
        return "F";
    }
}

// 4. Main Class / Client Code
public class MarkToGradeAdapterDemo {

    public static void main(String[] args) {
        System.out.println("=============================================");
        System.out.println("  Legacy Mark System -> Grade Adapter Demo   ");
        System.out.println("=============================================\n");

        double[] testMarks = {95.0, 84.5, 72.0, 63.5, 48.0};

        for (double mark : testMarks) {
            // Instantiate legacy system object
            LegacyMarkSystem legacySystem = new LegacyMarkSystem(mark);

            // Wrap legacy object inside the adapter
            GradeSystem gradeSystem = new MarkToGradeAdapter(legacySystem);

            // Access modern interface
            System.out.printf("Total Marks: %5.1f  ==>  Grade: %s%n", 
                              legacySystem.getTotalMarks(), 
                              gradeSystem.getGrade());
        }

        System.out.println("\n=============================================");
    }
}
