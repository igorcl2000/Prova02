package br.edu.iftm.banco.Bancos;

import br.edu.iftm.banco.Pessoas.Pessoa;
import br.edu.iftm.banco.Pessoas.PessoaFisica;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private Pessoa dono;
    private float saldo;
    private boolean status;
    private static int generalAccountNumber = 1;

    private static int getGeneralAccountNumber(){
        return generalAccountNumber;
    }

    private static void incrementGeneralAccountNumber(){
        generalAccountNumber++;
    }

    public ContaBanco(String tipo, Pessoa dono) {
        this.numConta = getGeneralAccountNumber();
        incrementGeneralAccountNumber();
        this.tipo = tipo;
        this.dono = dono;
        this.saldo = 0;
        this.status = true;
    }

    public ContaBanco(String tipo, Pessoa dono, float saldo) {
        this.numConta = getGeneralAccountNumber();
        incrementGeneralAccountNumber();
        this.tipo = tipo;
        this.dono = dono;
        this.saldo = saldo;
        this.status = true;
    }
    
    public ContaBanco(String tipo, Pessoa dono, float saldo, boolean status) {
        this.numConta = getGeneralAccountNumber();
        incrementGeneralAccountNumber();
        this.tipo = tipo;
        this.dono = dono;
        this.saldo = saldo;
        this.status = status;
    }

    @Override
    public String toString() {
        System.out.println("-----------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono().getNome());
        System.out.println("Tipo Dono: " + (getDono().getClass().equals(PessoaFisica.class)? "Pessoa Física":"Pessoa Jurídica"));
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
        return super.toString();
    }

    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        System.out.println("COnta aberta com sucesso.");
    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta não pode ser fechada, pois ainda tem saldo.");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta não pode ser fechada, pois esta em débito.");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso.");
        }
    }

    public void depositar(float v) {
        if (this.getStatus()) {
            // this.saldo = this.saldo + v;
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado com sucesso na conta de " + this.getDono());
        } else {
            System.out.println("Impossivel depositar em uma conta fechada.");
        }
    }

    public void sacar(float v) {
        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente para saque.");
            }
        } else {
            System.out.println("Impossivel sacar de uma conta fechada.");
        }
    }

    public void pagarMensal(){
        System.out.println("Redefina o metrodo 'pagarMensal' nas classes filhas!!!! ");
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Pessoa getDono() {
        return dono;
    }

    public void setDono(Pessoa dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
