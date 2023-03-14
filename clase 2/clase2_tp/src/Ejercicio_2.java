public class Ejercicio_2 {

    public static void main(String[] args){

        String mensaje = "ahola que tal";
        String abecedario = "abcdefghijklmnopqrstuvwxyz";
        int desplazamiento = 2;
        String mensajeCifrado = "";

        for (int i = 0; i < mensaje.length(); i++){
            char letraActual = mensaje.charAt(i);
            int indice = abecedario.indexOf(letraActual);

            if (indice == -1){
                mensajeCifrado +=letraActual;
            } else {
                int indiceCifrado = (indice + desplazamiento) % abecedario.length();
                char letraCifrada = abecedario.charAt(indiceCifrado);
                mensajeCifrado += letraCifrada;
            }
        }
        System.out.println("mensaje original: " + mensaje);
        System.out.println("mensaje cifrado: " + mensajeCifrado);
    }
}
