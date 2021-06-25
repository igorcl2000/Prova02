package br.edu.iftm.banco.Bancos;

import br.edu.iftm.banco.Pessoas.Pessoa;

public class ContaPoupanca extends ContaBanco {
    

    public ContaPoupanca(Pessoa dono) {
        super("CP", dono);
    }

    @Override
    public void pagarMensal(){
        
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - 20);
            System.out.println("Mensalidade paga com sucesso por " + this.getDono().getNome());
        } else {
            System.out.println("Impossivel pagar uma conta fechada!");
        }

    }


}
