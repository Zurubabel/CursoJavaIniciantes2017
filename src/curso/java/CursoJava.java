package curso.java;

public class CursoJava {
    
    static int numero = 20;
    
    static void somarDoisNumeros(int num1, int num2) {
        System.out.println(numero);
        System.out.println(num1 + num2);
    } 
    
    static int retornarSomaDoisNumeros(int num1, int num2) {
        num1 *= num1;
        return num1 + num2;
    } 

    public static void main(String[] args) { 
                
        //System.out.println(numero);
        
        //somarDoisNumeros(2, 3);
        
        int num0 = 10;
        
        System.out.println(retornarSomaDoisNumeros(num0, 7));
        
        //somarDoisNumeros(10, -30);
    }
    
    
    
}
