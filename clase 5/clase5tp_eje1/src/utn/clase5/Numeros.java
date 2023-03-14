package utn.clase5;

public class   Numeros {

    public static int[] ascendentemente(int[] valores){

        for (int i = 0; i < valores.length - 1; i++) {
            for (int j = i + 1; j < valores.length; j++) {
                if (valores[i] > valores[j]) {
                    int temp = valores[i];
                    valores[i] = valores[j];
                    valores[j] = temp;
                }
            }
        }
        return valores;
    }
    public static int[] descendentemente(int[] valores){

        for (int i = 0; i < valores.length - 1; i++) {
            for (int j = i + 1; j < valores.length; j++) {
                if (valores[i] < valores[j]) {
                    int temp = valores[i];
                    valores[i] = valores[j];
                    valores[j] = temp;
                }
            }
        }
        return valores;
    }
}
