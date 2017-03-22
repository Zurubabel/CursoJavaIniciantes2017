package maquina.suco.macho.suco;


public class CopoSuco {
    
    private int tamanhoCopo;
    private int acucarAtual;
    private int aguaAtual;
    private int sucoAtual;
    
    public CopoSuco() {
        this.tamanhoCopo = 300;
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
