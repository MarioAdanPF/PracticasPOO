package mx.uaz.ingsoft.appsw.utils;
import mx.uaz.ingsoft.appsw.universitarios.Universitario;

public class Tablero {
    static final int MAX = 5;    
    private static int poss = -1;
    private static Universitario[] personas = new Universitario[MAX];
    public static final int MXC = 5;

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

    public static Calificacion getCalifRand(){
        int rand = (int) (Math.random()*10)+1;
        switch(rand){
            case 1: return Calificacion.UNO;
            case 2: return Calificacion.DOS;
            case 3: return Calificacion.TRES;
            case 4: return Calificacion.CUATRO;
            case 5: return Calificacion.CINCO;
            case 6: return Calificacion.SEIS;
            case 7: return Calificacion.SIETE;
            case 8: return Calificacion.OCHO;
            case 9: return Calificacion.NUEVE;
            case 10: return Calificacion.DIEZ;
            default : return Calificacion.CERO;
        }
    }
}
