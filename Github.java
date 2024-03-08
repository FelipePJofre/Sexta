import javax.swing.JOptionPane;

public class Github {
    public static void main(String[] args) {
        double primeiro = Double.parseDouble (JOptionPane.showInputDialog("Diga o numero"));
        double segundo = Double.parseDouble (JOptionPane.showInputDialog("Diga o segundo numero"));
        double soma = primeiro + segundo;
        JOptionPane.showMessageDialog(null, "A soma é: " + soma);
       

    }
}







