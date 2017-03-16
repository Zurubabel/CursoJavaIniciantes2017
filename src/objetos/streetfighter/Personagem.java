package objetos.streetfighter;

public abstract class Personagem {
    
    String nome;
    int forca;
    int velocidade;
    
    void pular() {
        System.out.println(this.nome + " pulou");
    }
    
    abstract void meiaLuaSoco();
    
    abstract void meiaLuaChute();
    
}
