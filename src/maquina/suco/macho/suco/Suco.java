package maquina.suco.macho.suco;


public class Suco {
    
    private int tamanhoCopo;
    private int doseAcucar;
    private int doseAgua;
    private int doseSuco;
    
    private int acucarAtual;
    private int aguaAtual;
    private int sucoAtual;
    
    public Suco() {
        this.tamanhoCopo = 500;
        this.doseAcucar = 5;
        this.doseAgua = 50;
        this.doseSuco = 10;
        
        this.acucarAtual = 0;
        this.aguaAtual = 0;
        this.sucoAtual = 0;
    }
    
    public int calcularVolumeTotal() {
        return this.acucarAtual + this.aguaAtual + this.sucoAtual;
    }

    public int getTamanhoCopo() {
        return tamanhoCopo;
    }

    public void setTamanhoCopo(int tamanhoCopo) {
        this.tamanhoCopo = tamanhoCopo;
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

    public int getAcucarAtual() {
        return acucarAtual;
    }

    public void setAcucarAtual(int acucarAtual) {
        this.acucarAtual = acucarAtual;
    }

    public int getAguaAtual() {
        return aguaAtual;
    }

    public void setAguaAtual(int aguaAtual) {
        this.aguaAtual = aguaAtual;
    }

    public int getSucoAtual() {
        return sucoAtual;
    }

    public void setSucoAtual(int sucoAtual) {
        this.sucoAtual = sucoAtual;
    }
    
    
}
