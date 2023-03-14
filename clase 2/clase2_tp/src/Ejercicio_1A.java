public class Ejercicio_1A {

    public static void main(String[] args) {
        int contador = 0;
        String cadena = "Java es un lenguaje de programacion";
        //cadena de caracteres a sensar
        char letra = 'a';
        //letra la cual queremos contar su cantidad de apariciones

        for (int i = 0; i < cadena.length(); i++){
                if (cadena.charAt(i) == letra){
                    //cuando la letra coincide contador suma 1
                    contador++;
                }
        }
        System.out.println("la cantidad de letras " + letra + " que tiene la cadena: " + cadena + " es igual a: " + contador);
    }
}
