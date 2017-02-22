package curso.java;

public class CursoJava {

    public static void main(String[] args) { 
        int numero = -50;
        
        int resultado = numero % 2; 
        
        if (resultado != 1) {
            System.out.println(numero + " é par");
        } else {
            System.out.println(numero + " é ímpar");
        }
        
        if (numero < 0) {
            System.out.println(numero + " é negativo");
        } else if (numero >= 0 && numero < 100) {
            if (numero == 0) {
                System.out.println(numero + " é igual a 0");
            } else {
                System.out.println(numero + " é menor que 100");
            }
            
        } else if (numero >= 100 && numero <= 200) {
            System.out.println(numero + " é maior ou igual a 100 ou menor ou igual a 200");
        } else {
            System.out.println(numero + " é maior que 200");
        }
        
        
    }
    
}
