/**
 * Student Class
 *
 * @author Mac lawson
 * @version 1/16/23
 */
public class Student {
    private String name;
    private int[] quizScores;
    
    public Student(String name, int[] quizScores) {
        this.name = name;
        this.quizScores = quizScores;
    }
    public int[] getAllQuizScores() {
        return quizScores;
    }
    public int getQuizScore(int quizNumber) {
        return quizScores[quizNumber];
    }
    
    public void setQuizScore(int quizNumber, int newScore) {
        quizScores[quizNumber] = newScore;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: " + name + "\nQuiz Scores: ");
        for (int score : quizScores) {
            sb.append(score + " ");
        }
        return sb.toString();
    }
}
