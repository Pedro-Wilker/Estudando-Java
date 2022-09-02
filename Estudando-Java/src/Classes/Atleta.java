package Classes;

import javax.swing.*;
import java.text.NumberFormat;
import java.text.DecimalFormat;
public class Atleta {
    public int codigo;
    public String nome;
    public String esporte;
    public double valorPatrocionio;

    public void inserirDados(){
        this.codigo=Integer.parseInt(JOptionPane.showInputDialog("Digite o Codigo:"));
        this.nome= JOptionPane.showInputDialog("Digite o nome:");
        this.esporte= JOptionPane.showInputDialog("Digite o Esporte praticado:");
        this.valorPatrocionio= Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do patrocínio:"));
    }

    public double valorNovo;

    public double atualiandoValor;
    public void atualizarPatrocinio(){
        String atualizar="Novo atleta";
        atualizar += "\nCódigo: "+ this.codigo;
        atualizar +="\nNome"+ this.nome;
        atualizar +="\nEsporte"+ this.esporte;
        NumberFormat formatar = DecimalFormat.getCurrencyInstance();
        atualizar +="\nValor de patrocinio"+ this.valorPatrocionio;
        this.atualiandoValor= Double.parseDouble(JOptionPane.showInputDialog("Digite uma porcentagem nova no patrocinio"));
        atualizar += "\nNovo valor:"+this.valorNovo;
        atualiandoValor=this.valorPatrocionio * valorNovo/100;
        atualizar += atualiandoValor;
        JOptionPane.showMessageDialog(null,atualizar);

    }
    public double atualizarValor () {
        double aumento= this.valorPatrocionio * 20/100;
        this.valorPatrocionio = this.valorPatrocionio + aumento;
        return aumento;
    }

    public void mostrar(){
        String mensagem= "Objeto atleta criado a partir da classe Atleta";
        mensagem += "\nCódigo: "+ this.codigo;
        mensagem += "\nNome"+ this.nome;
        mensagem += "\nEsporte"+ this.esporte;
        NumberFormat formatar = DecimalFormat.getCurrencyInstance();
        mensagem += "\nValor de patrocinio"+ this.valorPatrocionio;
        JOptionPane.showMessageDialog(null,mensagem);
    }


}
