package br.edu.iftm.banco.Canetas;
public class Caneta {
    public String modelo;
    private String tamanho;
    private String cor;
    private boolean tampada;

    public Caneta(String modelo, String tamanho, String cor) {
        this.modelo = modelo;
        this.tamanho = tamanho;
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public void status() {
        System.out.println("-------------------------");
        System.out.println("SOBRE A CANETA:");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getTamanho());
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
    }

}