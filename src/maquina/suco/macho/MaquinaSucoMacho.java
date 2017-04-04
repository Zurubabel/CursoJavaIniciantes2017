package maquina.suco.macho;

import java.util.Random;
import maquina.suco.macho.maquina.MaquinaSuco;
import maquina.suco.macho.menu.Menu;
import maquina.suco.macho.suco.CopoSuco;

public class MaquinaSucoMacho {
       
    // Números aleatórios
    Random geradorNumero = new Random();
    
    // Variáveis dos gostos do Jailson
    static int gostoAcucar = 0;
    static int gostoAgua = 0;
    static int gostoSuco = 0;
    
    private CopoSuco suco = new CopoSuco();
    
    public static void main(String args[]) {
        /*
            Máquina de Suco de Macho
            
            Tamanho do copo = 500ml
        
            Dose de açucar = 5ml
        
            Água = 50ml
        
            Suco = 10ml
        
            Jailson = Gosto
        
            * Controles do suco
                - Qual ingrediente
                - Aumenta ou diminui
        
            * Gerar o gosto do Jailson aleatoriamente
                - Retornar o gosto dele
            
            * Controlar o volume do copo
        */
        Menu menu = new Menu(new CopoSuco(), new MaquinaSuco());
        
        while(true) {
            menu.exibirValoresAtuais();
            menu.exibirMenuIngredientes();
            menu.selecionarMenu();
        }
                
    }
        
}
