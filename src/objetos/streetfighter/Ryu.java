package objetos.streetfighter;

public class Ryu extends Personagem {
    
    Ryu() {
        this.nome = "Ryu";
    }
    @Override
    void meiaLuaSoco() {
        System.out.println("Haddouken!");
    }

    @Override
    void meiaLuaChute() {
        System.out.println("Tatsumaki Sempuu Kyaku");
    }
    
}
