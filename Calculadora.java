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
            case "+": 
        }

    }

}