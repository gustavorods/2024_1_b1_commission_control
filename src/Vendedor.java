import javax.swing.*;

public class Vendedor {
    // Atributo
    private String nome;
    private Double salarioBase;

    // Inicializando vaziu
    public Vendedor() {
        this("", 0);
    }

    // Inicializando cheio
    public Vendedor(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    //getter e setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    // Método
    public double CalculoComissao(double valorVendido) {
        this.setNome(JOptionPane.showInputDialog("Qual é o seu nome? "));
        this.setSalarioBase(Double.parseDouble(JOptionPane.showInputDialog("Qual é o seu salário base? ")));;
        return this.getSalarioBase() + (valorVendido / 100 * 10);
    }
}
