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
                
        System.out.println(retornarNomeIngrediente(3));
    }
    
    static String retornarNomeIngrediente(int menu) {
        String retorno = "Ingrediente selecionado: ";
        switch(menu) {
            case 0:
                return retorno + " Açucar";
            case 1:
                return retorno + "Água";
            case 2:
                return retorno + "Suco";
        }
        return retorno;
    }
    
}
