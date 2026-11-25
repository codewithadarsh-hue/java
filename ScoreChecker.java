
public class ScoreChecker {
    public static void main(String[] args) {

        int[] scores = {95, 84, 66, 45, 90};

        for (int i = 0; i < scores.length; i++) {

            System.out.print("Score: " + scores[i] + " - ");

            if (scores[i] >= 90) {
                System.out.println("Excellent");
            } 
            else if (scores[i] >= 75) {
                System.out.println("Good");
            } 
            else if (scores[i] >= 50) {
                System.out.println("Average");
            } 
            else {
                System.out.println("Fail");
            }
        }
    }
}
