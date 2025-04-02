import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("--- Banco ----- \n");
        // Instancia e preenche Funcionario
        String cpf = JOptionPane.showInputDialog("Digite o CPF do Funcionário");
        Funcionario func1 = new Funcionario(cpf);
        func1.setNome(
            JOptionPane.showInputDialog("Digite o nome do funcionário")
        );
        String salario = JOptionPane.showInputDialog("Digite o valor do salário");
        func1.setSalario(Double.parseDouble(salario));
        JOptionPane.showMessageDialog(null, func1.toString());
        // Instancia e preenche gerente
        cpf = JOptionPane.showInputDialog("Digite o CPF do Gerente");
        String senha = JOptionPane.showInputDialog("Digite a senha do gerente");
        Gerente g1 = new Gerente(cpf, senha);
        g1.setNome(
            JOptionPane.showInputDialog("Digite o nome do gerente")
        );
        salario = JOptionPane.showInputDialog("Digite o salário do gerente");
        g1.setSalario(Double.parseDouble(salario));
        JOptionPane.showMessageDialog(null, "\n Dados de Gerente" +
                                     g1.toString());

        JOptionPane.showMessageDialog(null,g1.getBonificacao());
    }
}
