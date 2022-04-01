package mx.uaz.ingsoft.appsw.pruebas;
import mx.uaz.ingsoft.appsw.universitarios.alumnos.Alumno;
import mx.uaz.ingsoft.appsw.utils.Calificacion;
import mx.uaz.ingsoft.appsw.utils.Tablero;

public class PruebaEnum {
    public static void main(String[] args) {
        Alumno a = new Alumno("Mario Adan");
        a.setCalif();
        for(int i = 0; i < Tablero.MXC; i++){
            Calificacion c = Tablero.getCalifRand();
            a.setCalif(c, i);
            a.toString();
        }
    }
}

//No se ejecuta correctamente y no estoy seguro del por qué, me quedé atorado en esto.