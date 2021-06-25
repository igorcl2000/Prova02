package br.edu.iftm.banco.Menus;

import br.edu.iftm.banco.Bancos.ContaBanco;
import br.edu.iftm.banco.Bancos.ContaCorrente;
import br.edu.iftm.banco.Bancos.ContaPoupanca;
import br.edu.iftm.banco.Canetas.Caneta;
import br.edu.iftm.banco.Essentials.PrintScan;
import br.edu.iftm.banco.Pessoas.Pessoa;
import br.edu.iftm.banco.Pessoas.PessoaFisica;
import br.edu.iftm.banco.Pessoas.PessoaJuridica;

public class Cadastro {

    private Pessoa identidade = null;
    private ContaBanco conta = null;
    private Caneta caneta = null;
    
    public Cadastro(){

    }

    public void menu() {
        this.identidade = createPessoaFisica();
        this.conta = createContaCorrente();

        this.identidade.toString();
        this.conta.toString();
        createContaPoupanca().toString();

        this.identidade = createPessoaJuridica();
        this.conta = createContaCorrente();
        this.identidade.toString();
        this.conta.toString();
        createContaPoupanca().toString();
    }

    private Pessoa createPessoaFisica() {
        
        return new PessoaFisica(PrintScan.getString("Digite o Nome da Pessoa:. "), PrintScan.getString("Digite o endereço da Pessoa Física"),PrintScan.getString("Digite o Cpf da Pessoa:. "), PrintScan.getString("Digite a data de nascimento da pessoa:. "));

    }

    private Pessoa createPessoaJuridica() {
        
        return new PessoaJuridica(PrintScan.getString("Digite o Nome da Empresa:. "), PrintScan.getString("Digite o endereço da empresa:. "),PrintScan.getString("Digite o CNPJ da empresa:. "));

    }

    private ContaBanco createContaCorrente() {
        
        return new ContaCorrente(identidade);
    }

    private ContaBanco createContaPoupanca() {
        
        return new ContaPoupanca(identidade);
    }

    private Caneta createCaneta() {
        
        return new Caneta(PrintScan.getString("Digite o modelo da caneta a ser recebida:. "),PrintScan.getString("Digite o tamanho da ponta da caneta a ser recebida:. "), PrintScan.getString("Digite a cor da caneta a ser recebida:. "));

    }
}
