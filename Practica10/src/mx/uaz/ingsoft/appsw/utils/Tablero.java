package mx.uaz.ingsoft.appsw.utils;
import mx.uaz.ingsoft.appsw.universitarios.Universitario;

public class Tablero {
    private static final int MAX = 5;    
    private static int poss = -1;
    private static Universitario[] personas = new Universitario[MAX];

    private Tablero(){}

    public static void mostrar(){
        System.out.println("*El tablero contiene*");
        for (int i = 0; i < MAX; i++){
            if (personas[i] == null){
                System.out.println("-");
            }else{
                System.out.println(personas[i]);
            }
        }
        System.out.println("******");
    }

}
