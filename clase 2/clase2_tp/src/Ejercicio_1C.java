public class Ejercicio_1C {

    public static void main(String[] args){

        int[] numeros = {5, 10, 15, 20, 25};
        int x = 12;
        int suma = 0;

        for (int num : numeros){
            if (num > x) {
                suma += num;
            }
        }

        System.out.println("La suma de los numeros mayores a " + x + " es: " + suma);
    }
}
