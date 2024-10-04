package classes;

public class Vendedor extends Funcionario {
    private double totalVendas;

    public Vendedor(String nome, String rg, double salario) {
        super(nome, rg, salario);
        this.totalVendas = 0;
    }

    public void registrarVenda(double valor) {
        totalVendas += valor;
    }
    @Override
    public double calcularHolerite() {
        double comissao = totalVendas * 0.05;
        return salario + comissao;
    }

    public double getTotalVendas() {
        return totalVendas;
    }
}