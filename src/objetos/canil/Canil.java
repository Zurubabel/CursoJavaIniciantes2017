
package objetos.canil;

public class Canil {
    public static void main(String args[]) {
        
        Cachorro florencio = new Cachorro();
        florencio.nome = "Florêncio";
        florencio.comprimento = 50.5;
        florencio.peso = 35.3;
        florencio.forca = 4.5;
        
        Cachorro chiquinho = new Cachorro();
        chiquinho.nome = "Chiquinho";
        chiquinho.comprimento = 15.5;
        chiquinho.peso = 35.3;
        chiquinho.forca = 6.5;
        
        florencio.correr();
        chiquinho.correr();
        
        
    }
}
