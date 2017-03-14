package objetos.canil;

public class Cachorro {
    
    String nome;
    double peso;
    double comprimento;
    double forca;
    
    Cachorro() {}
    
    Cachorro(String nome) {
        this.nome = nome;
    }
    
    void correr() {
        System.out.println(nome + " corre a " + (comprimento * forca) + "cm/s");
    }
    
}
