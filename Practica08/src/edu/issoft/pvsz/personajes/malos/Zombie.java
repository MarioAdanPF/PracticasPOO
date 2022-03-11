public class Zombie {
    private boolean ataque;

    public Zombie(Sting nombre, int vida, boolean ataque){
        super(nombre, vida);
        this.ataque = ataque;
    }
    public Zombie(Sting nombre, boolean ataque){
        super(nombre, 3);
        this.ataque = ataque;
    }
    public Zombie(Sting nombre, int vida){
        super(nombre, vida);
        this.ataque = false;
    }
    public Zombie(Sting nombre){
        super(nombre, 3);
        this.ataque = false;
    }

    public boolean ataque(){
        return ataque;
    }
    public getDetalle(){
        return super.getDetalle() + ataque;
    }
    public int decVida(){
        if (ataque == false){
            return super.decVida() * 3;
        }else{
            return super.decVida() * 2;
        }
    }
    public int decVida(int dec){
        if (ataque == false){
            return super.decVida(dec) * 3;
        }else{
            return super.decVida(dec) * 2;
        }
    }
    public int addVida(){
        if (ataque == true){
            return super.addVida() * 3;
        }
    }
    public int addVida(int add){
        if (ataque == true){
            return super.addVida(add) * 3;
        }
    }
}
