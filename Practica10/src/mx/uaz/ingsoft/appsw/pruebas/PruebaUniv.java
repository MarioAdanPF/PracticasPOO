package mx.uaz.ingsoft.appsw.pruebas;
import mx.uaz.ingsoft.appsw.universitarios.Universitario;
import mx.uaz.ingsoft.appsw.universitarios.alumnos.Alumno;
import mx.uaz.ingsoft.appsw.universitarios.maestros.Maestro;
import mx.uaz.ingsoft.appsw.utils.Tablero;

public class PruebaUniv {
    public static void main(String[] args) {
        Tablero.mostrar();
        Tablero.insertar(new Universitario("Jose Antonio"));
        Tablero.insertar(new Maestro("Rosario", 10f), 4);
        Tablero.insertar(new Alumno("David",80));
        Tablero.insertar(new Universitario("Maria Aide"));
        Tablero.insertar(new Maestro("Cristopher",5000f),6);
        Tablero.insertar(new Alumno("Areli", 5));
        Tablero.mostrar();
        Tablero.borrar(4);
        Tablero.borrar();
        Tablero.borrar(10);
        Tablero.mostrar();
    }
}

/*A la hora de compilar y ejecutar no tuve ningún error, aunque al principio me estaba marcando
varios errores por el static que se me había olvidado poner en los métodos, pero cuando solucioné
eso todo lo demás salió relativamente fácil (aunque me tardé muchísimo, me distraigo muy facilmente
y cuando menos acuerdo ya perdí mucho tiempo en el celular), por lo demás estuvo sencillo.
*/