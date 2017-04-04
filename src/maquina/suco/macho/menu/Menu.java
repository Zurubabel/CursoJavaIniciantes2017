package maquina.suco.macho.menu;

import java.util.Scanner;
import maquina.suco.macho.maquina.MaquinaSuco;
import maquina.suco.macho.suco.CopoSuco;

public class Menu {
    
    private static final int MENU_ACUCAR = 1;
    private static final int MENU_AGUA = 2;
    private static final int MENU_SUCO = 3;
    
    private CopoSuco copoSuco;
    
    private MaquinaSuco maquinaSuco;

    public MaquinaSuco getMaquinaSuco() {
        return maquinaSuco;
    }
    
    public Menu(CopoSuco copoSuco, MaquinaSuco maquinaSuco) {
        this.copoSuco = copoSuco;
        this.maquinaSuco = maquinaSuco;
    }
    
    public void selecionarMenu() {
        Scanner leitor = new Scanner(System.in);
 
        int menu = 0;
        
        menu = leitor.nextInt();
        System.out.println(retornarNomeIngrediente(menu));
        
        // Não exibir o menu
        switch (menu) {
            case MENU_ACUCAR:
                if (this.copoSuco.getAcucarAtual() == 0) {
                    this.getCopoSuco().dosarIngrediente(CopoSuco.ACUCAR, getMaquinaSuco().getDoseAcucar());
                } else {
                    adicionarRemoverIngredienteSelecionado(leitor, menu);
                }   
                break;
            case MENU_AGUA:
                if (this.copoSuco.getAguaAtual() == 0) {
                    this.getCopoSuco().dosarIngrediente(CopoSuco.AGUA,  getMaquinaSuco().getDoseAgua());
                } else {
                    adicionarRemoverIngredienteSelecionado(leitor, menu);
                }   
                break;
            case MENU_SUCO:
                if (this.copoSuco.getSucoAtual() == 0) {
                    this.getCopoSuco().dosarIngrediente(CopoSuco.SUCO, getMaquinaSuco().getDoseSuco());   
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
                    this.copoSuco.dosarIngrediente(CopoSuco.ACUCAR, this.maquinaSuco.getDoseAcucar());
                } else {
                    this.copoSuco.dosarIngrediente(CopoSuco.ACUCAR, this.maquinaSuco.getDoseAcucar() * -1);
                }
                break;
            case MENU_AGUA: 
                if (adiciona) {
                    this.copoSuco.dosarIngrediente(CopoSuco.AGUA, this.maquinaSuco.getDoseAgua());
                } else {
                    this.copoSuco.dosarIngrediente(CopoSuco.AGUA, this.maquinaSuco.getDoseAgua() * -1);
                }
                break;           
            case MENU_SUCO:
                if (adiciona) {
                    this.copoSuco.dosarIngrediente(CopoSuco.SUCO, this.maquinaSuco.getDoseSuco());
                } else {
                    this.copoSuco.dosarIngrediente(CopoSuco.SUCO, this.maquinaSuco.getDoseSuco() * -1);
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
        System.out.printf("* AÇUCAR:  %dml             *\n", this.copoSuco.getAcucarAtual());
        System.out.printf("* ÁGUA:    %dml             *\n", this.copoSuco.getAguaAtual());
        System.out.printf("* SUCO:    %dml             *\n", this.copoSuco.getSucoAtual());
        System.out.printf("* TOTAL:   %dml/%dml       *\n", this.copoSuco.calcularVolumeTotal(), this.copoSuco.getTamanhoCopo());
        if (this.copoSuco.calcularVolumeTotal() > this.copoSuco.getTamanhoCopo()) {
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
    
    public CopoSuco getCopoSuco() {
        return this.copoSuco;
    }

    void funcionalidadePrincipal() {
        
    }
}
