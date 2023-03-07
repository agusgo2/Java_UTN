public class Ejercicio_1B {

    public static void main(String[] args){

        int num1 = 76;
        int num2 = 14;
        int num3 = 42;

        int[] numeros = {num1, num2, num3};

        for (int i = 0; i < numeros.length - 1; i++){
            for (int j = i + 1; j < numeros.length; j++){
                if (numeros[i] > numeros[j]) {
                    int temp = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = temp;
                }
            }
        }
        System.out.println("ascendeten");
        for (int num : numeros){
            System.out.println(num + " ");
        }
    }
}
