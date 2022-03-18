package mx.uaz.ingsoft.appsw.universitarios.maestros;

import mx.uaz.ingsoft.appsw.universitarios.Universitario;

public class Maestro extends Universitario{
    private float sueldo;

    public boolean sueldoEstandar(float sueldo){
        if ((sueldo > 100) && (sueldo < 20000)){
            return true;
        }else{
            return false;
        }
    }

    public Maestro(String nombre, float sueldo){
        super(nombre);
        if (sueldoEstandar(sueldo) == true){
            this.sueldo = sueldo;
        }else{
            System.out.println("El sueldo es inválido");
        }
    }

    public Maestro(String nombre){
        super(nombre);
        this.sueldo = 1000.00f;
    }
}
