/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package universidad;

/**
 *
 * @author Erick López
 */
public class Main_Uni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Profesor profesor = new Profesor(
                "Ivan Flores",
                19277,
                "ivan.flores19277@potros.itson.edu.mx",
                "Ingenieria"
        );
        
        Profesor profesor2 = new Profesor(
                "Dennise Hernandez",
                10070,
                "dennise.hernandez@itson.edu.mx",
                "Matematicas"
        );
        

        Estudiante estudiante1 = new Estudiante(
                "Erick Lopez",
                277998,
                "erick.lopez277998@potros.itson.edu.mx",
                "Ingenieria en Software",
                3
        );

        Estudiante estudiante2 = new Estudiante(
                "Angel Villegas",
                67,
                "angel.villegas278295@potros.itson.edu.mx",
                "Ingenieria en Software",
                3
        );

        CursoPresencial cursoPresencial = new CursoPresencial(
                "Base de Datos",
                "BD-12859",
                profesor,
                "Aula 712"
        );

        CursoVirtual cursoVirtual = new CursoVirtual(
                "Matematicas Computacionales",
                "MC-14750",
                profesor2,
                "Google Meet"
        );

        Inscripcion<CursoPresencial> inscripcionPresencial =
                new Inscripcion<>(cursoPresencial);

        Inscripcion<CursoVirtual> inscripcionVirtual =
                new Inscripcion<>(cursoVirtual);

        // Inscripción de estudiantes al curso presencial
        inscripcionPresencial.inscribirEstudiante(estudiante1);
        inscripcionPresencial.inscribirEstudiante(estudiante2);

        // Inscripción de estudiantes al curso virtual
        inscripcionVirtual.inscribirEstudiante(estudiante2);

        System.out.println("\n=== CURSO PRESENCIAL ===");
        inscripcionPresencial.mostrarInscritos();

        System.out.println("\n=== CURSO VIRTUAL ===");
        inscripcionVirtual.mostrarInscritos();

        // Prueba de eliminación
        System.out.println("\n=== REMOVIENDO ESTUDIANTE ===");
        inscripcionPresencial.removerEstudiante(estudiante2);

        System.out.println();
        inscripcionPresencial.mostrarInscritos();
    }
}