package practicando;

public class Main {
    public static void main(String[] args) {
        
    String preguntas [] = { 

        "¿Cuándo llegó Colón a América?",
        "¿Cuál es el país más odiado por los españoles?",
        "¿Qué letra pasa de ser una consonante a una vocal con tan solo darle la vuelta?",
        "¿Qué pasó en Londres ayer de 4 a 5 de la tarde?",
        "¿Cuántos cuartos son seis mitades?"
    };

    String respuestas [] = {

        "1492",
        "Francia",
        "n",
        "1 hora",
        "12"
    };

    for (int i = 0; i < preguntas.length; i++) {
        
        System.out.println("Pregunta " + (i + 1) + ": " + preguntas[i]);
        System.out.println("Respuesta: " + respuestas[i]);
        System.out.println("---------------------------");



    }
  }
}

