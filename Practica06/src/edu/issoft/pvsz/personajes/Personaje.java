package edu.issoft.pvsz.personajes;
public class Personaje {
    private String nombre;
    private int edad;

    public Personaje(String nombre){
        this.nombre = nombre;
    }
    public boolean setNombre(String nombre){
        if(len(nombre) < 20 && len(nombre) > 3){
            return true;
            this.nombre = nombre;   
        }else{
            return false;
        }
    }
    public String getNombre(){
        return nombre;
    }
    public void saludar(){
        System.out.println("Hola alumno de POO " + nombre);
    }
    public int getEdad(){
        return edad;
    }
    public boolean setEdad(int edad){
        if ((edad > 0) && (edad < 120)) {
            this.edad = edad;
            return true;
        }else{
            return false;
        }
    }
}