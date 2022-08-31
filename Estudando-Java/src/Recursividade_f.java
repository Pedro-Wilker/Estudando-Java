import javax.swing.JOptionPane;
import java.sql.SQLOutput;

public class Recursividade_f {
    public static long fatorial(int num){
        if (num==0 || num==1){
            return 1;
        }
        else {
            return num * fatorial(num -1);
        }
    }

    public static void main(String[] args) {
        int num= Integer.parseInt(JOptionPane.showInputDialog("Digite um número para cálculo do Fatorial"));
        long resposta= fatorial(num);
        System.out.println("O Fatorial de "+ num + " é: "+ resposta);
    }
}
