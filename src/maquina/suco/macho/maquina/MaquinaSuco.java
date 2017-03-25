package maquina.suco.macho.maquina;

import maquina.suco.macho.menu.Menu;
import maquina.suco.macho.suco.CopoSuco;

public class MaquinaSuco {
    
    private int doseAcucar;
    private int doseAgua;
    private int doseSuco;
    
    private Menu menu;
    
    private CopoSuco copoSuco;
    
    public MaquinaSuco() {
        this.doseAcucar = 5;
        this.doseAgua = 50;
        this.doseSuco = 10;
        iniciarCopoSuco();
        iniciarMenu();
    }
    
    public void exibirMenu() {
        this.menu.exibirMenuIngredientes();
    }
        
    public void iniciarSistemaMaquina() {
        iniciarCopoSuco();
        iniciarMenu();
    }
    
    
    private void iniciarCopoSuco() {
        if (copoSuco == null) {
            this.copoSuco = new CopoSuco();
        }
    }
    
    public void iniciarMenu() {
        if (this.menu == null) {
            this.menu = new Menu(this.copoSuco, this);
        }
    }

    public int getDoseAcucar() {
        return doseAcucar;
    }

    public void setDoseAcucar(int doseAcucar) {
        this.doseAcucar = doseAcucar;
    }

    public int getDoseAgua() {
        return doseAgua;
    }

    public void setDoseAgua(int doseAgua) {
        this.doseAgua = doseAgua;
    }

    public int getDoseSuco() {
        return doseSuco;
    }

    public void setDoseSuco(int doseSuco) {
        this.doseSuco = doseSuco;
    }
    
    
    
}
