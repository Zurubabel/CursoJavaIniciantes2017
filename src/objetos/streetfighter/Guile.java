
package objetos.streetfighter;

public class Guile extends Personagem {
    
    Guile() {
        this.nome = "Guile";
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
