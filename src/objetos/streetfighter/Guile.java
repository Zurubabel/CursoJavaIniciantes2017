
package objetos.streetfighter;

public class Guile extends Personagem {
    
    public Guile() {
        super("Guile");
    }
    
    @Override
    void meiaLuaSoco() {
        System.out.println("Sonic Boom!");
    }

    @Override
    void meiaLuaChute() {
        return;
    }
    
}
