/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidad;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Erick López
 */
// T solo puede ser un tipo de Curso o una clase que herede de Curso. public class Inscripcion<T extends Curso> {
public class Inscripcion<T extends Curso> {
    
    
    // Lista que solamente puede almacenar estudiantes. private List<Estudiante> estudiantes;
    private T curso;
    private List<Estudiante> estudiantes;

    public Inscripcion(T curso) {
        this.curso = curso;
        estudiantes = new ArrayList<>();
    }

    public void inscribirEstudiante(Estudiante e) { 
        estudiantes.add(e);
        System.out.println(e.getNombre() + " fue inscrito en " 
                + curso.getNombreCurso());
    }

    public void removerEstudiante(Estudiante e) {
        if (estudiantes.remove(e)) {
            System.out.println(e.getNombre() + " fue removido del curso.");
        } else {
            System.out.println("El estudiante no esta inscrito.");
        }
    }

  public void mostrarInscritos() {

    System.out.println("Curso: " + curso.getNombreCurso()
            + " (" + curso.getCodigoCurso() + ")"
            + " - Profesor: " + curso.getProfesor().getNombre());

    System.out.println("Estudiantes inscritos:");

    if (estudiantes.isEmpty()) {
        System.out.println("No hay estudiantes inscritos.");
    } else {
        for (Estudiante estudiante : estudiantes) {
            System.out.println("- " + estudiante.getNombre()
                    + " (" + estudiante.getId() + ")");
        }
    }

    System.out.println("Total inscritos: " + estudiantes.size());
 }
}
