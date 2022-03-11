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
    public int decVida(){
        if (escudo == "A"){
            return super.decVida() * 2;
        }else{
            return super.decVida();
        }
    }
    public int decVida(int dec){
        if (escudo == "A"){
            return super.decVida(dec) * 2;
        }else{
            return super.decVida(dec);
        }
    }
    public int addVida(){
        if (escudo == "A"){
            return super.addVida() * 2;
        }else{
            return super.addVida();
        }
    }
    public int addVida(int add){
        if (escudo == "A"){
            return super.addVida(add) * 2;
        }else{
            return super.addVida(add);
        }
    }
}