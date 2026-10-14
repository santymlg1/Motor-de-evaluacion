Este proyecto es un motor de evaluación construido en Java con una arquitectura multimodular usando Maven. Implementa un diseño basado en plugins que permite evaluar envíos de código aplicando diferentes criterios (como evaluación de sintaxis y estilo) en tiempo de ejecución, utilizando polimorfismo y sin modificar el núcleo de la API principal.



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
