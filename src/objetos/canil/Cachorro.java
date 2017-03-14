package objetos.canil;

public class Cachorro {
    
    String nome;
    double peso;
    double comprimento;
    double forca;
    
    void correr() {
        System.out.println(nome + " corre a " + (comprimento * forca) + "cm/s");
    }
    
}
