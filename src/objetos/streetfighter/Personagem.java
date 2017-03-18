package objetos.streetfighter;

public abstract class Personagem {
    
    private String nome;
    private int forca;
    private int velocidade;
    
    private static int QT_PERSONAGENS_INSTANCIADOS = 0;
    
    public Personagem(String nome) {
        this.nome = nome;
        QT_PERSONAGENS_INSTANCIADOS++;
    }
    
    void pular() {
        System.out.println(this.nome + " pulou");
    }
    
    public int retornarQuantidadeInstanciados() {
        return QT_PERSONAGENS_INSTANCIADOS;
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
