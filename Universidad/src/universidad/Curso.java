/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidad;

/**
 *
 * @author Erick López
 */
public abstract class Curso {
    
    protected String nombreCurso;
    protected String codigoCurso;
    protected Profesor profesor;
    
    //Creamos un constructor
    public Curso(String nombreCurso, String codigoCurso, Profesor profesor) {
        this.nombreCurso = nombreCurso;
        this.codigoCurso = codigoCurso;
        this.profesor = profesor;
    }
    //Getters de os metodos protegidos
    public String getNombreCurso() {
        return nombreCurso;
    }

    public String getCodigoCurso() {
        return codigoCurso;
    }

    public Profesor getProfesor() {
        return profesor;
    }
    
    
}
