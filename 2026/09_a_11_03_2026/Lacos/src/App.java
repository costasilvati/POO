import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) throws Exception {
         int num3 = 0, soma = 0;
         do{
            num3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor?"));
            soma += num3;
        }while(num3 > 0);
        JOptionPane.showMessageDialog(null,"Soma total: " + soma);
    }
}
