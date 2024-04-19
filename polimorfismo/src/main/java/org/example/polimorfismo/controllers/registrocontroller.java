package org.example.polimorfismo.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import org.example.polimorfismo.models.DataCenter;
import org.example.polimorfismo.models.Estudiantes;

public class registrocontroller {
    DataCenter dc = new DataCenter();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ListView<String> ListaEstudiantes;

    @FXML
    private TextField edad;

    @FXML
    private TextField nacimiento;

    @FXML
    private TextField nameAlumno;

    public void upgrade(){
        ListaEstudiantes.getItems().clear();
        for (Estudiantes i: dc.obtenerInfo().getStudents()){
            ListaEstudiantes.getItems().add(i.toString());
        }
    }

    @FXML
    void btn_actualizar(MouseEvent event) {
        Estudiantes estudiante = new Estudiantes();
        estudiante.setNombre(nameAlumno.getText());
        estudiante.setEdad(edad.getText());
        estudiante.setNacimiento(nacimiento.getText());
        dc.obtenerInfo().actualizar(estudiante, ListaEstudiantes.getSelectionModel().getSelectedIndex());
        dc.obtenerInfo2().actualizar(estudiante, ListaEstudiantes.getSelectionModel().getSelectedIndex());
        dc.obtenerInfo3().actualizar(estudiante, ListaEstudiantes.getSelectionModel().getSelectedIndex());
        upgrade();
    }

    @FXML
    void btn_agregar(MouseEvent event) {
        Estudiantes estudiante = new Estudiantes();
        estudiante.setNombre(nameAlumno.getText());
        estudiante.setEdad(edad.getText());
        estudiante.setNacimiento(nacimiento.getText());
        dc.obtenerInfo().guardar(estudiante);
        dc.obtenerInfo2().guardar(estudiante);
        dc.obtenerInfo3().guardar(estudiante);
        upgrade();
    }

    @FXML
    void btn_salir(MouseEvent event) {
        Platform.exit();
    }



    @FXML
    void initialize() {
        assert ListaEstudiantes != null : "fx:id=\"ListaEstudiantes\" was not injected: check your FXML file 'registro.fxml'.";
        assert edad != null : "fx:id=\"edad\" was not injected: check your FXML file 'registro.fxml'.";
        assert nacimiento != null : "fx:id=\"nacimiento\" was not injected: check your FXML file 'registro.fxml'.";
        assert nameAlumno != null : "fx:id=\"nameAlumno\" was not injected: check your FXML file 'registro.fxml'.";

    }

}



