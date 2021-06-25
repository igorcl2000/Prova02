package br.edu.iftm.banco.Pessoas;

import java.util.Date;
import java.util.Objects;

public class PessoaFisica extends Pessoa {
    private String cpf;
    private String nacimento;

    public PessoaFisica(String nome, String endereco, String cpf, String nacimento) {
        super(nome,endereco);
        this.cpf = cpf;
        this.nacimento = nacimento;
    }

    public PessoaFisica(String nome, String apelido, String endereco, Date dataRegistro, Boolean pessoaAtiva, String cpf, String nacimento) {
        super(nome,apelido,endereco,dataRegistro,pessoaAtiva);
        this.cpf = cpf;
        this.nacimento = nacimento;
    } 

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNacimento() {
        return nacimento;
    }

    public void setNacimento(String nacimento) {
        this.nacimento = nacimento;
    }

    @Override
    public void deactivatePerson() {
        setPessoaAtiva(false);
        
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof PessoaFisica)) {
            return false;
        }
        PessoaFisica pessoaFisica = (PessoaFisica) o;
        return Objects.equals(cpf, pessoaFisica.cpf) && Objects.equals(nacimento, pessoaFisica.nacimento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf, nacimento);
    }


    @Override
    public String toString() {
        System.out.println("-------------------------");
        System.out.println("SOBRE: " + this.getNome());
        System.out.println("Nacimento: " + this.getNacimento());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Situação: " + (this.getPessoaAtiva()?"Ativa":"Desativada"));
        return super.toString();
    }

}
