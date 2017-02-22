package curso.java;

public class CursoJava {

    public static void main(String[] args) { 
        
        // Cargos
        // 0 - 3 = Chão de Fábrica
        // 4 - 6 = Supervisores
        // 7 = Gerência
        // 8 = Dono
        
        int cargo = 250;
        
        switch(cargo) {
            case 0: 
            case 1:
            case 2:
            case 3:
                System.out.println("Funcionário é chão de fábrica");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Funcionário é supervisor");
                break;
            case 7:
                System.out.println("Funcionário é gerente");
                break;
            case 8:
                System.out.println("É o chefe, rapá!");
                break;
            default:
                System.out.println("Sei lá");
        }
        
        
        String nomeCargo = "Ch1efe";
        
        switch(nomeCargo) {
            case "Chefe":
                System.out.println("É o chefe, rapá!");
                break;
            default:
                System.out.println("Sei lá");
        }
        
        
    }
    
}
