package org.example.polimorfismo.models;

public class Estudiantes {
    private String nombre;
    private String edad;
    private String nacimiento;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad(String text) {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    @Override
    public String toString() {
        return "Estudiantes{" +
                "nombre='" + nombre + '\'' +
                ", edad='" + edad + '\'' +
                ", nacimiento='" + nacimiento + '\'' +
                '}';
    }
}
