package maquina.suco.macho;

import java.util.Scanner;

public class MaquinaSucoMacho {
    
    static int tamanhoCopo = 500;
    static int doseAcucar = 5;
    static int doseAgua = 50;
    static int doseSuco = 10;

    // Valor atual
    static int acucarAtual = 0;
    static int aguaAtual = 0;
    static int sucoAtual = 0;
    static int volumeTotal = acucarAtual + aguaAtual + sucoAtual;
    
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
        
        exibirValoresAtuais();
        exibirMenuIngredientes();
        selecionarMenu();
        
    }
    
    static void selecionarMenu() {
        Scanner leitor = new Scanner(System.in);
 
        int menu = 0;
        boolean adiciona = true;
        
        menu = leitor.nextInt();

        System.out.println("Ingrediente selecionado: " + menu);
        
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
    
    static void exibirValoresAtuais() {
        System.out.println("****************************");
        System.out.println("* MÁQUINA DE SUCO DE MACHO *");
        System.out.println("****************************");
        System.out.println("*     QUANTIDADE ATUAL     *");
        System.out.println("****************************");
        System.out.printf("* AÇUCAR:  %dml             *\n", acucarAtual);
        System.out.printf("* ÁGUA:    %dml             *\n", aguaAtual);
        System.out.printf("* SUCO:    %dml             *\n", sucoAtual);
        System.out.printf("* TOTAL:   %dml/%dml       *\n", volumeTotal, tamanhoCopo);
    }
    
    static void exibirMenuIngredientes() {
        System.out.println("****************************");
        System.out.println("* SELECIONE O INGREDIENTE  *");
        System.out.println("* 0 = Açucar               *");
        System.out.println("* 1 = Água                 *");
        System.out.println("* 2 = Suco                 *");
        System.out.println("****************************");
    }
    
}
