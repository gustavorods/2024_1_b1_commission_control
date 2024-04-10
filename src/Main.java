import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //Variáveis
        double salarioDoVendedor, valorProduto;

        // Criando uma instância da classe
        Vendedor vendedor = new Vendedor();

        // Calculador a commissão
        valorProduto = Double.parseDouble(JOptionPane.showInputDialog("Qual foi o valor do produto vendido?"));
        salarioDoVendedor = vendedor.CalculoComissao(valorProduto);

        // Mostrar salário
        JOptionPane.showMessageDialog(null, "Olá " + vendedor.getNome() + ", seu salário é: " + salarioDoVendedor +
                "\n Salário padrão: " + vendedor.getSalarioBase() +
                "\n Commisão (10% do valor do produto): " + (valorProduto / 100 * 10));
    }
}