package mx.uaz.ingsoft.appsw.pruebas;
import mx.uaz.ingsoft.appsw.universitarios.Universitario;
import mx.uaz.ingsoft.appsw.universitarios.alumnos.Alumno;
import mx.uaz.ingsoft.appsw.universitarios.maestros.Maestro;

public class PruebaIguales {
    public static void main(String[] args) {
        Universitario[] personas = {new Universitario("Rosario"),
        new Maestro("Sebastian",5f),
        new Alumno("Areli",80),
        new Universitario("Rosario"),
        new Maestro("Sebastian",1000f),
        new Alumno("Areli",5)};

        int i = 0;
        while (i < personas.length){
            for(Universitario u : personas){
                if (personas[i] == u){
                    System.out.println("*****" + personas[i].toString() + " es identico a " + u.toString()
                    + ", son el mismo objeto*****");
                }else{
                    if (personas[i].equals(u) == true){
                        System.out.println("** " + personas[i].toString() + " es igual a " + u.toString()
                        + ", son diferentes objetos**");
                    }else{
                        System.out.println(personas[i].toString() + " != " + u.toString());
                    }
                }
                
            }
            i++;
            System.out.println("\n");
        }
    }
}
