package utp.edu.pe.plugins.java;

import utp.edu.pe.plugin.api.EvaluationResult;
import utp.edu.pe.plugin.api.Evaluator;

public class SyntaxEvaluator implements Evaluator {
    @Override
    public EvaluationResult evaluate(String submission) {
        if (submission.contains(";")) {
            return new EvaluationResult(100.0, "Sintaxis básica correcta.");
        }
        return new EvaluationResult(0.0, "Falta punto y coma.");
    }
}