package mx.uaz.ingsoft.appsw.universitarios.alumnos;
import mx.uaz.ingsoft.appsw.universitarios.Universitario;
import mx.uaz.ingsoft.appsw.utils.Calificacion;
import mx.uaz.ingsoft.appsw.utils.Tablero;

public class Alumno extends Universitario{
    private Calificacion[] calificaciones = new Calificacion[Tablero.MXC];
    private float promedio;

    public Alumno(String nombre){
        super(nombre);
    }
    
    public boolean equals(Object o){
        boolean result = false;
        if ((o != null) && (o instanceof Alumno)){
            Alumno u = (Alumno) o;
            if (nombre.equals(u.nombre)){
                if (promedio == u.promedio){
                    return true;
                }
            }
        }
        return result;
    }

    public boolean calificacionEstandar(int calificacion){
        if ((calificacion >= 0) && (calificacion <= 10)){
            return true;
        }else{
            return false;
        }
    }
    
    public int hashCode(){
        int x = (int) promedio;
        return nombre.hashCode() * x;
    }

    public String toString(){
        return "Alumno " + super.toString() + " " + promedio;
    }

    public void getCalificaciones(){
        for (int i = 0; i < Tablero.MXC; i++){
            System.out.print(calificaciones[i] + " ");
        }
    }

    public float getPromedio(){
        
    }
    
    public void setCalif(){    
        for (int i = 0; i < Tablero.MXC; i++){
            calificaciones[i] = Calificacion.CERO;
        }
    }
}
