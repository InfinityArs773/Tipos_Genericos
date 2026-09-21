package universidad; 
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Erick López
 */


public class Estudiante extends Persona {
    
    private String carrera;
    private int semestre;
    
    
    //Constructor
    public Estudiante(String nombre, int id, String correo, String carrera, int semestre) {
        super(nombre, id, correo);
        this.carrera = carrera;
        this.semestre = semestre;
    }
    //Getter de carrera
    public String getCarrera() {
        return carrera;
    }
    //Getter de Semestre  
    public int getSemestre() {
        return semestre;
    }
}