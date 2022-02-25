package edu.issoft.pvsz.pruebas;
import edu.issoft.pvsz.personajes.Personaje;
public class PruebaPersonaje{
    public static void main(String[] args) {
        Personaje alumno = new Personaje("Kal El", 0);
        alumno.saludar();
        System.out.println("Nombre: " + alumno.getNombre() + " Edad: " + alumno.getEdad());
        System.out.println("Modificando el nombre " + alumno.getNombre());
        alumno.setNombre("Michael Jordan");
        alumno.saludar();
        if (!alumno.setEdad(30)){
            System.out.println("Edad sin cambios");
        }
        System.out.println("Nombre: " + alumno.getNombre() + " Edad: " + alumno.getEdad());
        System.out.println("Modificando edad en 130");
        if (!alumno.setEdad(130)){
            System.out.println("Edad sin cambios");
        }
        System.out.println("Nombre: " + alumno.getNombre() + " Edad: " + alumno.getEdad());

        Personaje per01 = new Personaje("Alexander", 200);
        Personaje per02 = new Personaje("Rosario", 10);
        Personaje per03 = new Personaje("Emiliano", 1);
        Personaje per04 = new Personaje("Areli", -10);
        Personaje per05 = new Personaje("Eloy", 500);
        
        per01.getDetalle();
        per02.getDetalle();
        per03.getDetalle();
        per04.getDetalle();
        per05.getDetalle();
        
        Personaje per06 = per05;
        Personaje per07 = per04;
        Personaje per08 = per03;
        Personaje per09 = per02;
        Personaje per10 = per01;

        per06.setNombre("Aratt Esau Juarez Luna");
        per08.setNombre("Hanna");
        per10.setNombre("Maria Aide");
        per07.setEdad(13);
        per09.setEdad(426);
        System.out.println("---");

        per06.getDetalle();
        per07.getDetalle();
        per08.getDetalle();
        per09.getDetalle();
        per10.getDetalle();
    }   
}