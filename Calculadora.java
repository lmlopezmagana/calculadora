/**
 * Calculadora muy básica para aprender a manejar las etiquetas de Git
 * y los argumentos del método main
 * @author Luis Miguel López Magaña
 */
public class Calculadora {

    public static void main(String[] args) {
        
        if (args.length < 3) {
            System.out.println("Sintaxis: java Calculadora.java operando1 operador operando2");
            // java Calculadora.java 1 + 2
            return;
        }

        double n1 = Double.parseDouble(args[0]);
        double n2 = Double.parseDouble(args[2]); 
        String op = args[1];

        switch(op) {
            case "+": System.out.println("Resultado: " + (n1 + n2)); break;
            case "-": System.out.println("Resultado: " + (n1 - n2)); break;
            case "*": System.out.println("Resultado: " + (n1 * n2)); break;
            case "/": System.out.println("Resultado: " + (n1 / n2)); break;            
            default: System.err.println("Error en el operador introducido");

        }

    }

}