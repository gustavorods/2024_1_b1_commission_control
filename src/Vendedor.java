import javax.swing.*;

public class Vendedor {
    // Atributo
    private String nome;
    private double salarioBase;
    private double taxaDaEmpresa;

    // Inicializando vaziu
    public Vendedor() {
        this("", 0, 0);
    }

    // Inicializando cheio
    public Vendedor(String nome, double salarioBase, double taxaDaEmpresa) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.taxaDaEmpresa = taxaDaEmpresa;
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

    public Double getTaxaDaEmpresa() {
        return taxaDaEmpresa;
    }

    public void setTaxaDaEmpresa(Double taxaDaEmpresa) {
        this.taxaDaEmpresa = taxaDaEmpresa;
    }

    // Método
    // Cadastrar dados
    public void CadastrarDados() {
        this.setNome(JOptionPane.showInputDialog("Qual é o seu Nome?"));
        this.setSalarioBase(Double.parseDouble(JOptionPane.showInputDialog("Qual é o seu salário base?")));
        this.setTaxaDaEmpresa(Double.parseDouble(JOptionPane.showInputDialog("Qual é a taxa de comissão da sua empresa?")));
    }

    // Alterar dados
    public void AlterarDados(String decisaoCliente) {
        switch (decisaoCliente) {
            case "Nome":
                this.setNome(JOptionPane.showInputDialog("Qual é o seu Nome?"));
                break;
            case "Salario base":
                this.setSalarioBase(Double.parseDouble(JOptionPane.showInputDialog("Qual é o seu salário base?")));
                break;
            case "Taxa da empresa":
                this.setTaxaDaEmpresa(Double.parseDouble(JOptionPane.showInputDialog("Qual é a taxa de comissão da sua empresa?")));
                break;
        }
    }

    // Mostrar dados
    public void MostrarDados() {
        JOptionPane.showMessageDialog(null, "Suas informações: \n" +
                "Nome: " + this.getNome() + "\n" +
                "Salario base: " + this.getSalarioBase() + "\n" +
                "Taxa da empresa: " + this.getTaxaDaEmpresa());
    }
}
