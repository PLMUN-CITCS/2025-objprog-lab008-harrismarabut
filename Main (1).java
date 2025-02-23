public class Main {
    public static void main(String[] args) {
        int score = 85; 
        
        if (score >= 60) {
            System.out.println("You passed the exam!");
        }

       
        if (score >= 90) {
            System.out.println("Excellent!");
        } else {
            System.out.println("Keep improving!");
        }

       
        String grade;
        if (score >= 90) {
            grade = "A";
        } else {
            if (score >= 80) {
                grade = "B";
            } else {
                grade = "C";
            }
        }
        System.out.println("Grade: " + grade);

       
        String multiWayGrade;
        if (score >= 90) {
            multiWayGrade = "A";
        } else if (score >= 80) {
            multiWayGrade = "B";
        } else if (score >= 70) {
            multiWayGrade = "C";
        } else if (score >= 60) {
            multiWayGrade = "D";
        } else {
            multiWayGrade = "F";
        }
        System.out.println("Multi-way Grade: " + multiWayGrade);
    }
}
