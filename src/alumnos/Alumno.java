/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package alumnos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author rsaaperez
 */
public class Alumno implements Comparable{

    private String nombre;
    private int nota;

    public Alumno() {
    }

    public Alumno(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public static void ver(ArrayList<Alumno> colegio) {
        for (Iterator<Alumno> it = colegio.iterator(); it.hasNext();) {
            Alumno i = it.next();
            System.out.println("Alumno: " + i.getNombre() + "\tNota: " + i.getNota());
        }

        System.out.println("Fin de la lista.\n");
    }

    public static void añadir(ArrayList<Alumno> colegio) {
        Scanner sc = new Scanner(System.in);
        int n;
        int check;
        String nom;
        do {
            System.out.print("Introduce el nombre del alumno: ");
            nom = sc.next();
            System.out.print("Introduce la nota del alumno: ");
            n = sc.nextInt();
            if (n >= 0 && n <= 10) {
                colegio.add(new Alumno(nom, n));
            }
            System.out.print("Para finalizar el programa presione 0, otro numero para continuar: ");
            check = sc.nextInt();

        } while (check != 0);
    }

    public static void verNota(ArrayList<Alumno> colegio) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el nombre del alumno del que deseas consultar su nota: ");
        String nombre = sc.next();
        boolean comp = false;
        for (Alumno al : (colegio)) {
            if (al.getNombre().equals(nombre)) {
                System.out.println("La nota de " + nombre + " es: " + al.getNota());
                comp = true;
            }
        }
        if (comp == false) {
            System.out.println("No se encuentra el alumno");
        }
    }

    public static void alta(ArrayList<Alumno> colegio) {
        Scanner sc = new Scanner(System.in);
        String nom;
        System.out.print("Introduce el nombre del alumno al que deseas dar de alta: ");
        nom = sc.next();
        colegio.add(new Alumno(nom, 0));
    }

    public static void baja(ArrayList<Alumno> colegio) {
        Alumno alumno = new Alumno();
        int check = 0;
        Scanner sc = new Scanner(System.in);
        String nom;
        System.out.print("Introduce el nombre del alumno al que deseas dar de baja: ");
        nom = sc.next();
        for (Alumno al : (colegio)) {
            if (al.getNombre().equals(nom)) {
                alumno = al;
                check = 1;
            }
        }
        if (check == 1) {
            colegio.remove(alumno);
            System.out.println("El alumno " + nom + " ha sido dado de baja.");
        }
    }

    public static void buscar(ArrayList<Alumno> colegio) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el nombre del alumno que buscas: ");
        String nombre = sc.next();
        boolean comp = false;
        for (Alumno al : (colegio)) {
            if (al.getNombre().equals(nombre)) {
                System.out.println("El alumno se encuentra en el colegio.");
                comp = true;
            }
        }
        if (comp == false) {
            System.out.println("Ese alumno no esta dado de alta en el colegio.");
        }
    }

    public void ordenar(ArrayList<Alumno> colegio) {
        Collections.sort(colegio);
        System.out.println("Lista ordenada de alumnos");
    }

   @Override
    public int compareTo(Object i) {
        Alumno alumno = (Alumno) i;
        if (getNombre().compareToIgnoreCase(alumno.getNombre()) == 0) 
            return 0;
        
        else if (getNombre().compareToIgnoreCase(alumno.getNombre()) < 0) 
            return -1;
        
        else  
            return 1;
        
    }
}
