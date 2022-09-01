package Classes;

import javax.swing.*;
import java.text.NumberFormat;
import java.util.Locale;
public class Atleta {
    Locale localeBR = new Locale("pt","BR");
    NumberFormat numberFormat = NumberFormat.getNumberInstance(localeBR);
    public int codigo;
    public String nome;
    public String esporte;
    public double valorPatrocionio;
    public void atualizarValor (double taxa) {
        this.valorPatrocionio = this.valorPatrocionio + (this.valorPatrocionio * taxa/100);
    }
    public void mostrar(){
        JOptionPane.showMessageDialog(null,"O atleta "+nome+" atleta de"+ esporte+"/n"+
        "Seu codigo:"+codigo+"/n"+"O valor do patrocinio: R$" +numberFormat.format(valorPatrocionio));
    }
}
