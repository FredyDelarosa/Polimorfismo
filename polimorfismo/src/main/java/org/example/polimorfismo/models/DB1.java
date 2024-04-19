package org.example.polimorfismo.models;

import java.util.ArrayList;

public class DB1 implements Servidor {
    private ArrayList<Estudiantes> students = new ArrayList<>();

    @Override
    public void guardar(Estudiantes student) {
        students.add(student);
        System.out.println("Registro guardado en DataBase1");
    }

    @Override
    public void actualizar(Estudiantes actualizar, int indice) {
        students.set(indice, actualizar);
    }

    public ArrayList<Estudiantes> getStudents() {
        return students;
    }
}
