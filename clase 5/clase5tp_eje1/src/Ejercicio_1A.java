public class Ejercicio_1A {
    public static void main(String[] args) {

        int[] numeros = {1, 32, -2};
        char orden = 'd';
        //numeros y caracter

        if (orden == 'a') {//segun que caracter ascendente o descendente
            for (int i = 0; i < numeros.length - 1; i++) {
                for (int j = i + 1; j < numeros.length; j++) {
                    if (numeros[i] > numeros[j]) {
                        int temp = numeros[i];
                        numeros[i] = numeros[j];
                        numeros[j] = temp;
                    }
                }
            }
            //este for es el conocido algoritmo "Bubble Sort"
            System.out.println("Los numeros ordenados ascendentemente son: ");
            for (int num : numeros) {
                System.out.print(num + " ");
            }
        } else if (orden == 'd') {
            for (int i = 0; i < numeros.length - 1; i++) {
                for (int j = i + 1; j < numeros.length; j++) {
                    if (numeros[i] < numeros[j]) {
                        int temp = numeros[i];
                        numeros[i] = numeros[j];
                        numeros[j] = temp;
                    }
                }
            }
            System.out.println("Los numeros ordenados descendentemente son: ");
            for (int num : numeros) {
                System.out.print(num + " ");
            }
        }
    }
}
