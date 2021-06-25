package br.edu.iftm.banco.Pessoas;

import java.util.Date;
import java.util.Objects;

public class PessoaJuridica extends Pessoa {
    private String CNPJ;

    public PessoaJuridica(String nome, String endereco, String CNPJ) {
        super(nome,endereco);
        this.CNPJ = CNPJ;
    }

    public PessoaJuridica(String nome, String apelido, String endereco, Date dataRegistro, Boolean pessoaAtiva, String CNPJ) {
        super(nome,apelido,endereco,dataRegistro,pessoaAtiva);
        this.CNPJ = CNPJ;
    } 

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    @Override
    public String toString() {
        System.out.println("-------------------------");
        System.out.println("SOBRE: " + this.getNome());
        System.out.println("CNPJ: " + this.getCNPJ());
        System.out.println("Situação: " + (this.getPessoaAtiva()?"Ativa":"Desativada"));
        return super.toString();
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof PessoaJuridica)) {
            return false;
        }
        PessoaJuridica pessoaJuridica = (PessoaJuridica) o;
        return Objects.equals(CNPJ, pessoaJuridica.CNPJ);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(CNPJ);
    }


    @Override
    public void deactivatePerson() {
        setPessoaAtiva(false);
        
    }

}
