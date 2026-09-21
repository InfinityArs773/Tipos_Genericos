/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidad;

/**
 *
 * @author Erick López
 */
public class Profesor extends Persona {
    private String departamento;
    
    public Profesor(String nombre, int id, String correo, String departamento) {
        super(nombre, id, correo);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }
}

