
package objetos.canil;

public class Canil {
    public static void main(String args[]) {
        
        Pudo tobias = new Pudo();
        tobias.forca = 35.9;
        tobias.comprimento = 70.0;
        
        Cachorro florencio = new Cachorro("Florêncio");
        florencio.comprimento = 50.5;
        florencio.peso = 35.3;
        florencio.forca = 4.5;
        
        Cachorro chiquinho = new Cachorro("Chiquinho");
        chiquinho.comprimento = 15.5;
        chiquinho.peso = 35.3;
        chiquinho.forca = 6.5;
        
        florencio.correr();
        chiquinho.correr();
        
        
    }
}
