package maquina.suco.macho;

import java.util.Scanner;

public class MaquinaSucoMacho {
    
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
        
        int tamanhoCopo = 500;
        int doseAcucar = 5;
        int doseAgua = 50;
        int doseSuco = 10;
        
        // Valor atual
        int acucarAtual = 0;
        int aguaAtual = 0;
        int sucoAtual = 0;
        
        int menu = 0;
        boolean adiciona = true;
        
        Scanner leitor = new Scanner(System.in);
        
        menu = leitor.nextInt();
        
        System.out.println("Número lido: " + menu);
        
        switch (menu) {
            case 0: // Açucar
                if (adiciona) {
                    acucarAtual += doseAcucar;
                } else {
                    acucarAtual -= doseAcucar;
                }
                
                break;
            case 1: // Água
                if (adiciona) {
                    aguaAtual += doseAgua;
                } else {
                    aguaAtual -= doseAgua;
                }
                break;           
            case 2: // Suco
                if (adiciona) {
                    sucoAtual += doseSuco;
                } else {
                    sucoAtual -= doseSuco;
                }
                break;
            default:
                System.out.println("Selecione valor do 0, 1 ou 2");
        }      
        
    }
}
