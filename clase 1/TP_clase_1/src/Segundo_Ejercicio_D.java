public class Segundo_Ejercicio_D {
    public static void main(String[] args){

        double ingresos = 323412.2;
        int vehiculos = 2;
        int inmuebles = 5;
        boolean lancha_jet_documento = false;
        //el enunciado dice si posee algunas de las condiciones ya se considera como segmento de ingresos altos
        if ( (ingresos <= 489083) || ( vehiculos <= 30) || (inmuebles <= 3330) || (lancha_jet_documento)){
            System.out.println("Pertenece al segmento de ingresos altos");
        } else{
            System.out.println("No pertenece al segmento de ingresos altos");
        }

    }
}
