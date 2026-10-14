package utp.edu.pe.plugins.java;

import utp.edu.pe.plugin.api.EvaluationResult;
import utp.edu.pe.plugin.api.Evaluator;

public class StyleEvaluator implements Evaluator {
    @Override
    public EvaluationResult evaluate(String submission) {
        if (submission.contains("\t")) {
            return new EvaluationResult(50.0, "Estilo penalizado por usar tabulaciones.");
        }
        return new EvaluationResult(100.0, "Estilo de código perfecto.");
    }
}