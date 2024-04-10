import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Variaveis
        int stop = 0;
        String opcoes[] = {"Cadastrar dados", "Alterar dados", "Mostrar dados", "Mostrar salário final", "Sair"};
        String opcoesAlteramento[] = {"Nome", "Salario base", "taxa da empresa"};
        String decisao, decisaoAlteramento;

        // Instâncias
        Vendedor vendedor = new Vendedor();

        // Escolhendo as opções
        while (stop < 1) {
            decisao = (String) JOptionPane.showInputDialog(
                null,
                    "Escolha uma opção",
                    "Caixa de escolha",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opcoes,
                    opcoes[0]
            );

            switch (decisao) {
                case "Cadastrar dados":
                    vendedor.CadastrarDados();
                    break;
                case "Alterar dados":
                    decisaoAlteramento = (String) JOptionPane.showInputDialog(
                            null,
                            "Escolha uma opção",
                            "Caixa de escolha",
                            JOptionPane.QUESTION_MESSAGE,
                            null,
                            opcoesAlteramento,
                            opcoesAlteramento[0]
                    );
                    vendedor.AlterarDados(decisaoAlteramento);
                case "Mostrar dados":
                    vendedor.MostrarDados();
                case "Mostrar salário final":
                    break;
                case "Sair":
                    stop++;
                    break;
            }
        }
    }
}