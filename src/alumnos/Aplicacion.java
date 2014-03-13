/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package alumnos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author rsaaperez
 */
public class Aplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alumno alumnado = new Alumno();
        ArrayList<Alumno> colegio= new ArrayList<Alumno>();
        HashMap<String, Alumno> colegio1= new HashMap<>();
        alumnado.añadir(colegio1);
        alumnado.ver(colegio);
        alumnado.verNota(colegio);
        alumnado.alta(colegio);
        alumnado.baja(colegio);
        alumnado.buscar(colegio);
        alumnado.ordenar(colegio);
        alumnado.ver(colegio);
    }
}
