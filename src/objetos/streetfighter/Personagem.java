package objetos.streetfighter;

public abstract class Personagem {
    
    String nome;
    private int forca;
    private int velocidade;
    
    void pular() {
        System.out.println(this.nome + " pulou");
    }
    
    abstract void meiaLuaSoco();
    
    abstract void meiaLuaChute();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    
    
    
}
