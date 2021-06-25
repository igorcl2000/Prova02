package br.edu.iftm.banco.Bancos;

import br.edu.iftm.banco.Pessoas.Pessoa;

public class ContaCorrente extends ContaBanco {
    

    public ContaCorrente(Pessoa dono) {
        super("CC", dono);
    }

    @Override
    public void pagarMensal(){
        
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - 12);
            System.out.println("Mensalidade paga com sucesso por " + this.getDono().getNome());
        } else {
            System.out.println("Impossivel pagar uma conta fechada!");
        }

    }


}
