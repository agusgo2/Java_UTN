public class Primer_Ejercicio_B {
    public static void main(String[] args){

        int numeroInicio = 5;
        int numeroFin = 14;
        while(numeroInicio <= numeroFin){
            if (numeroInicio % 2 == 0){
                System.out.println(numeroInicio);
            }
            numeroInicio++;
        }
    }
}