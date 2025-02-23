public class SelectionStatementsDemo {
    public static void main(String[] args) {
        int score = 82; // Set score to 82

        // One-way if statement
        if (score >= 60) {
            System.out.println("You passed the exam!");
        }

        // Two-way if-else statement
        if (score >= 90) {
            System.out.println("Excellent!");
        } else {
            System.out.println("Keep improving!");
        }

        // Nested if statement
        String grade;
        if (score >= 90) {
            grade = "A";
        } else {
            if (score >= 80) { // 80-89
                grade = "B";
            } else {
                grade = "C";
            }
        }
        System.out.println("Grade: " + grade);

        // Multi-way if-else statement
        String multiWayGrade;
        if (score >= 90) {
            multiWayGrade = "A";
        } else if (score >= 80) { // 80-89
            multiWayGrade = "B";
        } else if (score >= 70) { // 70-79
            multiWayGrade = "C";
        } else if (score >= 60) { // 60-69
            multiWayGrade = "D";
        } else {
            multiWayGrade = "F";
        }
        System.out.println("Multi-way Grade: " + multiWayGrade);
    }
}
