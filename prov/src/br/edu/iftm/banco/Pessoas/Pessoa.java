package br.edu.iftm.banco.Pessoas;

import java.util.Date;
import java.util.Objects;

public abstract class Pessoa {
    private String nome;
    private String Apelido;
    private String endereco;
    private Date dataRegistro;
    private Boolean pessoaAtiva;

    public Pessoa(String nome, String endereco) {
        this.nome = nome;
        this.Apelido = nome;
        this.endereco = endereco;
        this.dataRegistro = new Date();
        this.pessoaAtiva = true;
    }

    public Pessoa(String nome, String endereco, Boolean pessoaAtiva) {
        this.nome = nome;
        this.Apelido = nome;
        this.endereco = endereco;
        this.dataRegistro = new Date();
        this.pessoaAtiva = pessoaAtiva;
    }

    public Pessoa(String nome, String endereco, Date dataRegistro, Boolean pessoaAtiva) {
        this.nome = nome;
        this.Apelido = nome;
        this.endereco = endereco;
        this.dataRegistro = dataRegistro;
        this.pessoaAtiva = pessoaAtiva;
    }

    public Pessoa(String nome, String Apelido, String endereco, Date dataRegistro, Boolean pessoaAtiva) {
        this.nome = nome;
        this.Apelido = Apelido;
        this.endereco = endereco;
        this.dataRegistro = dataRegistro;
        this.pessoaAtiva = pessoaAtiva;
    }

    public abstract void deactivatePerson();

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return this.Apelido;
    }

    public void setApelido(String Apelido) {
        this.Apelido = Apelido;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Date getDataRegistro() {
        return this.dataRegistro;
    }

    public void setDataRegistro(Date dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public Boolean isPessoaAtiva() {
        return this.pessoaAtiva;
    }

    public Boolean getPessoaAtiva() {
        return this.pessoaAtiva;
    }

    public void setPessoaAtiva(Boolean pessoaAtiva) {
        this.pessoaAtiva = pessoaAtiva;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Pessoa)) {
            return false;
        }
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(nome, pessoa.nome) && Objects.equals(Apelido, pessoa.Apelido) && Objects.equals(endereco, pessoa.endereco) && Objects.equals(dataRegistro, pessoa.dataRegistro) && Objects.equals(pessoaAtiva, pessoa.pessoaAtiva);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, Apelido, endereco, dataRegistro, pessoaAtiva);
    }


}
