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
            this.sueldo = 1000.00f;
        }
    }

    public Maestro(String nombre){
        super(nombre);
        this.sueldo = 1000.00f;
    }

    public boolean equals(Object o){
        boolean result = false;
        if ((o != null) && (o instanceof Maestro)){
            Maestro u = (Maestro) o;
            if (nombre.equals(u.nombre)){
                if (sueldo == u.sueldo){
                    return true;
                }
            }
        }
        return result;
    }

    public int hashCode(){
        int x = (int) sueldo;
        return nombre.hashCode()*x;
    }

    public String toString(){
        return "Maestro" + super.toString() + sueldo;
    }
}
