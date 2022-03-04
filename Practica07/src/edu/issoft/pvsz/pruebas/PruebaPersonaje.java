package edu.issoft.pvsz.pruebas;
import edu.issoft.pvsz.personajes.Personaje;
public class PruebaPersonaje{
    public static void main(String[] args) {
        Personaje per01 = new Personaje("Cristopher");
        Personaje per02 = new Personaje("Aide");
        Personaje per03 = new Personaje("Rosario");
        Personaje per04 = new Personaje("Antonio");
        
        int ed = (int) (Math.random() * 100);
        int n = 0;
        int m = 0;
        
        while (n <= m){
            n = ed;
            m = ed;
                
            for (int i = n; i >= m; i++){
                per01.setEdad(ed);
            }
        }
    }   
}