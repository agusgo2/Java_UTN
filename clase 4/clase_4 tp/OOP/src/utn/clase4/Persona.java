package utn.clase4;

import java.time.LocalDateTime;

public class Persona {

    public String nombre;
    public String apellido;
    public LocalDateTime fechaDeNacimiento;

    public Persona(String nombre, String apellido, LocalDateTime fechaDeNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaDeNacimiento = fechaDeNacimiento;

    }

    private LocalDateTime fechaActual = LocalDateTime.now();
    public void edad(LocalDateTime fechaDeNacimiento){

        System.out.println(fechaDeNacimiento.compareTo(fechaActual));
    }

}
