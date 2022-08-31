import javax.swing.JOptionPane;

public class Recursividade {
    public static void main(String[] args) {
        int num= Integer.parseInt(JOptionPane.showInputDialog("Digite um número para cáculo do fatorial "));
        long resposta=1;
        int contador=num;
        while (num>1){
            resposta= resposta * num;
            System.out.println("Valor do fatorial "+contador+" é=" + resposta);
            contador--;
            num--;
        }
        System.out.println("O fatoria vezes 1 é: "+ resposta);
    }
}
