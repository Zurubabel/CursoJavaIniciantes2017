package maquina.suco.macho;

import java.util.Scanner;

public class MaquinaSucoMacho {
    
    static int tamanhoCopo = 500;
    static int doseAcucar = 5;
    static int doseAgua = 50;
    static int doseSuco = 10;

    // Valor atual
    static int acucarAtual = 495;
    static int aguaAtual = 0;
    static int sucoAtual = 0;
    
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
        
        while(true) {
            exibirValoresAtuais();
            exibirMenuIngredientes();
            selecionarMenu();
        }        
        
    }
    
    static String retornarNomeIngrediente(int menu) {
        String retorno = "Ingrediente selecionado: ";
        switch(menu) {
            case 1:
                retorno += "Açucar";
                break;
            case 2:
                retorno += "Água";
                break;
            case 3:
                retorno += "Suco";
                break;
        }
        return retorno;
    }
    
    static void selecionarMenu() {
        Scanner leitor = new Scanner(System.in);
 
        int menu = 0;
        
        menu = leitor.nextInt();
        System.out.println(retornarNomeIngrediente(menu));
        
        // Não exibir o menu
        if (menu == 1) { // Açucar
            if (acucarAtual == 0 && calcularVolumeTotal() + doseAcucar <= tamanhoCopo) {
                acucarAtual += doseAcucar;
            } else if (calcularVolumeTotal() + doseAcucar > tamanhoCopo && acucarAtual > 0) {
                acucarAtual -= doseAcucar;
            } else {
                adicionarRemoverIngredienteSelecionado(leitor, menu);
            }
        } else if (menu == 2) { // Agua
            if (aguaAtual == 0 && calcularVolumeTotal() + doseAgua <= tamanhoCopo) {
                aguaAtual += doseAgua;
            } else if (calcularVolumeTotal() + doseAgua > tamanhoCopo && aguaAtual > 0) {
                aguaAtual -= doseAgua;
            } else {
                adicionarRemoverIngredienteSelecionado(leitor, menu);
            }
            
        } else if (menu == 3 ) { // Suco
            if (sucoAtual == 0 && calcularVolumeTotal() + doseSuco <= tamanhoCopo) {
                sucoAtual += doseSuco;
            } else if (calcularVolumeTotal() + doseSuco > tamanhoCopo && sucoAtual > 0) {
                sucoAtual -= doseSuco;
            } else {
                adicionarRemoverIngredienteSelecionado(leitor, menu);
            }
        }   
    }
    
    static void adicionarRemoverIngredienteSelecionado(Scanner leitor, int menu) {
        System.out.println("****************************");
        System.out.println("* MÁQUINA DE SUCO DE MACHO *");
        System.out.println("****************************");
        System.out.println("*Digite:                   *");
        System.out.println("* + (Mais Ingrediente)     *");
        System.out.println("* - (Mais Ingrediente)     *");
        System.out.println("****************************");


        String adicionaRemove = leitor.next();
        boolean adiciona = adicionaRemove.equals("+");

        switch (menu) {
            case 1: // Açucar
                if (adiciona) {
                    acucarAtual += doseAcucar;
                } else {
                    acucarAtual -= doseAcucar;
                }
                break;
            case 2: // Água
                if (adiciona) {
                    aguaAtual += doseAgua;
                } else {
                    aguaAtual -= doseAgua;
                }
                break;           
            case 3: // Suco
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
        System.out.printf("* TOTAL:   %dml/%dml       *\n", calcularVolumeTotal(), tamanhoCopo);
    }
    
    static void exibirMenuIngredientes() {
        System.out.println("****************************");
        System.out.println("* SELECIONE O INGREDIENTE  *");
        System.out.println("* 1 = Açucar               *");
        System.out.println("* 2 = Água                 *");
        System.out.println("* 3 = Suco                 *");
        System.out.println("****************************");
    }
    
    static int calcularVolumeTotal() {
        return acucarAtual + aguaAtual + sucoAtual;
    }
    
}
