import edu.issoft.pvsz.personajes.Personaje;

public class pruebaHerencia {
    public static void main(String[] args) {
        Personaje per01 = new Personaje("Adrian",100);
        Personaje per02 = new Personaje("Diego");
        Planta plan01 = new Planta("Angel", 10, "B");
        Planta plan02 = new Planta("Maria",50);
        Planta plan03 = new Planta("Mario","C");
        Planta plan04 = new Planta("Silvia");
        Zombie zom01 = new Zombie("Armando",80,false);
        Zombie zom02 = new Zombie("Areli",true);
        Zombie zom03 = new Zombie("Gerardo");
        
        Personaje personajes [] = new Personaje[8];
        personajes[0] = per01;
        personajes[1] = per02;
        personajes[2] = plan01;
        personajes[3] = plan02;
        personajes[4] = plan03;
        personajes[5] = plan04;
        personajes[6] = zom01;
        personajes[7] = zom02;
        personajes[8] = zom03;
        for (int i = 0 ; i < personajes.length ; i++){
            
        }

    }
}
