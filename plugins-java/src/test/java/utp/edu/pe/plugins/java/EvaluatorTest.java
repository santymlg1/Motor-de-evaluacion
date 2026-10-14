package utp.edu.pe.plugins.java;

import utp.edu.pe.plugin.api.Evaluator;
import utp.edu.pe.plugin.api.EvaluationResult;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EvaluatorTest {

    @Test
    public void testPolimorfismo() {
        Evaluator evaluadorSintaxis = new SyntaxEvaluator();
        Evaluator evaluadorEstilo = new StyleEvaluator();
        
        String codigoDePrueba = "public class Hola {\n\t int x = 5;\n}";
        
        EvaluationResult resultadoSintaxis = evaluadorSintaxis.evaluate(codigoDePrueba);
        EvaluationResult resultadoEstilo = evaluadorEstilo.evaluate(codigoDePrueba);
        
        assertEquals(100.0, resultadoSintaxis.getScore());
        assertEquals(50.0, resultadoEstilo.getScore());
    }
}