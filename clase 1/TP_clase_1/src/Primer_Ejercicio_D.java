public class Primer_Ejercicio_D {
    public static void main(String[] args){

        int numeroInicio = 5;
        int numeroFin = 14;
        for(int i = numeroFin; i >= numeroInicio; i--){
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
