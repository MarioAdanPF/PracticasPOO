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

    public static void insertar(Universitario u){
        if ((poss < MAX - 1) && (poss >= -1)){
            personas[poss + 1] = u;
            poss++;
        }else{
            System.out.println("Imposible insertar en " + poss + "\n");
        }
    }

    public static void insertar(Universitario u, int idx){
        if ((idx <= MAX) && (idx > 0)){
            personas[idx - 1] = u;
        }else{
            System.out.println("Imposible insertar en " + idx + "\n");
        }
    }

    public static void borrar(){
        if ((poss < MAX) && (poss > -1)){
            personas[poss] = null;
            poss--;
        }else{
            System.out.println("Imposible borrar en " + poss + "\n");
        }
    }

    public static void borrar(int idx){
        if ((idx <= MAX) && (idx > 0)){
            personas[idx - 1] = null;
        }else{
            System.out.println("Imposible borrar en " + idx + "\n");
        }
    }
}
