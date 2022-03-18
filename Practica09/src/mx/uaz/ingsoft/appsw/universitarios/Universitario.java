package mx.uaz.ingsoft.appsw.universitarios;
public class Universitario{
    private String nombre;

    public Universitario(String nombre){
        this.nombre = nombre;
    }

    public boolean equals(Object o){
        boolean result = false;
        if((o != null) && (o instanceof Universitario)){
            Universitario u = (Universitario) o;
            if (nombre.equals(u.nombre)){
                return true;
            }
        }
        return result;
    }

    public int hashCode(){
        return nombre.hashCode();
    }
    
    public String toString(){
        return nombre;
    }
}