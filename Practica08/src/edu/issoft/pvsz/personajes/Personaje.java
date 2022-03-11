package edu.issoft.pvsz.personajes;
public class Personaje {
    private String nombre;
    private int vida;

    public Personaje(String nombre, int vida){
        this.nombre = nombre;
        this.vida = vida;
    }
    public Personaje(String nombre){
        this.nombre = nombre;
        this.vida = 3;
    }
    public boolean setNombre(String nombre){
        if((nombre.length() < 20) && (nombre.length() > 3)){
            this.nombre = nombre;
            return true;
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
    public int getVida(){
        return vida;
    }
    public boolean setVida(int vida){
        if ((vida > 0) && (vida < 99)) {
            this.vida = vida;
            return true;
        }else{
            return false;
        }
    }
    public void getDetalle(){
        System.out.println(nombre + "\t" + vida);
    }
}