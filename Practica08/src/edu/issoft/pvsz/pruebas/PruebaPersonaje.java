package edu.issoft.pvsz.pruebas;
import edu.issoft.pvsz.personajes.Personaje;
public class PruebaPersonaje{
    public static void main(String[] args) {
        Personaje per01 = new Personaje("Cristopher");
        Personaje per02 = new Personaje("Aide");
        Personaje per03 = new Personaje("Rosario");
        Personaje per04 = new Personaje("Antonio");
        
        int ed = (int) (Math.random() * 100);
        System.out.println(ed);
        int n = 0;
        int m = 0;
        
        while (n >= m){
            n = ed;
            ed = (int) (Math.random() * 100);
            m = ed;
        }
        
        for (int i = n; i <= m; i++){
            ed = (int) (Math.random() * 250);
            if (per01.setEdad(ed) == (true)){
                System.out.println(per01.getNombre() + " " + per01.getEdad() + " se modificó la edad");
            }else{
                System.out.println(per01.getNombre() + " " + per01.getEdad() + " sin modificaciones en edad a " + ed);
            }

            ed = (int) (Math.random() * 250);
            if (per02.setEdad(ed) == (true)){
                System.out.println(per02.getNombre() + " " + per02.getEdad() + " se modificó la edad");
            }else{
                System.out.println(per02.getNombre() + " " + per02.getEdad() + " sin modificaciones en edad a " + ed);
            }

            ed = (int) (Math.random() * 250);
            if (per03.setEdad(ed) == (true)){
                System.out.println(per03.getNombre() + " " + per03.getEdad() + " se modificó la edad");
            }else{
                System.out.println(per03.getNombre() + " " + per03.getEdad() + " sin modificaciones en edad a " + ed);
            }

            do{
                ed = (int) (Math.random() * 250);
                if (ed == 150){
                    System.out.println("***Bingo 150***");
                }
            }while (per04.setEdad(ed) == (false));

            per04.getDetalle();
            System.out.println("");
        }
    }   
}