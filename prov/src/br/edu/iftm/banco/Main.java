package br.edu.iftm.banco;

import br.edu.iftm.banco.BancoDados.DataManager;
import br.edu.iftm.banco.Menus.Cadastro;
import br.edu.iftm.banco.Pessoas.PessoaFisica;
import br.edu.iftm.banco.Pessoas.PessoaJuridica;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws Exception {
        Cadastro menu = new Cadastro();

        menu.menu();

    }
}
