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
    }
}