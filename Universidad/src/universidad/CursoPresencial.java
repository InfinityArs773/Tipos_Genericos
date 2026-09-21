/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidad;

/**
 *
 * @author Erick López
 */
public class CursoPresencial extends Curso {
    
    private String aula;
    
    //Constructor de aula
    public CursoPresencial(String nombreCurso, String codigoCurso, Profesor profesor, String aula) {
        super(nombreCurso, codigoCurso, profesor);
        this.aula = aula;
    }
    //Getter de aula
    public String getAula() {
        return aula;
    }
}
