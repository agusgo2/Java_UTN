public class Primer_Ejercicio_C {
    public static void main(String[] args){

        int numeroInicio = 5;
        int numeroFin = 14;
        String selector = "impar";
        while(numeroInicio <= numeroFin){
            switch (selector) {
                case "par":
                    if (numeroInicio % 2 == 0) {
                        System.out.println(numeroInicio);
                    }
                    numeroInicio++;
                    break;
                case "impar":
                    if (numeroInicio % 2 != 0) {
                        System.out.println(numeroInicio);
                    }
                    numeroInicio++;
                    break;
            }
            }
    }
}

