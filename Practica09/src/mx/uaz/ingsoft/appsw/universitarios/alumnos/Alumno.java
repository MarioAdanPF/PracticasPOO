package mx.uaz.ingsoft.appsw.universitarios.alumnos;
import mx.uaz.ingsoft.appsw.universitarios.Universitario;

public class Alumno extends Universitario{
    private int calificacion;

    public boolean calificacionEstandar(int calificacion){
        if ((calificacion >= 0) && (calificacion <= 10)){
            return true;
        }else{
            return false;
        }
    }

    public Alumno(String nombre, int calificacion){
        super(nombre);
        if (calificacionEstandar(calificacion) == true){
            this.calificacion = calificacion;
        }else{
            this.calificacion = 5;
        }
    }

    public Alumno(String nombre){
        super(nombre);
        this.calificacion = 5;
    }

    public boolean equals(Object o){
        boolean result = false;
        if ((o != null) && (o instanceof Alumno)){
            Alumno u = (Alumno) o;
            if (nombre.equals(u.nombre)){
                if (calificacion == u.calificacion){
                    return true;
                }
            }
        }
        return result;
    }

    public int hashCode(){
        return nombre.hashCode() * calificacion;
    }

    public String toString(){
        return super.toString() + calificacion;
    }
}
