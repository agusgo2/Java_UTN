import java.util.Scanner;
public class Ejercicio_1B {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numeros = new int[3];
        char orden;

        // Solicitar los números
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el número " + (i+1) + ": ");
            numeros[i] = input.nextInt();
        }

        // Solicitar el orden
        do {
            System.out.print("Ingrese 'a' para ordenar de forma ascendente o 'd' para ordenar de forma descendente: ");
            orden = input.next().charAt(0);
        } while (orden != 'a' && orden != 'd');

        input.close();

        // Ordenar los números según el orden especificado
        if (orden == 'a') {
            for (int i = 0; i < numeros.length - 1; i++) {
                for (int j = i + 1; j < numeros.length; j++) {
                    if (numeros[i] > numeros[j]) {
                        int temp = numeros[i];
                        numeros[i] = numeros[j];
                        numeros[j] = temp;
                    }
                }
            }
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
