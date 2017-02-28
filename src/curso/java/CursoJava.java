package curso.java;

public class CursoJava {
    
    public static void main(String[] args) { 
                
        int numero = 101;
        while(numero <= 100) {
            System.out.println("Número exibido: " + numero);
            numero++;
        }
        
        do {
            System.out.println("Número exibido: " + numero);
            numero++;
        } while(numero <= 100);
    }
    
    
}
