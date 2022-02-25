package edu.issoft.pvsz.pruebas;
import edu.issof.pvsz.personajes.Personaje;
public class PruebaPersonaje{
    public static void main(String[] args) {
        Personaje alumno = new Personaje("Kal El");
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
    }   
}