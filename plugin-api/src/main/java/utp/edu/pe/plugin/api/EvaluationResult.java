package utp.edu.pe.plugin.api;

public class EvaluationResult {
    private final double score;
    private final String feedback;

    public EvaluationResult(double score, String feedback) {
        this.score = score;
        this.feedback = feedback;
    }

    public double getScore() { return score; }
    public String getFeedback() { return feedback; }
}