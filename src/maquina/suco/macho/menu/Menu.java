package maquina.suco.macho.menu;

import java.util.Scanner;
import maquina.suco.macho.suco.CopoSuco;

public class Menu {
    
    private static final int MENU_ACUCAR = 1;
    private static final int MENU_AGUA = 2;
    private static final int MENU_SUCO = 3;
    
    private CopoSuco suco;
    
    public Menu() {
        this.suco = new CopoSuco();
    }
    
    public void selecionarMenu() {
        Scanner leitor = new Scanner(System.in);
 
        int menu = 0;
        
        menu = leitor.nextInt();
        System.out.println(retornarNomeIngrediente(menu));
        
        // Não exibir o menu
        switch (menu) {
            case MENU_ACUCAR:
                if (this.suco.getAcucarAtual() == 0) {
                    acucarAtual += doseAcucar;
                } else {
                    adicionarRemoverIngredienteSelecionado(leitor, menu);
                }   
                break;
            case MENU_AGUA:
                if (this.suco.getAguaAtual() == 0) {
                    aguaAtual += doseAgua;
                } else {
                    adicionarRemoverIngredienteSelecionado(leitor, menu);
                }   
                break;
            case MENU_SUCO:
                if (this.suco.getSucoAtual() == 0) {
                    sucoAtual += doseSuco;   
                } else {
                    adicionarRemoverIngredienteSelecionado(leitor, menu);
                }   
                break;
            default:
                break;
        }
    }
    
    public void adicionarRemoverIngredienteSelecionado(Scanner leitor, int menu) {
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
            case MENU_ACUCAR: 
                if (adiciona) {
                    acucarAtual += doseAcucar;
                } else {
                    acucarAtual -= doseAcucar;
                }
                break;
            case MENU_AGUA: 
                if (adiciona) {
                    aguaAtual += doseAgua;
                } else {
                    aguaAtual -= doseAgua;
                }
                break;           
            case MENU_SUCO:
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
    
    public void exibirValoresAtuais() {
        System.out.println("****************************");
        System.out.println("* MÁQUINA DE SUCO DE MACHO *");
        System.out.println("****************************");
        System.out.println("*     QUANTIDADE ATUAL     *");
        System.out.println("****************************");
        System.out.printf("* AÇUCAR:  %dml             *\n", acucarAtual);
        System.out.printf("* ÁGUA:    %dml             *\n", aguaAtual);
        System.out.printf("* SUCO:    %dml             *\n", sucoAtual);
        System.out.printf("* TOTAL:   %dml/%dml       *\n", calcularVolumeTotal(), tamanhoCopo);
        if (calcularVolumeTotal() > tamanhoCopo) {
            System.out.println("*  !! QUANTIDADE EXCEDIDA !! *");
        }
    }
    
    public void exibirMenuIngredientes() {
        System.out.println("****************************");
        System.out.println("* SELECIONE O INGREDIENTE  *");
        System.out.println("* 1 = Açucar               *");
        System.out.println("* 2 = Água                 *");
        System.out.println("* 3 = Suco                 *");
        System.out.println("****************************");
    }
    
    private String retornarNomeIngrediente(int menu) {
        String retorno = "Ingrediente selecionado: ";
        switch(menu) {
            case MENU_ACUCAR:
                retorno += "Açucar";
                break;
            case MENU_AGUA:
                retorno += "Água";
                break;
            case MENU_SUCO:
                retorno += "Suco";
                break;
        }
        return retorno;
    }
    
}
