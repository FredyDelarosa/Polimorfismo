package org.example.polimorfismo.models;

import java.util.ArrayList;

public class DB3 implements Servidor {
    private ArrayList<Estudiantes> students = new ArrayList<>();

    @Override
    public void guardar(Estudiantes student) {
        students.add(student);
        System.out.println("Registro guardado en DataBase3");
    }

    @Override
    public void actualizar(Estudiantes actualizar, int indice) {
        students.set(indice, actualizar);
    }
}
