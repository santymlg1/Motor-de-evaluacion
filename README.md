



```mermaid
classDiagram
    direction BT
    
    class Evaluator {
        <<interface>>
        +evaluate(submission: String) EvaluationResult
    }
    
    class EvaluationResult {
        -score: double
        -feedback: String
        +getScore() double
        +getFeedback() String
    }
    
    class SyntaxEvaluator {
        +evaluate(submission: String) EvaluationResult
    }
    
    class StyleEvaluator {
        +evaluate(submission: String) EvaluationResult
    }

    SyntaxEvaluator ..|> Evaluator : implements
    StyleEvaluator ..|> Evaluator : implements
    Evaluator ..> EvaluationResult : uses
