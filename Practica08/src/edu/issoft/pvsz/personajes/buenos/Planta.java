public class Planta{
    private String nombre;
    private int vida;
    private char escudo;        

    public Planta(String nombre, int vida, char escudo){
        this.nombre = nombre;
        this.vida = vida;
        this.escudo = escudo;
    }
    public Planta(String nombre, char escudo){
        this.nombre = nombre;
        this.vida = 3;
        this.escudo = escudo;
    }
    public Planta(String nombre, int vida){
        this.nombre = nombre;
        this.vida = vida;
        this.escudo = "A";
    }
    public Planta(String nombre){
        this.nombre = nombre;
        this.vida = 3;
        this.escudo = "A";
    }

    public String getDetalle(){
        return super.getDetalle() + escudo;
    }
    
}