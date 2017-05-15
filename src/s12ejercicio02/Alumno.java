/*
 * To change this license header, choose License Headers in 
 * Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s12ejercicio02;

/**
 *
 * @author alumno
 */
public class Alumno {
    
    private String nombreAlumno;
    private String codigoAlumno;

    public Alumno(String nombreAlumno, String codigoAlumno){
        this.nombreAlumno = nombreAlumno;
        this.codigoAlumno = codigoAlumno;
    }

    public String obtenerNombre(){
        return this.nombreAlumno;
    }

    public String obtenerCodigo(){
        return this.codigoAlumno;
    
    }

    @Override
    public String toString() {
        return this.nombreAlumno + " ("+ this.codigoAlumno + ")";
    }
}
