public class ConceptosJava {
    public static void main(String[] args) {
        int entero = 50;
        double doble = entero; // Conversion automatica (implicita)
        System.out.println("Conversion implicita de int a double");
        System.out.println("Entero: " + entero + " -> Doble: " + doble);
        System.out.println();

        double numeroDoble = 15.20;
        int numeroEntero = (int) numeroDoble; // Conversion explicita
        System.out.println("Conversion explicita de double a int");
        System.out.println("Doble: " + numeroDoble + " -> Entero: " + numeroEntero);
        System.out.println();

        int x = 123;
        double y = 456.789;

        String cadena1 = Integer.toString(x);
        String cadena2 = Double.toString(y);
        System.out.println("Conversion de numeros a cadenas: ");
        System.out.println("Entero: " + x + " -> Cadena: \"" +  cadena1 + "\"");
        System.out.println("Doble: " + y + " -> Cadena: \"" +  cadena2 + "\"" );
        System.out.println();

        String cadenaEntero = "789";
        String cadenaDouble = "1064.1213";

        try {
            int convertidoEntero = Integer.parseInt(cadenaEntero);
            double convertidoDoble = Double.parseDouble(cadenaDouble);
            System.out.println("Conversion cadenas: ");
            System.out.println("Cadena: \"" + cadenaEntero + "\"" + "-> Entero " + convertidoEntero);
            System.out.println("Cadena: \"" + cadenaDouble + "\"" + " -> Doble " + convertidoDoble);
            System.out.println();
        } catch (NumberFormatException e) {
            System.out.println("Error en la conversion de cadena a numeros... ");
            System.out.println();
        }

        // Operadores matematicos

        int a = 15;
        int b = 4;

        int suma = a + b;
        int resta = a - b;
        int multiplicacion = a * b;
        double division = (double) (a / b);
        int modulo = a % b;
        int incremento = a++;
        int decremento = b--;

        System.out.println("Operadores Matematicos");
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + multiplicacion);
        System.out.println("Division: " + division);
        System.out.println("Modulo: " + modulo);
        System.out.println("Incremento: " + a);
        System.out.println("Decremento: " + b);
        System.out.println();

        //Operaciones Relacionales
        int m = 20;
        int n = 18;

        System.out.println("\nOperadores Relacionales: ");
        System.out.println(m + " == " + n + " : " + (m == n));
        System.out.println(m + " != " + n + " : " + (m != n));
        System.out.println(m + " > " + n + " : " + (m > n));
        System.out.println(m + " < " + n + " : " + (m < n));
        System.out.println(m + " >= " + n + " : " + (m >= n));
        System.out.println(m + " <= " + n + " : " + (m <= n));
        System.out.println();

        //Operadores Logicos
        boolean bool1 = true;
        boolean bool2 = false;

        System.out.println("Operadores Logicos: "); //compuertas logicas
        System.out.println(bool1 + " && " + bool2 + " : " + (bool1 && bool2)); //and
        System.out.println(bool1 + " || " + bool2 + " : " + (bool1 || bool2)); //or
        System.out.println("!" + bool1 + " : " + (!bool1)); //not
        System.out.println("!" + bool2 + " : " + (!bool2)); //not
        System.out.println();

        //Operaciones con Strigns
        String saludo = "Marka";
        String nombre = "Mitxianis";
        String espacio = " ";

        String mensaje = saludo + espacio + nombre;
        System.out.println("\nConcatenacion de cadenas: ");
        System.out.println(mensaje);

        String ejemplo = "   UIP es la worst";
        System.out.println("\n Operaciones con cadenas: ");
        System.out.println("Cadena Original: \"" + ejemplo + "\"");
        System.out.println("Longitud: " + ejemplo.length());
        System.out.println("Mayusculas: " + ejemplo.toUpperCase());
        System.out.println("Minusculas: " + ejemplo.toLowerCase());
        System.out.println("Sin espacios: \"" + ejemplo.trim() + "\"");

        if (ejemplo.length() > 5) {
            System.out.println("Caracter en posicion 5: " +  ejemplo.charAt(5));
        } else {
            System.out.println("La cadena es demasiado corta para obtener caracter.");
        }

        System.out.println("Reemplazar 'worst' por 'PEOR': " + ejemplo.replace("worst", "PEOR"));

        String ca1 = "Calixtra";
        String ca2 = "calixtra";
        System.out.println("Comparacion de cadenas: ");
        System.out.println("\"" + ca1 + "\"igual a" + ca2 + "\" ? : " + ca1.equals(ca2));
        System.out.println("\"" + ca1 + "\"igual a" + ca2 + "\" Ignorando mayuscula? : " + ca1.equalsIgnoreCase(ca2));
    }
}
