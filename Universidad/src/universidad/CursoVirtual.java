/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidad;

/**
 *
 * @author Erick López
 */
public class CursoVirtual extends Curso {
    
    private String plataforma;
    
    //Constructor de curso virtual
    public CursoVirtual(String nombreCurso, String codigoCurso, Profesor profesor, String plataforma) {
        super(nombreCurso, codigoCurso, profesor);
        this.plataforma = plataforma;
    }
    
    //Getter de Plataforma
    public String getPlataforma() {
        return plataforma;
    }
}
