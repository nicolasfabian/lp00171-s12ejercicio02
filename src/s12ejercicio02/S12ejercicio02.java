/*
 * To change this license header, choose License Headers in
 * Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s12ejercicio02;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class S12ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Alumno> lista = new ArrayList<Alumno>();
        Scanner reader = new Scanner(System.in);
        
        String nombreAlumno="";
        String codigoAlumno="";
        
        while (true) {
            System.out.print("CODIGO: ");
            codigoAlumno = reader.nextLine();
            System.out.print("NOMBRE: ");
            nombreAlumno = reader.nextLine();
            if (nombreAlumno.isEmpty()){
               break;
            }
            lista.add(new Alumno(nombreAlumno,codigoAlumno));
        }
        
        System.out.println("");
        System.out.println("LISTA ALUMNOS");
        // Imprimiendo todos los alumnos
        for (Alumno st : lista) {
            System.out.println(st);
        }
        
        // buscar alumnos de acuerdo a un termino de busqueda
        System.out.println("");
        System.out.println("TERMINO DE BUSQUEDA(INGRESAR TEXTO A BUSCAR): ");
        String terminoBusqueda = reader.nextLine();
        System.out.print("RESULTADO:");
        
        for (Alumno alumno : lista) {
           //if the name of any student contains the search term as a part of 
           //the name then it prints only the students which contains that part
           if (alumno.obtenerNombre().contains(terminoBusqueda)) {
              System.out.println(alumno);
           }
        }
    }
    
}